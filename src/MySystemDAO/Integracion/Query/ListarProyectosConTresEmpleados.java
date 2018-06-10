/**
 * 
 */
package MySystemDAO.Integracion.Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import MySystemDAO.Integracion.ExcepcionesIntegracion.ExcepcionIntegracion;
import MySystemDAO.Integracion.TransactionManager.TransactionManager;
import MySystemDAO.Integracion.Transactions.Transaction;
import MySystemDAO.Negocio.Proyecto.TProyecto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ListarProyectosConTresEmpleados implements Query {
	
	public Object execute(Object param) throws ExcepcionIntegracion {
		TProyecto miProyecto=null;
		ArrayList<TProyecto> misProyectos = new ArrayList<TProyecto>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql;
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		
	    try{
	    	stmt = con.createStatement();
	           sql = "SELECT * FROM Proyectos INNER JOIN (SELECT 'idProyecto', count(*) as cant "+
	        		   "from Empleados group by idProyecto) TablaEmp on Proyectos.idProyecto = TablaEmp.idProyecto HAVING cant = 3; ";
	           rs=stmt.executeQuery(sql);
	    
	           while(rs.next()){
	        	 
	        	   miProyecto=new TProyecto(rs.getInt("idProyecto"), rs.getString("nombre"), rs.getInt("idJefe"),
	        			   rs.getBoolean("activo"), rs.getDouble("coste"));
	        	   
	        	   misProyectos.add(miProyecto);	               
	           }
	           
		     stmt.close();
		     rs.close();
	           
	       }
	       catch (Exception e){
	    	   throw new ExcepcionIntegracion("Error en la busqueda del Proyectos");
	       }
	    
		return misProyectos;
	}
}