package org.meerkatgroup.services.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The configuration class that loads all of the Spring Beans into the application context for the 
 * meerkatgroup.services module. Classes in the container are both explicitly and implicitly configured.
 * The explicit configuration of the classes is performed here.
 * 
 * @author larrycornett
 *
 */
@Configuration
@ComponentScan("org.meerkatgroup.services")
public class ServicesConfig {
	// Currently nothing to configure.
}
