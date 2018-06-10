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
public class ComandoReadEmpleado implements Comando {
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAEmpleado sa = FactoriaSA.getInstance().createSAEmpleado();
		TEmpleado emp = sa.readEmpleado((TEmpleado) datos);

		Contexto responseContext = null;
		
		if(emp != null){			
			responseContext = new Contexto(EventoNegocio.READ_EMPLEADO_EXITO, emp);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READ_EMPLEADO_FRACASO, emp);
		}
		return responseContext;
	}
}