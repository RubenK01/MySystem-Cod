/**
 * 
 */
package MySystemDAO.Integracion.FactoriaDAO;

import MySystemDAO.Integracion.Empleado.DAOEmpleado;
import MySystemDAO.Integracion.Proyecto.DAOProyecto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class FactoriaDAO {
	
	private static FactoriaDAO uniqueInstance;

	public static FactoriaDAO getInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new FactoriaDAOImp();
		}
		return uniqueInstance;
	}

	public abstract DAOEmpleado createDAOEmpleado();

	public abstract DAOProyecto createDAOProyecto();
}