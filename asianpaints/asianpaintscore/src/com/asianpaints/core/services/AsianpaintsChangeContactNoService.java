/**
 *
 */
package com.asianpaints.core.services;

import de.hybris.platform.commerceservices.customer.PasswordMismatchException;
import de.hybris.platform.commerceservices.customer.impl.DefaultCustomerAccountService;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;

import org.springframework.util.Assert;


/**
 * @author roalex
 *
 */
public class AsianpaintsChangeContactNoService extends DefaultCustomerAccountService
{

	public void changeContactNo(final String newcontactno, final String currentPassword) throws PasswordMismatchException
	{
		Assert.hasText(newcontactno, "The field [newContactNo] cannot be empty");
		Assert.hasText(currentPassword, "The field [currentPassword] cannot be empty");

		/* final String newcontactnoLower = newcontactno.toLowerCase(); */
		final CustomerModel currentUser = (CustomerModel) getUserService().getCurrentUser();
		currentUser.setContactNo(newcontactno);

		/*
		 * // check uniqueness only if the uids are case insensitive different if
		 * (!currentUser.getContactNo().equalsIgnoreCase(newcontactno)) { checkUidUniqueness(newcontactnoLower); }
		 */
		final boolean status = checkPassword(currentUser, currentPassword);
		if (status == true)
		{

			currentUser.setContactNo(newcontactno);

			getModelService().save(currentUser);
		}
		else
		{
			throw new PasswordMismatchException(currentUser.getUid());
		}
	}

	protected boolean checkPassword(final UserModel currentUser, final String currentPassword) throws PasswordMismatchException
	{

		// Validate that the current password is correct
		final String encodedCurrentPassword = getPasswordEncoderService().encode(currentUser, currentPassword,
				currentUser.getPasswordEncoding());
		if (!encodedCurrentPassword.equals(currentUser.getEncodedPassword()))
		{
			throw new PasswordMismatchException(currentUser.getUid());
		}

		return true;

	}




}
