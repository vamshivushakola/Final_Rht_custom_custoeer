/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 17, 2016 2:53:52 PM                     ---
 * ----------------------------------------------------------------
 */
package com.hybris.vivocha.jalo;

import com.hybris.vivocha.constants.VivochaConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.hybris.vivocha.jalo.CustomerSegmentVivochaComponent CustomerSegmentVivochaComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomerSegmentVivochaComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute **/
	public static final String SEGMENTNAME = "segmentname";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SEGMENTNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute.
	 * @return the segmentname - Segment name
	 */
	public String getSegmentname(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomerSegmentVivochaComponent.getSegmentname requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SEGMENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute.
	 * @return the segmentname - Segment name
	 */
	public String getSegmentname()
	{
		return getSegmentname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute. 
	 * @return the localized segmentname - Segment name
	 */
	public Map<Language,String> getAllSegmentname(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SEGMENTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute. 
	 * @return the localized segmentname - Segment name
	 */
	public Map<Language,String> getAllSegmentname()
	{
		return getAllSegmentname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute. 
	 * @param value the segmentname - Segment name
	 */
	public void setSegmentname(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomerSegmentVivochaComponent.setSegmentname requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SEGMENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute. 
	 * @param value the segmentname - Segment name
	 */
	public void setSegmentname(final String value)
	{
		setSegmentname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute. 
	 * @param value the segmentname - Segment name
	 */
	public void setAllSegmentname(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SEGMENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerSegmentVivochaComponent.segmentname</code> attribute. 
	 * @param value the segmentname - Segment name
	 */
	public void setAllSegmentname(final Map<Language,String> value)
	{
		setAllSegmentname( getSession().getSessionContext(), value );
	}
	
}
