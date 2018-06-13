package MySystemDAO.Presentacion.Comandos.Empleado;

import java.util.List;

import MySystemDAO.Negocio.Empleado.SAEmpleado;
import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Negocio.ExcepcionesNegocio.ExcepcionNegocio;
import MySystemDAO.Negocio.FactoriaSA.FactoriaSA;
import MySystemDAO.Presentacion.Comandos.Comando;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.EventoNegocio;

public class ComandoReadEmpleadosPorProyecto implements Comando {
	public Contexto execute(Object datos) throws ExcepcionNegocio {
		
		SAEmpleado sa = FactoriaSA.getInstance().createSAEmpleado();
		List<TEmpleado> emp = sa.readAllEmpleadosPorProyecto((TEmpleado) datos);

		Contexto responseContext = null;
		
		if(emp != null){			
			responseContext = new Contexto(EventoNegocio.READ_EMPLEADOS_BY_PROYECTO, emp);
		}
		else{
			responseContext = new Contexto(EventoNegocio.READ_EMPLEADOS_BY_PROYECTO, null);
		}
		return responseContext;
	}
}