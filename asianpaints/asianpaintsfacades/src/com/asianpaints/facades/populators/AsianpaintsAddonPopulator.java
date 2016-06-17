/**
 *
 */
package com.asianpaints.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.asianpaints.core.model.AsianpaintsSizeVariantProductModel;


/**
 * @author roalex
 *
 */
public class AsianpaintsAddonPopulator extends ProductBasicPopulator<ProductModel, ProductData>
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator#populate(de.hybris.platform.
	 * core.model.product.ProductModel, de.hybris.platform.commercefacades.product.data.ProductData)
	 */
	@Override
	public void populate(final ProductModel productModel, final ProductData productData) throws ConversionException
	{
		// YTODO Auto-generated method stub
		super.populate(productModel, productData);
		if (productModel instanceof AsianpaintsSizeVariantProductModel)
		{
			if (((AsianpaintsSizeVariantProductModel) productModel).getExtras() != null)
			{
				productData.setExtras(((AsianpaintsSizeVariantProductModel) productModel).getExtras());
			}
		}
	}
}
