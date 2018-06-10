/**
 * 
 */
package MySystemDAO.Integracion.Transactions.FactoriaTransaccion;

import MySystemDAO.Integracion.FactoriaQuery.FactoriaQueryImp;
import MySystemDAO.Integracion.Transactions.Transaction;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class FactoriaTransaccion {
	
	private static FactoriaTransaccion uniqueInstance;

	public static FactoriaTransaccion getInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new FactoriaTransaccionImp();
		}
		return uniqueInstance;
	}

	public abstract Transaction createTransaction();
}