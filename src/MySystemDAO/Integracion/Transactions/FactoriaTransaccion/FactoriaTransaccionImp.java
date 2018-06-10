/**
 * 
 */
package MySystemDAO.Integracion.Transactions.FactoriaTransaccion;

import MySystemDAO.Integracion.Transactions.Transaction;
import MySystemDAO.Integracion.Transactions.TransactionImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaTransaccionImp extends FactoriaTransaccion {
	@Override
	public Transaction createTransaction() {
		
		return new TransactionImp();
	}
}