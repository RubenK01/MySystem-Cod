/**
 * 
 */
package MySystemDAO.Integracion.TransactionManager;
import java.util.concurrent.ConcurrentHashMap;

import MySystemDAO.Integracion.Transactions.Transaction;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class TransactionManager {
	
	protected static ConcurrentHashMap<Thread, Transaction> transacciones;
	
	private static TransactionManager uniqueInstance;

	public static TransactionManager getInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new TransactionManagerImp();
		}
		return uniqueInstance;
	}

	public abstract Transaction getTransaction();

	public abstract Transaction createTransaction();

	public abstract void removeTransaction();
}