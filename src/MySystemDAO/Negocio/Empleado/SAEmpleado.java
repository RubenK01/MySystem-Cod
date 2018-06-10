/**
 * 
 */
package MySystemDAO.Negocio.Empleado;

import java.util.ArrayList;

import MySystemDAO.Negocio.ExcepcionesNegocio.ExcepcionNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface SAEmpleado {
	
	public int crearEmpleado(TEmpleado emp) throws ExcepcionNegocio ;

	public TEmpleado readEmpleado(TEmpleado emp) throws ExcepcionNegocio ;

	public boolean updateEmpleado(TEmpleado emp) throws ExcepcionNegocio ;

	public boolean deleteEmpleado(TEmpleado emp) throws ExcepcionNegocio ;

	public ArrayList<TEmpleado> readAllEmpleado() throws ExcepcionNegocio ;

	public ArrayList<TEmpleado> readAllEmpleadosPorProyecto(TEmpleado emp) throws ExcepcionNegocio ;
}