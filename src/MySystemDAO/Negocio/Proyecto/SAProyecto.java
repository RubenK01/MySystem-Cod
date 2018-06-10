/**
 * 
 */
package MySystemDAO.Negocio.Proyecto;

import java.util.ArrayList;

import MySystemDAO.Negocio.ExcepcionesNegocio.ExcepcionNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface SAProyecto {

	public int createProyecto(TProyecto proy) throws ExcepcionNegocio;

	public TProyecto readProyecto(TProyecto proy) throws ExcepcionNegocio;

	public boolean updateProyecto(TProyecto proy) throws ExcepcionNegocio;

	public boolean deleteProyecto(TProyecto proy) throws ExcepcionNegocio;

	public ArrayList<TProyecto> readAllProyectos() throws ExcepcionNegocio;

	public ArrayList<TProyecto> readProyectosConTresEmpleados() throws ExcepcionNegocio;

	public TProyecto readProyectoByNombre(TProyecto proy) throws ExcepcionNegocio;
}