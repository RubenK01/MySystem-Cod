/**
 * 
 */
package MySystemDAO.Presentacion.Comandos.FactoriaComandos;

import MySystemDAO.Presentacion.Comandos.Comando;
import MySystemDAO.Presentacion.Controlador.Contexto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class FactoriaComandos {
	//Empleados
	public static final int COMANDO_CREATE_EMPLEADO = 1000;
	public static final int COMANDO_READ_EMPLEADO = 1001;
	public static final int COMANDO_UPDATE_EMPLEADO = 1002;
	public static final int COMANDO_DELETE_EMPLEADO = 1003;
	public static final int COMANDO_READALL_EMPLEADO = 1004;
	
	//Proyectos
	public static final int COMANDO_CREATE_PROYECTO = 1005;
	public static final int COMANDO_READ_PROYECTO = 1006;
	public static final int COMANDO_UPDATE_PROYECTO = 1007;
	public static final int COMANDO_DELETE_PROYECTO = 1008;
	public static final int COMANDO_READALL_PROYECTO = 1009;

	private static FactoriaComandos uniqueInstance;

	public static FactoriaComandos getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new FactoriaComandosImp();
		return uniqueInstance;
		// end-user-code
	}

	public abstract Comando creaComando(Contexto requestContext);
}