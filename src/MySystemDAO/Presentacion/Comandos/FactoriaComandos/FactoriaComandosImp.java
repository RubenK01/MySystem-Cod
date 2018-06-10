/**
 * 
 */
package MySystemDAO.Presentacion.Comandos.FactoriaComandos;

import MySystemDAO.Presentacion.Comandos.Comando;
import MySystemDAO.Presentacion.Comandos.Empleado.ComandoCreateEmpleado;
import MySystemDAO.Presentacion.Comandos.Empleado.ComandoDeleteEmpleado;
import MySystemDAO.Presentacion.Comandos.Empleado.ComandoReadAllEmpleados;
import MySystemDAO.Presentacion.Comandos.Empleado.ComandoReadEmpleado;
import MySystemDAO.Presentacion.Comandos.Empleado.ComandoUpdateEmpleado;
import MySystemDAO.Presentacion.Comandos.Proyecto.ComandoCreateProyecto;
import MySystemDAO.Presentacion.Comandos.Proyecto.ComandoDeleteProyecto;
import MySystemDAO.Presentacion.Comandos.Proyecto.ComandoReadAllProyectos;
import MySystemDAO.Presentacion.Comandos.Proyecto.ComandoReadProyecto;
import MySystemDAO.Presentacion.Comandos.Proyecto.ComandoUpdateProyecto;
import MySystemDAO.Presentacion.Controlador.Contexto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaComandosImp extends FactoriaComandos {
	/** 
	 * (sin Javadoc)
	 * @see FactoriaComandos#creaComando()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Comando creaComando(Contexto requestContext) {
		int evento = requestContext.getEvento();
		Comando command = null;
		switch(evento) {
			//empleados
			case FactoriaComandos.COMANDO_CREATE_EMPLEADO:{
				command = new ComandoCreateEmpleado();
				break;
			}
			case FactoriaComandos.COMANDO_DELETE_EMPLEADO:{
				command = new ComandoDeleteEmpleado();
				break;
			}
			case FactoriaComandos.COMANDO_READ_EMPLEADO:{
				command = new ComandoReadEmpleado();
				break;
			}
			case FactoriaComandos.COMANDO_READALL_EMPLEADO:{
				command = new ComandoReadAllEmpleados();
				break;
			}
			case FactoriaComandos.COMANDO_UPDATE_EMPLEADO:{
				command = new ComandoUpdateEmpleado();
				break;
			}
			//Proyectos
			case FactoriaComandos.COMANDO_CREATE_PROYECTO:{
				command = new ComandoCreateProyecto();
				break;
			}
			case FactoriaComandos.COMANDO_DELETE_PROYECTO:{
				command = new ComandoDeleteProyecto();
				break;
			}
			case FactoriaComandos.COMANDO_READ_PROYECTO:{
				command = new ComandoReadProyecto();
				break;
			}
			case FactoriaComandos.COMANDO_READALL_PROYECTO:{
				command = new ComandoReadAllProyectos();
				break;
			}
			case FactoriaComandos.COMANDO_UPDATE_PROYECTO:{
				command = new ComandoUpdateProyecto();
				break;
			}
		}
		return command;
	}
}