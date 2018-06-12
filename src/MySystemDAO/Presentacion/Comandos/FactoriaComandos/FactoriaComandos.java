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