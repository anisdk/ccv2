/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.customcore.setup;

import static org.customcore.constants.CustomcoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.customcore.constants.CustomcoreConstants;
import org.customcore.service.CustomcoreService;


@SystemSetup(extension = CustomcoreConstants.EXTENSIONNAME)
public class CustomcoreSystemSetup
{
	private final CustomcoreService customcoreService;

	public CustomcoreSystemSetup(final CustomcoreService customcoreService)
	{
		this.customcoreService = customcoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		customcoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CustomcoreSystemSetup.class.getResourceAsStream("/customcore/sap-hybris-platform.png");
	}
}
