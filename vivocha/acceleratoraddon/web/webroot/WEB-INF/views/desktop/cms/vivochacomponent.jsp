<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${cmsPageRequestContextData.liveEdit}">
	<div id="vivochaComponentLiveEditMarker">
		<spring:theme code="vivocha.liveEditMarkerLabel"/>
	</div>
</c:if>

<c:choose>
        <c:when test="${accountLink != null}">
                <script src="//${accountLink}/a/${accountName}/api/vivocha.js"></script>
        </c:when>
        <c:otherwise>
                <script src="//www.vivocha.com/a/${accountName}/api/vivocha.js"></script>
        </c:otherwise>
</c:choose>

<script type="text/javascript">
	vivocha.ready(function() {
		var hybrisData = [
	   		{
	   			name: "userid",
	   			desc: "User ID",
	   			value: "${userid}",
	   			visible: true,
	   			type: "email"
	   		},
	   		{
	   			name: "userName",
	   			desc: "User Name",
	   			value: "${userName}",
	   			visible: true,
	   			type: "nickname"
	   		},
	   		{
	   			name: "firstName",
	   			desc: "First Name",
	   			value: "${customerFirstName}",
	   			visible: false,
	   			type: "firstname"
	   		},
	   		{
	   			name: "lastName",
	   			desc: "Last Name",
	   			value: "${customerLastName}",
	   			visible: false,
	   			type: "lastname"
	   		},
	   		{
	   			name: "cartid",
	   			desc: "Cart ID",
	   			value: "${cartid}",
	   			visible: true,
	   			type: "text"
	   		}
	   	];
		
		vivocha.api.setNickname("${userName}");
		vivocha.api.setData({
			name: "hybrisData",
			desc: "Customer Info",
			data: hybrisData
		});
	});
</script>
