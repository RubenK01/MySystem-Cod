/**
 * 
 */
package MySystemDAO.Presentacion.Dispatcher;

import MySystemDAO.Presentacion.Controlador.Contexto;
	
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class Dispatcher {
//	//Empleados
//	public static final int VISTA_CREATE_EMPLEADO = 2000;
//	public static final int VISTA_READ_EMPLEADO = 2001;
//	public static final int VISTA_UPDATE_EMPLEADO = 2002;
//	public static final int VISTA_DELETE_EMPLEADO = 2003;
//	public static final int VISTA_READALL_EMPLEADO = 2004;
//	
//	//Proyectos
//	public static final int VISTA_CREATE_PROYECTO = 2005;
//	public static final int VISTA_READ_PROYECTO = 2006;
//	public static final int VISTA_UPDATE_PROYECTO = 2007;
//	public static final int VISTA_DELETE_PROYECTO = 2008;
//	public static final int VISTA_READALL_PROYECTO = 2009;	

	private static Dispatcher uniqueInstance;

	public static Dispatcher getInstance() {
		// begin-user-code
		if (uniqueInstance == null)
			uniqueInstance = new DispatcherImp();
		return uniqueInstance;
		// end-user-code
	}

	public abstract void dispatch(Contexto responseContext);
}