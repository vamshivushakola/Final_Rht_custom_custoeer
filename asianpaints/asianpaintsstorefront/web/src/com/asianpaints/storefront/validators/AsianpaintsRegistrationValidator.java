/**
 *
 */
package com.asianpaints.storefront.validators;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.asianpaints.facades.forms.AsianpaintsRegisterForm;


/**
 * @author roalex
 *
 */
@Component("asianpaintsRegistrationValidator")
public class AsianpaintsRegistrationValidator implements Validator
{

	public static final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
	public static final Pattern DOB_REGEX = Pattern.compile("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$");

	@Override
	public boolean supports(final Class<?> aClass)
	{
		return RegisterForm.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final AsianpaintsRegisterForm registerForm = (AsianpaintsRegisterForm) object;
		final String titleCode = registerForm.getTitleCode();
		final String firstName = registerForm.getFirstName();
		final String lastName = registerForm.getLastName();
		final String contactNo = registerForm.getContactNo();
		final String dateOfBirth = registerForm.getDateOfBirth();
		final String email = registerForm.getEmail();
		final String pwd = registerForm.getPwd();
		final String checkPwd = registerForm.getCheckPwd();

		if (StringUtils.isEmpty(titleCode))
		{
			errors.rejectValue("titleCode", "register.title.invalid");
		}
		else if (StringUtils.length(titleCode) > 255)
		{
			errors.rejectValue("titleCode", "register.title.invalid");
		}

		if (StringUtils.isBlank(firstName))
		{
			errors.rejectValue("firstName", "register.firstName.invalid");
		}
		else if (StringUtils.length(firstName) > 255)
		{
			errors.rejectValue("firstName", "register.firstName.invalid");
		}

		if (StringUtils.isBlank(lastName))
		{
			errors.rejectValue("lastName", "register.lastName.invalid");
		}
		else if (StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.lastName.invalid");
		}

		if (StringUtils.length(firstName) + StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.name.invalid");
			errors.rejectValue("firstName", "register.name.invalid");
		}

		if (StringUtils.isBlank(contactNo))
		{
			errors.rejectValue("contactNo", "register.contactNo.invalid");
		}
		else if (StringUtils.length(contactNo) != 10)
		{
			errors.rejectValue("contactNo", "register.contactNo.invalid");
		}

		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !validateEmailAddress(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}

		if (StringUtils.isEmpty(pwd))
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}
		else if (StringUtils.length(pwd) < 6 || StringUtils.length(pwd) > 255)
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}

		if (StringUtils.isNotEmpty(pwd) && StringUtils.isNotEmpty(checkPwd) && !StringUtils.equals(pwd, checkPwd))
		{
			errors.rejectValue("checkPwd", "validation.checkPwd.equals");
		}
		else
		{
			if (StringUtils.isEmpty(checkPwd))
			{
				errors.rejectValue("checkPwd", "register.checkPwd.invalid");
			}
		}

		if (StringUtils.isEmpty(dateOfBirth))
		{
			errors.rejectValue("dateOfBirth", "register.dateOfBirth.invalid");
		}
		else if (StringUtils.length(dateOfBirth) > 11 || !validateDOBRegex(dateOfBirth))
		{
			errors.rejectValue("dateOfBirth", "register.dateOfBirth.invalid");
		}
		else if (validateDOB(dateOfBirth))
		{
			errors.rejectValue("dateOfBirth", "register.dateOfBirth.invalid");
		}
	}

	public boolean validateEmailAddress(final String email)
	{
		final Matcher matcher = EMAIL_REGEX.matcher(email);
		return matcher.matches();
	}

	public boolean validateDOBRegex(final String dateOfBirth)
	{
		final Matcher matcher = DOB_REGEX.matcher(dateOfBirth);
		return matcher.matches();
	}

	public boolean validateDOB(final String dateOfBirth)
	{
		boolean dateValidation = true;
		final Date today = new Date();
		try
		{
			final Date dobDate = new SimpleDateFormat("MM/dd/yyyy").parse(dateOfBirth);

			if ((today.getYear() - dobDate.getYear()) > 10)
			{
				dateValidation = false;
			}

			/*
			 * else if (dobDate.compareTo(today) < 0) { //before today dateValidation = false;
			 *
			 * } else if (dobDate.equals(today)) { dateValidation = true; }
			 */
			else
			{
				dateValidation = true;
			}

		}

		catch (final ParseException e)
		{
			//handle exception return false;
			dateValidation = true;

		}

		return dateValidation;

	}

}
