/**
 * 
 */
package MySystemDAO.Integracion.TransactionManager;

import java.util.concurrent.ConcurrentHashMap;
import MySystemDAO.Integracion.Transactions.Transaction;
import MySystemDAO.Integracion.Transactions.FactoriaTransaccion.FactoriaTransaccion;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransactionManagerImp extends TransactionManager {
	
	@Override
	public Transaction createTransaction() {
		// begin-user-code
		if (TransactionManager.transacciones == null)
			TransactionManager.transacciones = new ConcurrentHashMap<Thread, Transaction>();
		Thread th = Thread.currentThread();
		boolean b = TransactionManager.transacciones.containsKey(th);
		if (!b) {
			Transaction t = FactoriaTransaccion.getInstance()
					.createTransaction();
			TransactionManager.transacciones.put(th, t);
			return t;
		}
		return null;
		// end-user-code
	}

	@Override
	public Transaction getTransaction() {
		// begin-user-code
		if (TransactionManager.transacciones != null) {
			Thread th = Thread.currentThread();
			Transaction t = TransactionManager.transacciones.get(th);
			return t;
		}
		return null;
		// end-user-code
	}

	@Override
	public void removeTransaction() {
		// begin-user-code
		if (TransactionManager.transacciones != null) {
			Thread th = Thread.currentThread();
			TransactionManager.transacciones.remove(th);
		}
		// end-user-code
	}
}