/**
 * 
 */
package MySystemDAO.Integracion.Proyecto;

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
public class DAOProyectoImp implements DAOProyecto {

	@Override
	public int createProyecto(TProyecto p) throws ExcepcionIntegracion{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "";
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		//Esta variable se va a usar para recibir el valor del campo autonumrico
        int codigo = -1;
        
       
		try{
			stmt = con.createStatement();
	           sql="insert into Proyectos(idProyecto,nombre,idJefe,activo,coste) "
	           		+ "values("+p.getIdProyecto()+",'"+p.getNombre()+"', "+p.getIdJefe()+", "
	           		+ "'"+p.getActivo()+"','"+p.getCoste()+"')";
	           stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
	       
	           
	           rs = stmt.getGeneratedKeys();

	           //Se recupera al igual que cualquier otro registro y se asigna el valor a la variable codigo
	           if (rs.next()) {
	        	   codigo = rs.getInt(1);
	           } else {
	        	   //Manejar la excepcin
	           }
		       stmt.close();
		       rs.close();
	       }
	       catch (Exception e)
	       {
	    	   throw new ExcepcionIntegracion(e.getMessage());
	       }
		
		return codigo;
	}
	
	@Override
	public Boolean updateProyecto(TProyecto p) throws ExcepcionIntegracion {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "";
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		Boolean sw = false;
		        
        		
		try{
			stmt = con.createStatement();
	           sql="SELECT * FROM Proyectos WHERE idProyecto="+p.getIdProyecto();
	           rs=stmt.executeQuery(sql);
	       
	           if (rs.next()){
	               sw = true;
	           }         
	       
		   if (sw){
		           sql="update Proyectos SET "
		           		   + "nombre='"+p.getNombre()+"',"
		        		   + "idJefe="+p.getIdJefe()+","
		        		   + "activo="+p.getActivo()+","
		        		   + "coste="+p.getCoste()
		        		   + " WHERE idProyecto="+p.getIdProyecto();
		           stmt.executeUpdate(sql);
		           sw=true;	           
		           
		      
	       }
		   stmt.close();
	       rs.close();
		 }
	    catch (Exception e)
	    {
	 	   throw new ExcepcionIntegracion(e.getMessage());
	    }
		
		return sw;
	}

	@Override
	public Boolean deleteProyecto(TProyecto p) throws ExcepcionIntegracion {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "";
		
		Boolean sw = false;
		        
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		try{
			stmt = con.createStatement();
	           sql="SELECT * FROM Proyectos WHERE idProyecto="+p.getIdProyecto();
	           rs=stmt.executeQuery(sql);
	      
	           if (rs.next()){
	               sw = true;
	           }         
	      
		   if (sw){
		           sql="update Proyectos set activo=false where idProyecto="+p.getIdProyecto();
		           stmt.executeUpdate(sql);
		           sw=true;	           
		       
			       
	       }
		   stmt.close();
	       rs.close();
		  }
	       catch (Exception e)
	       {
	    	   throw new ExcepcionIntegracion(e.getMessage());
	       }
		
		return sw;
	}

	@Override
	public TProyecto readProyecto(TProyecto p) throws ExcepcionIntegracion {
		TProyecto miProyecto=null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
			       
	       try{
	    	   stmt = con.createStatement();
	           String sql="SELECT * FROM Proyectos WHERE idProyecto="+p.getIdProyecto();
	           rs=stmt.executeQuery(sql);
	       
	           if (rs.next()){
	        	 
	        	   miProyecto=new TProyecto(rs.getInt("idProyecto"), rs.getString("nombre"), rs.getInt("idJefe"),
	        			   rs.getBoolean("activo"), rs.getDouble("coste"));
	               
	           }else{
	        	   miProyecto=null;
	           }
		     stmt.close();
		     rs.close();
	           
	       }
	       catch (Exception e){
	    	   throw new ExcepcionIntegracion("Error en la busqueda del proyecto");
	       }
	       return miProyecto;
	}

	@Override
	public ArrayList<TProyecto> readAllProyectos() throws ExcepcionIntegracion {
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
	           sql = "SELECT * FROM Proyectos";
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
	    	   throw new ExcepcionIntegracion("Error en la busqueda del proyecto");
	       }
	    
		return misProyectos;
	}

	@Override
	public TProyecto readProyectoByNombre(TProyecto p) throws ExcepcionIntegracion{
		TProyecto miProyecto=null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
			       
	       try{
	    	   stmt = con.createStatement();
	           String sql="SELECT * FROM Proyectos WHERE nombre="+p.getNombre();
	           rs=stmt.executeQuery(sql);
	       
	           if (rs.next()){
	        	 
	        	   miProyecto=new TProyecto(rs.getInt("idProyecto"), rs.getString("nombre"), rs.getInt("idJefe"),
	        			   rs.getBoolean("activo"), rs.getDouble("coste"));
	               
	           }else{
	        	   miProyecto=null;
	           }
		     stmt.close();
		     rs.close();
	           
	       }
	       catch (Exception e){
	    	   throw new ExcepcionIntegracion("Error en la busqueda del Proyecto");
	       }
	       return miProyecto;
	}
}