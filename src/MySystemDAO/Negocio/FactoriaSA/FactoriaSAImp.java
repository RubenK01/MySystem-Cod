/**
 * 
 */
package MySystemDAO.Negocio.FactoriaSA;

import MySystemDAO.Negocio.Proyecto.SAProyecto;
import MySystemDAO.Negocio.Proyecto.SAProyectoImp;
import MySystemDAO.Negocio.Empleado.SAEmpleado;
import MySystemDAO.Negocio.Empleado.SAEmpleadoImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaSAImp extends FactoriaSA {
	
	@Override
	public SAProyecto createSAProyecto() {
		return new SAProyectoImp();
	}

	@Override
	public SAEmpleado createSAEmpleado() {
		return new SAEmpleadoImp();
	}
}