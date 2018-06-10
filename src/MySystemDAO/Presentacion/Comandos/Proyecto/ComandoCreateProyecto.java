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
public class ComandoCreateProyecto implements Comando {
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAProyecto sa = FactoriaSA.getInstance().createSAProyecto();
		int id = sa.createProyecto((TProyecto) datos);
		TProyecto miProy = new TProyecto();
		miProy.setIdProyecto(id);
		Contexto responseContext = null;
		
		if(id != -1){			
			responseContext = new Contexto(EventoNegocio.ALTA_PROYECTO_EXITO, miProy);
		}
		else{
			responseContext = new Contexto(EventoNegocio.ALTA_PROYECTO_FRACASO, miProy);
		}
		return responseContext;
	}
}