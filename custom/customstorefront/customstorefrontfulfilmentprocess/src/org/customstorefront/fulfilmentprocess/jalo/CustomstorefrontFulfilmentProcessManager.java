/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.customstorefront.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.customstorefront.fulfilmentprocess.constants.CustomstorefrontFulfilmentProcessConstants;

public class CustomstorefrontFulfilmentProcessManager extends GeneratedCustomstorefrontFulfilmentProcessManager
{
	public static final CustomstorefrontFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CustomstorefrontFulfilmentProcessManager) em.getExtension(CustomstorefrontFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
