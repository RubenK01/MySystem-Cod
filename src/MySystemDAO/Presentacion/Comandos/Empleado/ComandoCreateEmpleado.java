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
public class ComandoCreateEmpleado implements Comando {
	
	
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAEmpleado sa = FactoriaSA.getInstance().createSAEmpleado();
		int id = sa.crearEmpleado((TEmpleado) datos);
		TEmpleado miEmp = new TEmpleado();
		miEmp.setIdEmpleado(id);
		Contexto responseContext = null;
		
		if(id != -1){			
			responseContext = new Contexto(EventoNegocio.ALTA_EMPLEADO_EXITO, miEmp);
		}
		else{
			responseContext = new Contexto(EventoNegocio.ALTA_EMPLEADO_FRACASO, miEmp);
		}
		return responseContext;
	}
}