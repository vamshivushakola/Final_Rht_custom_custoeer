/**
 *
 */
package com.asianpaints.core.services;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import com.asianpaints.core.daos.ComingSoonDao;
import com.asianpaints.core.model.DetailsComingSoonModel;
import com.asianpaints.facades.comingsoon.RegistrationData;


/**
 * @author roalex
 *
 */
public class ComingSoonService
{
	@Resource(name = "comingSoonDao")
	private ComingSoonDao comingSoonDao;

	public List<ProductModel> productreturnedlist()
	{
		final List<ProductModel> listproducts = comingSoonDao.findcomingsoonproduct();
		return listproducts;
	}

	@Resource(name = "modelService")
	private ModelService modelService;

	public void ComingSoonRegistration(final RegistrationData registrationData) throws DuplicateUidException
	{

		final DetailsComingSoonModel notifyCustomerModel = new DetailsComingSoonModel();
		notifyCustomerModel.setFirstname(registrationData.getFirstname());
		notifyCustomerModel.setLastname(registrationData.getLastname());
		notifyCustomerModel.setEmailid(registrationData.getEmailid());
		notifyCustomerModel.setPhoneno(registrationData.getPhoneno());
		notifyCustomerModel.setProductCode(registrationData.getProductCode());
		notifyCustomerModel.setProductName(registrationData.getProductName());

		modelService.save(notifyCustomerModel);

	}
}

