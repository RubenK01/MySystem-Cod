package MySystemDAO.Presentacion.Proyecto;

import java.awt.Component;

import javax.swing.JFrame;

import MySystemDAO.Presentacion.Empleado.VentanaCreateEmpleado;
import MySystemDAO.Presentacion.Empleado.VentanaCreateEmpleadoImp;

public abstract class VentanaCreateProyecto extends JFrame {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static VentanaCreateProyecto uniqueInstance;
	
	public static VentanaCreateProyecto getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaCreateProyectoImp();
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
