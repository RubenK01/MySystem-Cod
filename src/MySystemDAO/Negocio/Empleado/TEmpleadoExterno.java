/**
 * 
 */
package MySystemDAO.Negocio.Empleado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TEmpleadoExterno extends TEmpleado {
	
	private int idEmpladoExterno;
	private int idEmpleado;
	private int duracion;

	public TEmpleadoExterno() {
		super();
	}

	public TEmpleadoExterno(int idEmpleado, String nombre, String dni,
			int idProyecto, String tipoEmpleado, Boolean activo,
			int idEmpladoExterno, int duracion) {
		super(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo);
		this.idEmpladoExterno = idEmpladoExterno;
		this.duracion = duracion;
	}

	public int getIdEmpladoExterno() {
		return idEmpladoExterno;
	}

	public void setIdEmpladoExterno(int idEmpladoExterno) {
		this.idEmpladoExterno = idEmpladoExterno;
	}
	
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int d) {
		duracion = d;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
}