/**
 * 
 */
package MySystemDAO.Presentacion.Comandos.Proyecto;

import MySystemDAO.Negocio.ExcepcionesNegocio.ExcepcionNegocio;
import MySystemDAO.Negocio.FactoriaSA.FactoriaSA;
import MySystemDAO.Negocio.Proyecto.SAProyecto;
import MySystemDAO.Negocio.Proyecto.TProyecto;
import MySystemDAO.Presentacion.Comandos.Comando;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.EventoNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ComandoDeleteProyecto implements Comando {
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAProyecto sa = FactoriaSA.getInstance().createSAProyecto();
		boolean rs = sa.deleteProyecto((TProyecto) datos);
		Contexto responseContext = null;
		
		if(rs){			
			responseContext = new Contexto(EventoNegocio.DELETE_PROYECTO_EXITO, rs);
		}
		else{
			responseContext = new Contexto(EventoNegocio.DELETE_PROYECTO_FRACASO, null);
		}
		return responseContext;
	}
}