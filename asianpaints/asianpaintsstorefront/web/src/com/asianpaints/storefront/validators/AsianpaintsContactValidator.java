/**
 *
 */
package com.asianpaints.storefront.validators;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.asianpaints.facades.forms.AsianpaintsUpdateContactNoForm;


@Component("asianpaintsContactValidator")
public class AsianpaintsContactValidator implements Validator
{
	@Override
	public boolean supports(final Class<?> aClass)
	{
		return AsianpaintsUpdateContactNoForm.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final AsianpaintsUpdateContactNoForm updateContactNoForm = (AsianpaintsUpdateContactNoForm) object;
		final String contactno = updateContactNoForm.getContactNo();
		final String chkContactno = updateContactNoForm.getChkcontactNo();
		final String password = updateContactNoForm.getPassword();

		if (StringUtils.isEmpty(contactno))
		{
			errors.rejectValue("contactno", "profile.contactno.invalid");
		}
		else if (StringUtils.length(contactno) != 10)
		{
			errors.rejectValue("contactno", "profile.contactno.invalid");
		}

		if (StringUtils.isEmpty(chkContactno))
		{
			errors.rejectValue("chkContactno", "profile.checkContactNo.invalid");
		}

		if (StringUtils.isEmpty(password))
		{
			errors.rejectValue("password", "profile.pwd.invalid");
		}
	}
}
