/*
 * generated by Xtext
 */
package de.htwg.seapal.components.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractComponentValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.htwg.seapal.components.component.ComponentPackage.eINSTANCE);
		return result;
	}
}
