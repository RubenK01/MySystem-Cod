package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;

import javax.swing.JFrame;

public abstract class VentanaReadEmpleadosByProyecto extends JFrame{
	private static VentanaReadEmpleadosByProyecto uniqueInstance;
	
	public static VentanaReadEmpleadosByProyecto getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaReadEmpleadosByProyectoImp();
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
