package org.meerkatgroup.services.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServicesContext {
	private static ApplicationContext servicesContext;
	
	public static ApplicationContext getServicesContext() {
		if (servicesContext == null) {
			@SuppressWarnings({ "unused", "resource" })
			ApplicationContext servicesContext = new AnnotationConfigApplicationContext(ServicesConfig.class);
		}
		
		return servicesContext;
	}
	
}
