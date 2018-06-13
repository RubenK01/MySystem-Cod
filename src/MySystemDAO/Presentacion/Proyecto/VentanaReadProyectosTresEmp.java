package MySystemDAO.Presentacion.Proyecto;

import java.awt.Component;

import javax.swing.JFrame;

public abstract class VentanaReadProyectosTresEmp  extends JFrame {
	
	private static VentanaReadProyectosTresEmp uniqueInstance;
	
	public static VentanaReadProyectosTresEmp getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new VentanaReadProyectosTresEmpImp();
		return uniqueInstance;
		// end-user-code
	}

	
	public abstract void update(Object datos);
	public abstract Component initGUI();
}
