/**
 *
 */
package com.asianpaints.facades.comingsoon;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import javax.annotation.Resource;

import com.asianpaints.core.services.ComingSoonService;
import com.asianpaints.facades.forms.SaveCustomerDataForm;


public class ComingSoonfacades
{


	@Resource(name = "comingSoonService")
	private ComingSoonService comingSoonService;

	public List<ProductModel> productreturnedlist()
	{
		final List<ProductModel> facadesList = comingSoonService.productreturnedlist();
		return facadesList;
	}


	public void ComingSoonRegistration(final SaveCustomerDataForm saveCustomerDataForm) throws DuplicateUidException
	{
		final RegistrationData registrationData = new RegistrationData();

		registrationData.setFirstname(saveCustomerDataForm.getFirstName());
		registrationData.setLastname(saveCustomerDataForm.getLastName());
		registrationData.setEmailid(saveCustomerDataForm.getEmailId());
		registrationData.setPhoneno(saveCustomerDataForm.getPhoneNo());
		registrationData.setProductCode(saveCustomerDataForm.getProductCode());
		registrationData.setProductName(saveCustomerDataForm.getProductName());



		comingSoonService.ComingSoonRegistration(registrationData);

	}


}

