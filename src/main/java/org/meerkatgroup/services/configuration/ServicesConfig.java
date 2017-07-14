package org.meerkatgroup.services.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;


/**
 * The configuration class that loads all of the Spring Beans into the application context for the 
 * meerkatgroup.services module. Classes in the container are both explicitly and implicitly configured.
 * The explicit configuration of the classes is performed here.
 * 
 * @author larrycornett
 * @param <SaajSoapMessageFactory>
 *
 */
@Configuration
@ComponentScan("org.meerkatgroup.services")
public class ServicesConfig {
	// Currently nothing to configure.
	@Bean
	public SaajSoapMessageFactory messageFactory() {
		
		return new SaajSoapMessageFactory();		
	}
	
	@Bean
	public WebServiceTemplate webServiceTemplate(SaajSoapMessageFactory messageFactory) {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory);
		webServiceTemplate.setDefaultUri("http://example.com/webservice");
		return webServiceTemplate;
		
	}
}
