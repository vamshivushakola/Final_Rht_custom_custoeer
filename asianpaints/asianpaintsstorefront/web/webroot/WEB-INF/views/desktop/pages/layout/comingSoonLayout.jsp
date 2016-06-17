<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- <c:url value="/coming-soon/products" var ="productpage"/>
<c:url value="/coming-soon/products/Save" var="saveCustomerData"/> --%>

<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages/>
	</div>

	<div id="productNotifyDiv">
		<div id="resultDivID">
			<input type="text" id="resultTextID" name="resultText"
				style="display: none; border: none; font-weight: bold; width: 350px;"
				readonly="readonly" />
		</div>
		<c:forEach items="${produtList}" var="product">

			<table>
				<tr>
					<td style="padding-right: 20px;"><img src="${product.thumbnail.url}" alt="${product.thumbnail.altText}"	title="${product.thumbnail.altText}" /></td>
					
					<td width="60%"><b>${product.name}</b>
						<div>${product.summary}</div></td>
						
					<td><input type="reset" id="notifyMe_${product.code}"
						value="Notify Me" onclick="openForm(${product.code})" style="width: 120px; height: 40px; background-color: #454545; color: white; " /></td>
						
					<td width="50%">

						<div id="notifyId_${product.code}" style="display: none">

							<form id="saveCustomerDataForm_${product.code}">
								<p>Please provide the details...</p>

								<table>
									<tr>
										<td>First Name : </td>
										<td><input type="text" class="text" name="firstName" /></td>
									</tr>
									<tr>
										<td>Last Name : </td>
										<td><input type="text" class="text" name="lastName" /></td>
									</tr>
									<tr>
										<td>Email Id : </td>
										<td><input type="text" class="text" name="emailId" /></td>
									</tr>
									
									
									<tr>
										<td>Phone No</td>
										<td><input type="text" class="text" name="phoneNo" /></td>
									</tr>
									
									<tr>
										<td>Product Code : </td>
										<td><input type="text" class="text" name="productCode"
											value="${product.code}" readonly="readonly" /></td>
									</tr>
									<tr>
										<td>Product Name : </td>
										<td><input type="text" class="text" name="productName"
											value="${product.name}" readonly="readonly" /></td>
									</tr>
									<tr height="50px">
										<td><input type="reset" value="Save"
											onclick="formsubmit(${product.code})" style="width: 80px; height: 30px; background-color: #555555; color: white;" /></td>
										<td><input type="reset" value="Cancel"
											onclick="cancelform(${product.code})" style="width: 80px; height: 30px; background-color: #555555; color: white;"/></td>
									</tr>
								</table>
							</form>
						</div>
					</td>
				</tr>
			</table>
			<br>
		</c:forEach>
	</div>
	<script type="text/javascript" src="${commonResourcePath}/js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript">
			function formsubmit(code) 
				{  

					 try{
						 	var str = $("#saveCustomerDataForm_"+code).serialize();
						 	$.ajax({  
							     type 	 : "POST",  
							     data	 : str,
							     url 	 : "<c:url value='/coming-soon/products/Save'/>", 
							     success : function(result) 
							     { 
							    	 
							    	 $("#resultTextID").val(result);
										$("#resultTextID").css({
										'display' : "block" 
										});
										
									 if(result.search("Saved") != -1){
								    		 $("#resultTextID").css({
													'color' : "green" 
													});	 
								     }else{
								    	 $("#resultTextID").css({
								    			 'color' : "red" 
													});
								    	 }
										
							     },
							    error : function()
							    {
							     	alert("Error");
							    }
						   });  
					 }
					 catch(e)
					 {
						 alert("Error>>"+e);
					 }
					 return false;
			}
	</script>
		
		<script type="text/javascript">
		function openForm(code) {
			$("#notifyId_"+code).css({
				'display' : "block"
			});
			$("#notifyMe_"+code).css({
				'display' : "none"
			});
			document.getElementById("resultTextID").value = ""; 
			 $("#resultTextID").css({ 
			      'display' : "none"  });
		}
		
		function cancelform(code) {
			$("#notifyId_"+code).css({
				'display' : "none"
			});
			$("#notifyMe_"+code).css({
				'display' : "block"
			});
			document.getElementById("resultTextID").value = ""; 
			 $("#resultTextID").css({ 
			      'display' : "none"  });
			
		}
	</script> 
	
</template:page>