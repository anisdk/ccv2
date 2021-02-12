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
package com.sap.cec.firstweb.setup;

import static com.sap.cec.firstweb.constants.FirstwebConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.sap.cec.firstweb.constants.FirstwebConstants;
import com.sap.cec.firstweb.service.FirstwebService;


@SystemSetup(extension = FirstwebConstants.EXTENSIONNAME)
public class FirstwebSystemSetup
{
	private final FirstwebService firstwebService;

	public FirstwebSystemSetup(final FirstwebService firstwebService)
	{
		this.firstwebService = firstwebService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		firstwebService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return FirstwebSystemSetup.class.getResourceAsStream("/firstweb/sap-hybris-platform.png");
	}
}
