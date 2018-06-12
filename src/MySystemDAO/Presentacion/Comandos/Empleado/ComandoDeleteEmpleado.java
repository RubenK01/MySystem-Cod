/**
 * 
 */
package MySystemDAO.Presentacion.Comandos.Empleado;

import MySystemDAO.Negocio.Empleado.SAEmpleado;
import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Negocio.ExcepcionesNegocio.ExcepcionNegocio;
import MySystemDAO.Negocio.FactoriaSA.FactoriaSA;
import MySystemDAO.Presentacion.Comandos.Comando;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.EventoNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ComandoDeleteEmpleado implements Comando {
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAEmpleado sa = FactoriaSA.getInstance().createSAEmpleado();
		boolean res = sa.deleteEmpleado((TEmpleado) datos);
		
		Contexto responseContext = null;
		
		if(res){			
			responseContext = new Contexto(EventoNegocio.DELETE_EMPLEADO_EXITO, res);
		}
		else{
			responseContext = new Contexto(EventoNegocio.DELETE_EMPLEADO_FRACASO, null);
		}
		return responseContext;
	}
}