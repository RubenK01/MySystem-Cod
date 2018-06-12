package MySystemDAO.Presentacion.Proyecto;

import java.awt.Component;

import javax.swing.JFrame;

public abstract class VentanaUpdateProyecto  extends JFrame {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static VentanaUpdateProyecto uniqueInstance;
	
	public static VentanaUpdateProyecto getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaUpdateProyectoImp();
		return uniqueInstance;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void update(Object datos);
	public abstract Component initGUI();
}
