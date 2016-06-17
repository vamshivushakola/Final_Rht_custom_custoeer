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
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.hybris.vivocha.jalo.VivochaComponent VivochaComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVivochaComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>VivochaComponent.accountName</code> attribute **/
	public static final String ACCOUNTNAME = "accountName";
	/** Qualifier of the <code>VivochaComponent.accountLink</code> attribute **/
	public static final String ACCOUNTLINK = "accountLink";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCOUNTNAME, AttributeMode.INITIAL);
		tmp.put(ACCOUNTLINK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivochaComponent.accountLink</code> attribute.
	 * @return the accountLink - Your Vivocha World (default www.vivocha.com)
	 */
	public String getAccountLink(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTLINK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivochaComponent.accountLink</code> attribute.
	 * @return the accountLink - Your Vivocha World (default www.vivocha.com)
	 */
	public String getAccountLink()
	{
		return getAccountLink( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivochaComponent.accountLink</code> attribute. 
	 * @param value the accountLink - Your Vivocha World (default www.vivocha.com)
	 */
	public void setAccountLink(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTLINK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivochaComponent.accountLink</code> attribute. 
	 * @param value the accountLink - Your Vivocha World (default www.vivocha.com)
	 */
	public void setAccountLink(final String value)
	{
		setAccountLink( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivochaComponent.accountName</code> attribute.
	 * @return the accountName - Your Vivocha account name
	 */
	public String getAccountName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCOUNTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VivochaComponent.accountName</code> attribute.
	 * @return the accountName - Your Vivocha account name
	 */
	public String getAccountName()
	{
		return getAccountName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivochaComponent.accountName</code> attribute. 
	 * @param value the accountName - Your Vivocha account name
	 */
	public void setAccountName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCOUNTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VivochaComponent.accountName</code> attribute. 
	 * @param value the accountName - Your Vivocha account name
	 */
	public void setAccountName(final String value)
	{
		setAccountName( getSession().getSessionContext(), value );
	}
	
}
