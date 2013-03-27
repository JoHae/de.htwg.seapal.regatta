package app;
import models.IRegatta;

import com.google.inject.AbstractModule;

import controllers.IRegattaController;



public class RegattaDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IRegatta.class).to(models.mock.Regatta.class);
		bind(IRegattaController.class).to(controllers.mock.RegattaController.class);	
		
	}

}
