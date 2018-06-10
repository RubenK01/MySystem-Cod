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
public class TEmpleadoInterno extends TEmpleado {
	private int idEmpleadoInterno;
	private int idEmpleado;
	private double costeFormacion;
	
	public TEmpleadoInterno(int idEmpleado, String nombre, String dni,
			int idProyecto, String tipoEmpleado, Boolean activo,
			int idEmpleadoInterno, double costeFormacion) {
		super(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo);
		this.idEmpleadoInterno = idEmpleadoInterno;
		this.costeFormacion = costeFormacion;
	}
	public TEmpleadoInterno() {
		super();
	}
	public int getIdEmpleadoInterno() {
		return idEmpleadoInterno;
	}
	public void setIdEmpleadoInterno(int idEmpleadoInterno) {
		this.idEmpleadoInterno = idEmpleadoInterno;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public double getCosteFormacion() {
		return costeFormacion;
	}
	public void setCosteFormacion(double costeFormacion) {
		this.costeFormacion = costeFormacion;
	}
	
}