/**
 * 
 */
package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class VentanaUpdateEmpleado extends JFrame {
	
	private static VentanaUpdateEmpleado uniqueInstance;
	
	public static VentanaUpdateEmpleado getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaUpdateEmpleadoImp();
		return uniqueInstance;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void update(Object data);
	
	public abstract Component initGUI();
}