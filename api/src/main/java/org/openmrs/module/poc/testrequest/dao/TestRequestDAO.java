/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.poc.testrequest.dao;

import java.util.List;
import java.util.Locale;

import org.hibernate.SessionFactory;
import org.openmrs.Concept;

public interface TestRequestDAO {
	
	void setSessionFactory(final SessionFactory sessionFactory);
	
	List<Concept> findAll(Locale locale);
	
}