/**
 *
 */
package com.asianpaints.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;


/**
 * @author roalex
 *
 */
public class AsianpaintsCustomerPopulator extends CustomerPopulator
{
	@Override
	public void populate(final CustomerModel source, final CustomerData target)
	{
		super.populate(source, target);
		if (source.getContactNo() != null)
		{
			target.setContactNo(source.getContactNo());
			target.setDateOfBirth(source.getDateOfBirth());
		}
	}
}
