/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package wrofix.setup;

import static wrofix.constants.WrofixConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import wrofix.constants.WrofixConstants;
import wrofix.service.WrofixService;


@SystemSetup(extension = WrofixConstants.EXTENSIONNAME)
public class WrofixSystemSetup
{
	private final WrofixService wrofixService;

	public WrofixSystemSetup(final WrofixService wrofixService)
	{
		this.wrofixService = wrofixService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		wrofixService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return WrofixSystemSetup.class.getResourceAsStream("/wrofix/sap-hybris-platform.png");
	}
}
