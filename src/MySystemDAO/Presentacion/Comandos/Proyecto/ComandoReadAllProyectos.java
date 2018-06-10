/**
 * 
 */
package MySystemDAO.Presentacion.Comandos.Proyecto;

import java.util.ArrayList;

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
public class ComandoReadAllProyectos implements Comando {
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAProyecto sa = FactoriaSA.getInstance().createSAProyecto();
		ArrayList<TProyecto> misProyectos = sa.readAllProyectos();

		Contexto responseContext = null;
		
		if(misProyectos.size()>0){			
			responseContext = new Contexto(EventoNegocio.READALL_PROYECTO_EXITO, misProyectos);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READALL_PROYECTO_FRACASO, misProyectos);
		}
		return responseContext;
	}
}