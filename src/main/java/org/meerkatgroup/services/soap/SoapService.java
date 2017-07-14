package org.meerkatgroup.services.soap;

import javax.xml.soap.SOAPMessage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.meerkatgroup.services.configuration.ServicesContext;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

/**
 * The SoapService class is the entry point for all soap services. 
 * @author larrycornett
 *
 */
@Component
public class SoapService {
	@SuppressWarnings("unused")
	private static ApplicationContext context = ServicesContext.getServicesContext();
	private static Logger log = LogManager.getLogger(SoapService.class);
	
	public SOAPMessage sendMessage(String url, String message) {
		SOAPMessage returnMessage = null;
		
		log.info("Returning valid SOAP Message");
		SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
		messageFactory.createWebServiceMessage();
		return returnMessage;
	}
}
