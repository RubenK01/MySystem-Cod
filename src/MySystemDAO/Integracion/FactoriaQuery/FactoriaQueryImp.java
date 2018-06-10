/**
 * 
 */
package MySystemDAO.Integracion.FactoriaQuery;

import MySystemDAO.Integracion.Query.ListarProyectosConTresEmpleados;
import MySystemDAO.Integracion.Query.Query;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaQueryImp extends FactoriaQuery {

	@Override
	public Query createQuery() {
		return new ListarProyectosConTresEmpleados();
	}
	
}