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

	
	public TEmpleadoExterno(TEmpleado emp) {
		super(emp.getIdEmpleado(), emp.getNombre(), emp.getDni() , emp.getIdProyecto(), emp.getTipoEmpleado(), emp.getActivo());
	}

	public TEmpleadoExterno() {
		super();
	}

	

	/**
	 * @param idEmpleado
	 * @param nombre
	 * @param dni
	 * @param idProyecto
	 * @param tipoEmpleado
	 * @param activo
	 * @param idEmpladoExterno
	 * @param idEmpleado2
	 * @param duracion
	 */
	public TEmpleadoExterno(int idEmpleado, String nombre, String dni, int idProyecto, String tipoEmpleado,
			Boolean activo, int idEmpladoExterno, int idEmpleado2, int duracion) {
		super(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo);
		this.idEmpladoExterno = idEmpladoExterno;
		this.idEmpleado = idEmpleado2;
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