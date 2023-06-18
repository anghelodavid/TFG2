package com.di.cleanup;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * Esta clase se encarga de iniciar el servlet.
 * @author anghelo
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

    /**
     * esta clase se encarga de inicar  la aplicación con el servlet 
     * para su despliegue.
     *
     */
	
	 // Configura la aplicación para implementarla como un servlet
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	// Devuelve la clase principal de la aplicación para la implementación del servlet
        return application.sources(CleanupApplication.class);
    }
}

