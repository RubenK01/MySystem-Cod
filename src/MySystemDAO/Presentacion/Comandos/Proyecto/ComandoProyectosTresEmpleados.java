package MySystemDAO.Presentacion.Comandos.Proyecto;

import java.util.List;

import MySystemDAO.Negocio.ExcepcionesNegocio.ExcepcionNegocio;
import MySystemDAO.Negocio.FactoriaSA.FactoriaSA;
import MySystemDAO.Negocio.Proyecto.SAProyecto;
import MySystemDAO.Negocio.Proyecto.TProyecto;
import MySystemDAO.Presentacion.Comandos.Comando;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.EventoNegocio;

public class ComandoProyectosTresEmpleados implements Comando {
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAProyecto sa = FactoriaSA.getInstance().createSAProyecto();
		List<TProyecto> rs = sa.readProyectosConTresEmpleados();
		Contexto responseContext = null;
		
		if(rs.size() > 0){			
			responseContext = new Contexto(EventoNegocio.READ_PROYECTOS_TRES_EMPLEADOS, rs);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READ_PROYECTOS_TRES_EMPLEADOS, null);
		}
		return responseContext;
	}
}