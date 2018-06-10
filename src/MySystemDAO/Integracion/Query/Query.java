/**
 * 
 */
package MySystemDAO.Integracion.Query;


import MySystemDAO.Integracion.ExcepcionesIntegracion.ExcepcionIntegracion;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface Query {
	
	public Object execute(Object param) throws ExcepcionIntegracion;
}