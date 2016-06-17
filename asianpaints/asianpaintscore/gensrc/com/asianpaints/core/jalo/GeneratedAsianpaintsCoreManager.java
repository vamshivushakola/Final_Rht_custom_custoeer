/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 17, 2016 2:53:52 PM                     ---
 * ----------------------------------------------------------------
 */
package com.asianpaints.core.jalo;

import com.asianpaints.core.constants.AsianpaintsCoreConstants;
import com.asianpaints.core.jalo.ApparelProduct;
import com.asianpaints.core.jalo.ApparelSizeVariantProduct;
import com.asianpaints.core.jalo.ApparelStyleVariantProduct;
import com.asianpaints.core.jalo.AsianpaintsSizeVariantProduct;
import com.asianpaints.core.jalo.AsianpaintsStyleVariantProduct;
import com.asianpaints.core.jalo.DetailsComingSoon;
import com.asianpaints.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>AsianpaintsCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAsianpaintsCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("selectedExtras", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("iscomingSoon", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("contactNo", AttributeMode.INITIAL);
		tmp.put("dateOfBirth", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactNo</code> attribute.
	 * @return the contactNo
	 */
	public String getContactNo(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Customer.CONTACTNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactNo</code> attribute.
	 * @return the contactNo
	 */
	public String getContactNo(final Customer item)
	{
		return getContactNo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactNo</code> attribute. 
	 * @param value the contactNo
	 */
	public void setContactNo(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Customer.CONTACTNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactNo</code> attribute. 
	 * @param value the contactNo
	 */
	public void setContactNo(final Customer item, final String value)
	{
		setContactNo( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsSizeVariantProduct createAsianpaintsSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSSIZEVARIANTPRODUCT );
			return (AsianpaintsSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AsianpaintsSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsSizeVariantProduct createAsianpaintsSizeVariantProduct(final Map attributeValues)
	{
		return createAsianpaintsSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsStyleVariantProduct createAsianpaintsStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSSTYLEVARIANTPRODUCT );
			return (AsianpaintsStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AsianpaintsStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsStyleVariantProduct createAsianpaintsStyleVariantProduct(final Map attributeValues)
	{
		return createAsianpaintsStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public DetailsComingSoon createDetailsComingSoon(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.DETAILSCOMINGSOON );
			return (DetailsComingSoon)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DetailsComingSoon : "+e.getMessage(), 0 );
		}
	}
	
	public DetailsComingSoon createDetailsComingSoon(final Map attributeValues)
	{
		return createDetailsComingSoon( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Customer.DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth(final Customer item)
	{
		return getDateOfBirth( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Customer.DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final Customer item, final String value)
	{
		setDateOfBirth( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return AsianpaintsCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.iscomingSoon</code> attribute.
	 * @return the iscomingSoon - Products which are coming soon.
	 */
	public Boolean isIscomingSoon(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Product.ISCOMINGSOON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.iscomingSoon</code> attribute.
	 * @return the iscomingSoon - Products which are coming soon.
	 */
	public Boolean isIscomingSoon(final Product item)
	{
		return isIscomingSoon( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.iscomingSoon</code> attribute. 
	 * @return the iscomingSoon - Products which are coming soon.
	 */
	public boolean isIscomingSoonAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isIscomingSoon( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.iscomingSoon</code> attribute. 
	 * @return the iscomingSoon - Products which are coming soon.
	 */
	public boolean isIscomingSoonAsPrimitive(final Product item)
	{
		return isIscomingSoonAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.iscomingSoon</code> attribute. 
	 * @param value the iscomingSoon - Products which are coming soon.
	 */
	public void setIscomingSoon(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Product.ISCOMINGSOON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.iscomingSoon</code> attribute. 
	 * @param value the iscomingSoon - Products which are coming soon.
	 */
	public void setIscomingSoon(final Product item, final Boolean value)
	{
		setIscomingSoon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.iscomingSoon</code> attribute. 
	 * @param value the iscomingSoon - Products which are coming soon.
	 */
	public void setIscomingSoon(final SessionContext ctx, final Product item, final boolean value)
	{
		setIscomingSoon( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.iscomingSoon</code> attribute. 
	 * @param value the iscomingSoon - Products which are coming soon.
	 */
	public void setIscomingSoon(final Product item, final boolean value)
	{
		setIscomingSoon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.selectedExtras</code> attribute.
	 * @return the selectedExtras
	 */
	public List<String> getSelectedExtras(final SessionContext ctx, final AbstractOrderEntry item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.SELECTEDEXTRAS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.selectedExtras</code> attribute.
	 * @return the selectedExtras
	 */
	public List<String> getSelectedExtras(final AbstractOrderEntry item)
	{
		return getSelectedExtras( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.selectedExtras</code> attribute. 
	 * @param value the selectedExtras
	 */
	public void setSelectedExtras(final SessionContext ctx, final AbstractOrderEntry item, final List<String> value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.SELECTEDEXTRAS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.selectedExtras</code> attribute. 
	 * @param value the selectedExtras
	 */
	public void setSelectedExtras(final AbstractOrderEntry item, final List<String> value)
	{
		setSelectedExtras( getSession().getSessionContext(), item, value );
	}
	
}
