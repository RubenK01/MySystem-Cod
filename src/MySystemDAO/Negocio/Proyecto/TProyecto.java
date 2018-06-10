/**
 * 
 */
package MySystemDAO.Negocio.Proyecto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TProyecto {
	
	private int idProyecto;
	
	private String nombre;
	
	private int idJefe;
	
	private Boolean activo;

	private Double coste;

	public TProyecto() {
		this.idProyecto = 0;
		this.nombre = "";
		this.idJefe = 0;
		this.activo = false;
		this.coste = 0.0;
	}

	public TProyecto(int idProyecto, String nombre, int idJefe, Boolean activo,
			Double coste) {
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.idJefe = idJefe;
		this.activo = activo;
		this.coste = coste;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Double getCoste() {
		return coste;
	}

	public void setCoste(Double coste) {
		this.coste = coste;
	}

}