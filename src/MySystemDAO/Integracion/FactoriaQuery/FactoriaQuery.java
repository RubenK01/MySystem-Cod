/**
 * 
 */
package MySystemDAO.Integracion.FactoriaQuery;

import MySystemDAO.Integracion.Query.Query;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class FactoriaQuery {
	
	private static FactoriaQuery uniqueInstance;

	public static FactoriaQuery getInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new FactoriaQueryImp();
		}
		return uniqueInstance;
	}

	public abstract Query createQuery();
}