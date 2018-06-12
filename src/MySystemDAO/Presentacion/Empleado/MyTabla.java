/**
 * 
 */
package MySystemDAO.Presentacion.Empleado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import MySystemDAO.Negocio.Empleado.TEmpleado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class MyTabla extends AbstractTableModel {
	
	private List<TEmpleado> empleados;
	String[] columnNames = new String [] {
            "ID Empleado", "Nombre", "DNI", "ID Proyecto", "Tipo Empleado", "Activo"};
	
	public MyTabla(Collection<TEmpleado> empleados) {
		this.empleados = new ArrayList<>();
		for (int i = 0; i < empleados.size(); i++) {
			this.empleados.add((TEmpleado) empleados.toArray()[i]);
		}
	}
	
	public int getRowCount() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return empleados.size();
		// end-user-code
	}

	
	public int getColumnCount() {
		// begin-user-code
		return 6;
		// end-user-code
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) {
		// begin-user-code
		Object value = "??";
		TEmpleado empleado = empleados.get(rowIndex);
		switch (columnIndex) {
		case 0:
			value = empleado.getIdEmpleado();
			break;
		case 1:
			value = empleado.getNombre();
			break;
		case 2:
			value = empleado.getDni();
			break;
		case 3:
			value = empleado.getIdProyecto();
			break;
		case 4:
			value = empleado.getTipoEmpleado();
			break;
		case 5:
			value = empleado.getActivo();
			break;
		}
		
		return value;
		// end-user-code
	}
	
	public String getColumnName(int col) {
		// begin-user-code
		return columnNames[col];
		// end-user-code
	}
	
	@SuppressWarnings("unused")
	public TEmpleado getUserAt(int row) {
		// begin-user-code
		return empleados.get(row);
		// end-user-code
	}
}