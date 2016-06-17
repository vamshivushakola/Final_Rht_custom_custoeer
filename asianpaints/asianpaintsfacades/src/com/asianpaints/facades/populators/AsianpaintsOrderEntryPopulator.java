/**
 *
 */
package com.asianpaints.facades.populators;

import de.hybris.platform.commercefacades.order.converters.populator.OrderEntryPopulator;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;


/**
 * @author roalex
 *
 */
public class AsianpaintsOrderEntryPopulator extends OrderEntryPopulator
{
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.commercefacades.order.converters.populator.OrderEntryPopulator#populate(de.hybris.platform.core
	 * .model.order.AbstractOrderEntryModel, de.hybris.platform.commercefacades.order.data.OrderEntryData)
	 */
	@Override
	public void populate(final AbstractOrderEntryModel source, final OrderEntryData target)
	{
		// YTODO Auto-generated method stub
		super.populate(source, target);

		if (source.getSelectedExtras() != null)
		{
			target.setOrderExtras(source.getSelectedExtras());
		}

	}
}
