/**
 * 
 */
package MySystemDAO.Presentacion.Dispatcher;

import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.EventoNegocio;
import MySystemDAO.Presentacion.Empleado.VentanaCreateEmpleado;

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
		}
	}
}