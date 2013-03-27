package app;
import models.IRegatta;

import com.google.inject.AbstractModule;

import controllers.IRegattaController;



public class RegattaDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IRegatta.class).to(models.impl.Regatta.class);
		bind(IRegattaController.class).to(controllers.impl.RegattaController.class);	
		
	}

}
