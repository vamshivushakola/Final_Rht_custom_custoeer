/**
 *
 */
package com.asianpaints.storefront.controllers.pages;


import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asianpaints.facades.comingsoon.ComingSoonfacades;
import com.asianpaints.facades.forms.SaveCustomerDataForm;


@Controller
@Scope("tenant")
@RequestMapping("/coming-soon/products")
public class ComingSoonController extends ProductPageController
{

	protected static final String COMINGSOON_CMS_PAGE = "comingSoon";

	@Resource(name = "accountBreadcrumbBuilder")
	private ResourceBreadcrumbBuilder accountBreadcrumbBuilder;

	@Resource(name = "comingSoonfacades")
	private ComingSoonfacades comingSoonfacades;

	@RequestMapping(method = RequestMethod.GET)
	public String productComingSoonHome(final Model model) throws CMSItemNotFoundException
	{

		final List<ProductModel> listProducts = comingSoonfacades.productreturnedlist();
		storeCmsPageInModel(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(COMINGSOON_CMS_PAGE));
		model.addAttribute("breadcrumbs", accountBreadcrumbBuilder.getBreadcrumbs("text.comingsoon.products"));
		model.addAttribute("metaRobots", "no-index,no-follow");
		model.addAttribute("produtList", listProducts);
		return getViewForPage(model);
	}



	@RequestMapping(value = "/Save", method = RequestMethod.POST)
	@ResponseBody
	public String saveRegComingSoon(final SaveCustomerDataForm saveCustomerDataForm, final Model model)
			throws CMSItemNotFoundException, DuplicateUidException
	{
		/*
		 * model.addAttribute("breadcrumbs", accountBreadcrumbBuilder.getBreadcrumbs("text.comingsoon.products"));
		 * model.addAttribute("metaRobots", "no-index,no-follow");
		 */
		String result;


		try
		{
			comingSoonfacades.ComingSoonRegistration(saveCustomerDataForm);

			model.addAttribute("notifyStatus", "Data saved successfully");
			result = "Data Saved Successfully";
		}
		catch (final ModelSavingException e)
		{
			// YTODO: handle exception
			result = "An Error has occurred";
		}

		return result;

	}

}