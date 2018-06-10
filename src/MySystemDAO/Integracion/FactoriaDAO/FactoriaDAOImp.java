/**
 * 
 */
package MySystemDAO.Integracion.FactoriaDAO;

import MySystemDAO.Integracion.Empleado.DAOEmpleado;
import MySystemDAO.Integracion.Empleado.DAOEmpleadoImp;
import MySystemDAO.Integracion.Proyecto.DAOProyecto;
import MySystemDAO.Integracion.Proyecto.DAOProyectoImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaDAOImp extends FactoriaDAO {

	public DAOEmpleado createDAOEmpleado() {
		return new DAOEmpleadoImp();
	}

	public DAOProyecto createDAOProyecto() {
		return new DAOProyectoImp();
	}
}