/**
 * 
 */
package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class VentanaReadAllEmpleados extends JFrame {


	private static VentanaReadAllEmpleados uniqueInstance;
	
	public static VentanaReadAllEmpleados getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new VentanaReadAllEmpleadosImp();
		return uniqueInstance;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void update(Object data);
	
	public abstract Component initGUI();
}