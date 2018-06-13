/**
 * 
 */
package MySystemDAO.Presentacion.Dispatcher;

import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.EventoNegocio;
import MySystemDAO.Presentacion.Empleado.VentanaCreateEmpleado;
import MySystemDAO.Presentacion.Empleado.VentanaDeleteEmpleado;
import MySystemDAO.Presentacion.Empleado.VentanaReadAllEmpleados;
import MySystemDAO.Presentacion.Empleado.VentanaReadEmpleado;
import MySystemDAO.Presentacion.Empleado.VentanaReadEmpleadosByProyecto;
import MySystemDAO.Presentacion.Empleado.VentanaUpdateEmpleado;
import MySystemDAO.Presentacion.Proyecto.VentanaCreateProyecto;
import MySystemDAO.Presentacion.Proyecto.VentanaDeleteProyecto;
import MySystemDAO.Presentacion.Proyecto.VentanaReadAllProyectos;
import MySystemDAO.Presentacion.Proyecto.VentanaReadProyecto;
import MySystemDAO.Presentacion.Proyecto.VentanaReadProyectosTresEmp;
import MySystemDAO.Presentacion.Proyecto.VentanaUpdateProyecto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DispatcherImp extends Dispatcher {
	@Override
	public void dispatch(Contexto responseContext){
		int evento = responseContext.getEvento();
		switch (evento) {
			case EventoNegocio.ALTA_EMPLEADO_EXITO:{
				VentanaCreateEmpleado.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.ALTA_EMPLEADO_FRACASO:{
				VentanaCreateEmpleado.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.DELETE_EMPLEADO_EXITO:{
				VentanaDeleteEmpleado.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.DELETE_EMPLEADO_FRACASO:{
				VentanaDeleteEmpleado.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_EMPLEADO_EXITO:{
				VentanaReadEmpleado.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_EMPLEADO_FRACASO:{
				VentanaReadEmpleado.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.UPDATE_EMPLEADO_EXITO:{
				VentanaUpdateEmpleado.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.UPDATE_EMPLEADO_FRACASO:{
				VentanaUpdateEmpleado.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READALL_EMPLEADO_EXITO:{
				VentanaReadAllEmpleados.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READALL_EMPLEADO_FRACASO:{
				VentanaReadAllEmpleados.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_PROYECTO_EXITO:{
				VentanaReadProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_PROYECTO_FRACASO:{
				VentanaReadProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.ALTA_PROYECTO_EXITO:{
				VentanaCreateProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.ALTA_PROYECTO_FRACASO:{
				VentanaCreateProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.UPDATE_PROYECTO_EXITO:{
				VentanaUpdateProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.UPDATE_PROYECTO_FRACASO:{
				VentanaUpdateProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.DELETE_PROYECTO_EXITO:{
				VentanaDeleteProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.DELETE_PROYECTO_FRACASO:{
				VentanaDeleteProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READALL_PROYECTO_EXITO:{
				VentanaReadAllProyectos.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READALL_PROYECTO_FRACASO:{
				VentanaReadAllProyectos.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_EMPLEADOS_BY_PROYECTO:{
				VentanaReadEmpleadosByProyecto.getInstance().update(responseContext.getDatos());
				break;
			}
			case EventoNegocio.READ_PROYECTOS_TRES_EMPLEADOS:{
				VentanaReadProyectosTresEmp.getInstance().update(responseContext.getDatos());
				break;
			}
		}
	}
}