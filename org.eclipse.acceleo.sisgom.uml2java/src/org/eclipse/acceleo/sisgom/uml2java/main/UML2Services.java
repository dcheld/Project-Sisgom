package org.eclipse.acceleo.sisgom.uml2java.main;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Stereotype;

public class UML2Services {

	@SuppressWarnings("rawtypes")
	public static Stereotype getStereotype(org.eclipse.uml2.uml.ConnectableElement clazz,
			String stereotypeName) {
		EList stereotypes = clazz.getAppliedStereotypes();
		for (Iterator i = stereotypes.iterator(); i.hasNext();) {
			Stereotype stereotype = (Stereotype) i.next();
			if (stereotype.getName().equals(stereotypeName)) {
				return stereotype;
			}
		}
		return null;
	}

	public static boolean hasStereotype(org.eclipse.uml2.uml.Class clazz, String stereotypeName) {
		Stereotype stereotype = getStereotype((org.eclipse.uml2.uml.ConnectableElement)clazz, stereotypeName);
		return (stereotype != null);
	}

	public static Object getValue(org.eclipse.uml2.uml.Class clazz, String stereotypeName, String propertyName) { 
		Stereotype stereotype = getStereotype((org.eclipse.uml2.uml.ConnectableElement)clazz, stereotypeName); 
		return clazz.getValue(stereotype, propertyName); 
	} 
	
	public static String getValueProp(org.eclipse.uml2.uml.Property prop, String propertyName) { 
		Stereotype stereotype = getStereotype((org.eclipse.uml2.uml.ConnectableElement)prop, prop.getName()); 
		return prop.getValue(stereotype, propertyName).toString(); 
	} 
}