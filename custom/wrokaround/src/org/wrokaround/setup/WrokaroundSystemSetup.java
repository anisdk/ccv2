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
package org.wrokaround.setup;

import static org.wrokaround.constants.WrokaroundConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.wrokaround.constants.WrokaroundConstants;
import org.wrokaround.service.WrokaroundService;


@SystemSetup(extension = WrokaroundConstants.EXTENSIONNAME)
public class WrokaroundSystemSetup
{
	private final WrokaroundService wrokaroundService;

	public WrokaroundSystemSetup(final WrokaroundService wrokaroundService)
	{
		this.wrokaroundService = wrokaroundService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		wrokaroundService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return WrokaroundSystemSetup.class.getResourceAsStream("/wrokaround/sap-hybris-platform.png");
	}
}
