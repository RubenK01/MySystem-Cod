/**
 * 
 */
package MySystemDAO.Integracion.Empleado;

import java.util.ArrayList;

import MySystemDAO.Integracion.ExcepcionesIntegracion.ExcepcionIntegracion;
import MySystemDAO.Negocio.Empleado.TEmpleado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface DAOEmpleado {

	public TEmpleado readEmpleado(TEmpleado e) throws ExcepcionIntegracion;

	public int createEmpleado(TEmpleado e) throws ExcepcionIntegracion;

	public boolean updateEmpleado(TEmpleado e) throws ExcepcionIntegracion;

	public boolean deleteEmpleado(TEmpleado e) throws ExcepcionIntegracion;

	public ArrayList<TEmpleado> readAllEmpleado() throws ExcepcionIntegracion;

	public TEmpleado readEmpleadoByDNI(TEmpleado e) throws ExcepcionIntegracion;

	public ArrayList<TEmpleado> readEmpleadosPorProyecto(TEmpleado e) throws ExcepcionIntegracion;
}