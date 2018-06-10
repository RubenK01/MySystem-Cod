/**
 * 
 */
package MySystemDAO.Integracion.Transactions;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface Transaction {
	
	public void start();

	public Object getResource();

	public void commit();

	public void rollback();
}