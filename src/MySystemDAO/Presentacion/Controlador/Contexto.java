/**
 * 
 */
package MySystemDAO.Presentacion.Controlador;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Contexto {
	
	private int evento;
	
	private Object datos;

	public int getEvento() {
		return evento;
	}

	
	public Object getDatos() {
		return datos;
	}

	public Contexto(int evento, Object datos) {
		this.evento = evento;
		this.datos = datos;
	}
}