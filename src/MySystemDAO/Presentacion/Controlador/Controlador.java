/**
 * 
 */
package MySystemDAO.Presentacion.Controlador;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class Controlador {

	private static Controlador uniqueInstance;

	public static Controlador getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new ControladorImp();
		return uniqueInstance;
		// end-user-code
	}

	public abstract void action(Contexto c);
}