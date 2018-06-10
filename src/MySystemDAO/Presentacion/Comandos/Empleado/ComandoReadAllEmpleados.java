/**
 * 
 */
package MySystemDAO.Presentacion.Comandos.Empleado;

import java.util.ArrayList;

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
public class ComandoReadAllEmpleados implements Comando {
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAEmpleado sa = FactoriaSA.getInstance().createSAEmpleado();
		ArrayList<TEmpleado> misEmpleados = sa.readAllEmpleado();
		Contexto responseContext = null;
		
		if(misEmpleados.size() > 0)
			responseContext = new Contexto(EventoNegocio.READALL_EMPLEADO_EXITO, misEmpleados);
		else
			responseContext = new Contexto(EventoNegocio.READALL_EMPLEADO_FRACASO, null);
		
		return responseContext;
	}	
}