/**
 * 
 */
package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class VentanaDeleteEmpleado extends JFrame {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static VentanaDeleteEmpleadoImp uniqueInstance;
	
	public static VentanaDeleteEmpleado getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaDeleteEmpleadoImp();
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