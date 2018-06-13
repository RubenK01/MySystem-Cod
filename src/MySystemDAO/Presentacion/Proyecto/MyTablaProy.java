package MySystemDAO.Presentacion.Proyecto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import MySystemDAO.Negocio.Proyecto.TProyecto;

public class MyTablaProy extends AbstractTableModel {
	
	private List<TProyecto> proyectos;
	String[] columnNames = new String [] {
            "ID Proyecto", "Nombre", "Id Jefe", "Coste", "Activo"};
	
	public MyTablaProy(Collection<TProyecto> proyectos) {
		this.proyectos = new ArrayList<>();
		for (int i = 0; i < proyectos.size(); i++) {
			this.proyectos.add((TProyecto) proyectos.toArray()[i]);
		}
	}
	
	public int getRowCount() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return proyectos.size();
		// end-user-code
	}

	
	public int getColumnCount() {
		// begin-user-code
		return 5;
		// end-user-code
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) {
		// begin-user-code
		Object value = "??";
		TProyecto proyecto = proyectos.get(rowIndex);
		switch (columnIndex) {
		case 0:
			value = proyecto.getIdProyecto();
			break;
		case 1:
			value = proyecto.getNombre();
			break;
		case 2:
			value = proyecto.getIdJefe();
			break;
		case 3:
			value = proyecto.getCoste();
			break;
		case 4:
			value = proyecto.getActivo();
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
	public TProyecto getUserAt(int row) {
		// begin-user-code
		return proyectos.get(row);
		// end-user-code
	}
}