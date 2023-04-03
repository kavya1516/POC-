/**
 *
 */
package de.hybris.team5.storefront.controllers.pages;

/**
 * @author Irfan.Katarki
 *
 */
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Scope("tenant")
@RequestMapping("/")
public class HomePageControllerLogin extends AbstractPageController
{
	private static final String TESLALOGIN_CMS_PAGE = "LoginCMSPage";

	@RequestMapping(method = RequestMethod.GET)
	public String getOffers(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel LoginCMSPage = getContentPageForLabelOrId(TESLALOGIN_CMS_PAGE);
		storeCmsPageInModel(model, LoginCMSPage);
		setUpMetaDataForContentPage(model, LoginCMSPage);
		return getViewForPage(model);
	}

}
