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
public class TEmpleado {

	private int idEmpleado;

	private String nombre;

	private String dni;

	private int idProyecto;

	private String tipoEmpleado;

	private Boolean activo;

	public TEmpleado() {
		this.idEmpleado = 0;
		this.nombre = "";
		this.dni = "";
		this.idProyecto = 0;
		this.tipoEmpleado = "";
		this.activo = null;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public TEmpleado(int idEmpleado, String nombre, String dni, int idProyecto,
			String tipoEmpleado, Boolean activo) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.dni = dni;
		this.idProyecto = idProyecto;
		this.tipoEmpleado = tipoEmpleado;
		this.activo = activo;
	}	
}