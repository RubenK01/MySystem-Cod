/**
 * 
 */
package MySystemDAO.Negocio.FactoriaSA;

import MySystemDAO.Negocio.Proyecto.SAProyecto;
import MySystemDAO.Negocio.Empleado.SAEmpleado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class FactoriaSA {
	
	private static FactoriaSA uniqueInstance;

	public static FactoriaSA getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new FactoriaSAImp();
		return uniqueInstance;
		// end-user-code
	}

	public abstract SAProyecto createSAProyecto();

	public abstract SAEmpleado createSAEmpleado();
}