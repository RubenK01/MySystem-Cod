/**
 * 
 */
package MySystemDAO.Integracion.Proyecto;

import java.util.ArrayList;

import MySystemDAO.Integracion.ExcepcionesIntegracion.ExcepcionIntegracion;
import MySystemDAO.Negocio.Proyecto.TProyecto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface DAOProyecto {
	
	public int createProyecto(TProyecto p) throws ExcepcionIntegracion;
	
	public Boolean updateProyecto(TProyecto p) throws ExcepcionIntegracion;

	public Boolean deleteProyecto(TProyecto p) throws ExcepcionIntegracion;

	public TProyecto readProyecto(TProyecto p) throws ExcepcionIntegracion;

	public ArrayList<TProyecto> readAllProyectos() throws ExcepcionIntegracion;

	public TProyecto readProyectoByNombre(TProyecto p) throws ExcepcionIntegracion;
}