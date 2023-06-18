package com.di.cleanup; 

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
/**
 * Esta clase  se encarga de iniciar la ejecución del programar .
 * @author anghelo
 *
 */
@SpringBootApplication
public class CleanupApplication { 

	/**
	 * Pre:...
	 * post:metodo encargado de que el programa se ejecute .
	 *
	 */
    public static void main(String[] args) { 
    	// Inicia la aplicación de Spring Boot
        SpringApplication.run(CleanupApplication.class, args); 
    }
}
