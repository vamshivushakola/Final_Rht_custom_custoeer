/**
 *
 */
package com.asianpaints.facades.contactno;

import de.hybris.platform.commercefacades.user.exceptions.PasswordMismatchException;

import javax.annotation.Resource;

import com.asianpaints.core.services.AsianpaintsChangeContactNoService;


/**
 * @author roalex
 *
 */
public class AsianpaintsChangeContactNofacades
{

	@Resource(name = "asianpaintsChangeContactNoService")
	private AsianpaintsChangeContactNoService asianpaintsChangeContactNoService;

	public void changeContactNo(final String newcontactno, final String currentPassword) throws PasswordMismatchException
	{
		try
		{
			asianpaintsChangeContactNoService.changeContactNo(newcontactno, currentPassword);
		}
		catch (final de.hybris.platform.commerceservices.customer.PasswordMismatchException pse)
		{
			throw new PasswordMismatchException(pse);
		}

	}

}
