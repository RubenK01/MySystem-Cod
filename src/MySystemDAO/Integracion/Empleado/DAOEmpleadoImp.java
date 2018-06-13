/**
 * 
 */
package MySystemDAO.Integracion.Empleado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import MySystemDAO.Integracion.ExcepcionesIntegracion.ExcepcionIntegracion;
import MySystemDAO.Integracion.TransactionManager.TransactionManager;
import MySystemDAO.Integracion.Transactions.Transaction;
import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Negocio.Empleado.TEmpleadoExterno;
import MySystemDAO.Negocio.Empleado.TEmpleadoInterno;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOEmpleadoImp implements DAOEmpleado {
	@Override
	public TEmpleado readEmpleado(TEmpleado emp) throws ExcepcionIntegracion{
		TEmpleado miEmp = null;
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		Connection con = (Connection) transaction.getResource();
		Statement stmt;
		ResultSet rs = null;
		
		String nombre;
		String dni;
		int idProyecto, idEmpleado;
		String tipoEmpleado;
		boolean activo;
		int duracion;
		double costeFormacion;
		
				
		 //:::COMPROBAMOS DE QUE TIPO SE TRATA:::
	    try{
	    		stmt = con.createStatement();
	           String sql="SELECT * FROM Empleados WHERE idEmpleado="+ emp.getIdEmpleado();
	           rs=stmt.executeQuery(sql);
	       
	    	if (rs.next()){
	    		idEmpleado = rs.getInt("idEmpleado");
	    		nombre = rs.getString("nombre");
	    		dni = rs.getString("dni");
	    		idProyecto = rs.getInt("idProyecto");
	    		tipoEmpleado = rs.getString("tipoEmpleado");
	    		activo = rs.getBoolean("activo");
	    		
	    		if(rs.getString("tipoEmpleado").equalsIgnoreCase("interno")){
	    			
    				 sql="SELECT * FROM EmpleadosInternos WHERE idEmpleado="+emp.getIdEmpleado();
        	        rs=stmt.executeQuery(sql);
	    			
	    			if (rs.next()){
    					costeFormacion = rs.getDouble("costeFormacion");
    					miEmp = new TEmpleadoInterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, rs.getInt("idEmpleadoInterno"), idEmpleado, costeFormacion);
	    	        }
//	    			else {
//	    				TEmpleadoInterno empInterno = (TEmpleadoInterno) emp;
//	 	   			   	sql="INSERT INTO EmpleadosInternos(CosteFormacion,idEmpleado) VALUES ("+empInterno.getCosteFormacion()+","+emp.getIdEmpleado()+")";
//	 	   			   	stmt.executeUpdate(sql, com.mysql.jdbc.Statement.RETURN_GENERATED_KEYS);
//		 	   			rs = stmt.getGeneratedKeys();
//		 	   			if (rs.next()) {
//		 	         	   //codigo = rs.getInt(1);
//		 	            }
//	 	   			   	
//			 	   		sql="SELECT * FROM EmpleadosInternos WHERE idEmpleado="+emp.getIdEmpleado();
//	        	        rs=stmt.executeQuery(sql);
//	        	        
//	        	        if(rs.next()) {
//	        	        	costeFormacion = rs.getDouble("costeFormacion");
//	    					miEmp = new TEmpleadoInterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, rs.getInt("idEmpleadoInterno"), idEmpleado, costeFormacion);
//	        	        }
//        	        
//	    			}
	    		}
	    		else if(rs.getString("tipoEmpleado").equalsIgnoreCase("externo")){
	    			
    				 sql="SELECT * FROM EmpleadosExternos WHERE idEmpleado="+emp.getIdEmpleado();
        	        rs=stmt.executeQuery(sql);
	    			
	    			if (rs.next()){
    					duracion = rs.getInt("duracion");
    					miEmp = new TEmpleadoExterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, rs.getInt("idEmpleadoExterno"), idEmpleado, duracion);
	    	        }
//	    			else {
//	    				TEmpleadoExterno empExterno = (TEmpleadoExterno) emp;
//	 	   			   	sql="INSERT INTO EmpleadosExternos(Duracion,idEmpleado) VALUES ("+empExterno.getDuracion()+","+emp.getIdEmpleado()+")";
//	 	   			   	stmt.executeUpdate(sql, com.mysql.jdbc.Statement.RETURN_GENERATED_KEYS);
//	 	   			   	
//	 	   			   	rs = stmt.getGeneratedKeys();
//		 	   			if (rs.next()) {
//		 	         	   //codigo = rs.getInt(1);
//		 	            }
//	 	   			   	
//	 	   			   	sql="SELECT * FROM EmpleadosExternos WHERE idEmpleado="+emp.getIdEmpleado();
//	        	        rs=stmt.executeQuery(sql);
//	        	        
//	        	        if(rs.next()) {
//	        	        	duracion = rs.getInt("duracion");
//	    					miEmp = new TEmpleadoExterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, rs.getInt("idEmpleadoExterno"), idEmpleado, duracion);
//	        	        }
//	        	        
//	        	        
//	    			}
	    			
	    		}
		        stmt.close();
		        rs.close();
	    	}
	    }
	    catch (Exception e){
	    	   throw new ExcepcionIntegracion("Error en la busqueda del empleado");
	       }
	    
		return miEmp;
				
	}

	@Override
	public int createEmpleado(TEmpleado emp) throws ExcepcionIntegracion{
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
			sql = "INSERT INTO Empleados(nombre, dni, idProyecto, activo, tipoEmpleado) VALUES ('"
					+ emp.getNombre()+"','"
					+ emp.getDni()+"',"
					+ emp.getIdProyecto()+","
					+ emp.getActivo()+",'"
					+ emp.getTipoEmpleado()+"')";
			stmt.executeUpdate(sql, com.mysql.jdbc.Statement.RETURN_GENERATED_KEYS);
		
			
			rs = stmt.getGeneratedKeys();
			
			//Se recupera al igual que cualquier otro registro y se asigna el valor a la variable codigo
           if (rs.next()) {
        	   codigo = rs.getInt(1);
           }
           
           try{
	   		   if (emp.getTipoEmpleado().equalsIgnoreCase("interno")){
	   			   TEmpleadoInterno empInterno = (TEmpleadoInterno) emp;
	   			   sql="INSERT INTO EmpleadosInternos(CosteFormacion,idEmpleado) VALUES ("+empInterno.getCosteFormacion()+","+codigo+")";
	   		   }
	   		   else if (emp.getTipoEmpleado().equalsIgnoreCase("externo")){
	   			   TEmpleadoExterno empExterno = (TEmpleadoExterno) emp;
	   			   sql="INSERT INTO EmpleadosExternos(Duracion,idEmpleado) VALUES ("+empExterno.getDuracion()+","+codigo+")";
	   	           
	   		   }
	   		   stmt.executeUpdate(sql);
	   	   }
	   	   catch (Exception e){
	   	    	   throw new ExcepcionIntegracion("Error SQL al insertar un empleado en la BBDD.");
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
	public boolean updateEmpleado(TEmpleado emp) throws ExcepcionIntegracion{
		Connection con = null;
		Statement stmt = null;
		String sql = "";
		ResultSet rs = null;
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		Boolean resul = false;
		
				
		//:::MODIFICACIÓN DE UN EMPLEADO:::
	    try{
	    	stmt = con.createStatement();
	           sql="update Empleados SET "
	           		   + "nombre='"+emp.getNombre()+"',"
	        		   + "dni='"+emp.getDni()+"',"
	        		   + "idProyecto="+emp.getIdProyecto()+","
	        		   + "tipoEmpleado='"+emp.getTipoEmpleado()+"',"
	        		   + "activo="+emp.getActivo()
	        		   + " WHERE idEmpleado="+emp.getIdEmpleado();
	           stmt.executeUpdate(sql);
	           resul=true;	           
	    
	           
	           try{
	        	   if (emp.getTipoEmpleado().equalsIgnoreCase("interno")){
	        		   
		   			   TEmpleadoInterno empInt = (TEmpleadoInterno) emp;
		   			   
		   			   sql ="SELECT * from EmpleadosInternos WHERE idEmpleado=" + emp.getIdEmpleado();
		   			   rs = stmt.executeQuery(sql);
		   			   if(rs.next()) {
		   				sql="update EmpleadosInternos SET "
				        		   + "costeFormacion="+empInt.getCosteFormacion()+" WHERE idEmpleado="+emp.getIdEmpleado();
		   			   }
		   			   else {
		   				sql="INSERT INTO EmpleadosInternos(CosteFormacion,idEmpleado) VALUES ("+empInt.getCosteFormacion()+","+emp.getIdEmpleado()+")";
		   			   }
		   			   
		   			   
		   		   }
		   		   else if (emp.getTipoEmpleado().equalsIgnoreCase("externo")){
		   			   TEmpleadoExterno empExt = (TEmpleadoExterno) emp;
		   			   
		   			   sql ="SELECT * from EmpleadosExternos WHERE idEmpleado=" + emp.getIdEmpleado();
		   			   rs = stmt.executeQuery(sql);
		   			   if(rs.next()) {
		   				 sql="update EmpleadosExternos SET "
				        		   + "duracion="+empExt.getDuracion()+" WHERE idEmpleado="+emp.getIdEmpleado();
		   			   }
		   			   else {
		   				sql="INSERT INTO EmpleadosExternos(duracion,idEmpleado) VALUES ("+empExt.getDuracion()+","+emp.getIdEmpleado()+")";
		   			   }
		   			  
		   		   }
		           stmt.executeUpdate(sql);
		           resul=true;	           
		       }
		       catch (Exception e)
		       {
		    	   throw new ExcepcionIntegracion("Error SQL al modificar un empleado en la BBDD.");
		       }
		       stmt.close();
	     }
	     catch (Exception e)
	     {
	       throw new ExcepcionIntegracion(e.getMessage());
	     }
	     return resul;
	}

	@Override
	public boolean deleteEmpleado(TEmpleado emp) throws ExcepcionIntegracion{
		boolean sw = false;
		Connection con = null;
		Statement stmt = null;
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		
		//:::BORRAR UN empleado:::
	    try{ 
	    	stmt = con.createStatement();
            String sql="update Empleados set activo=false where idEmpleado="+emp.getIdEmpleado();
            stmt.executeUpdate(sql);
            sw=true;
        
		    stmt.close();
        }
        catch (Exception e)
        {
        	throw new ExcepcionIntegracion(e.getMessage());
        }
        return sw;
	}

	@Override
	public ArrayList<TEmpleado> readAllEmpleado() throws ExcepcionIntegracion{
		TEmpleado miEmp = null;
		ArrayList<TEmpleado> misEmpleados = new ArrayList<TEmpleado>();
		Connection con = null;
		Statement stmt = null;
		Statement stmt2 = null;
		ResultSet rs = null, rs2 = null;
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		String sql;
		int idEmpleado, idEmpleadoInterno, idEmpleadoExterno;
		String nombre;
		String dni;
		int idProyecto;
		String tipoEmpleado;
		boolean activo;
		int duracion;
		double costeFormacion;
		
		
		//:::CONSULTAMOS A LA BBDD:::
		try{
			stmt = con.createStatement();
			stmt2 = con.createStatement();
	           sql = "SELECT * FROM Empleados";
	           rs=stmt.executeQuery(sql);
	    
	    	   
	    	   //Aadimos a la lista todos los empleados encontrados en la base de datos.
	    	   while(rs.next()){
	    		   	idEmpleado = rs.getInt("idEmpleado");
	    		   	nombre = rs.getString("nombre");
		    		dni = rs.getString("dni");
		    		idProyecto = rs.getInt("idProyecto");
		    		tipoEmpleado = rs.getString("tipoEmpleado");
		    		activo = rs.getBoolean("activo");
		       		
	        	   if ("interno".equalsIgnoreCase(tipoEmpleado)){
	        		   sql = "SELECT * FROM EmpleadosInternos WHERE idEmpleado="+rs.getInt("idEmpleado");
	        		   rs2=stmt2.executeQuery(sql);
	        		   if (rs2.next()){
	        			   idEmpleadoInterno = rs2.getInt("idEmpleadoInterno");
	        			   costeFormacion = rs2.getDouble("costeFormacion");
	        	    	   TEmpleadoInterno auxmiempleado = new TEmpleadoInterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, idEmpleadoInterno, idEmpleado, costeFormacion);
	        	    	   miEmp = auxmiempleado;
	        	    	   miEmp.setIdEmpleado(idEmpleado);
	        	    	   misEmpleados.add(miEmp);
	    	           }else{
	    	        	   throw new ExcepcionIntegracion("No encuentro el empleado interno al listar");
	    	           }
	        	   }
	        	   else if("externo".equalsIgnoreCase(tipoEmpleado)){
	        		   sql = "SELECT * FROM EmpleadosExternos WHERE idEmpleado="+rs.getInt("idEmpleado");
	        		   rs2=stmt2.executeQuery(sql);
	        		   if (rs2.next()){
	        			   idEmpleadoExterno = rs2.getInt("idEmpleadoExterno");
	        			   duracion = rs2.getInt("duracion");
	        	    	   TEmpleadoExterno auxmiemp = new TEmpleadoExterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, idEmpleadoExterno, idEmpleado, duracion);
	        			   miEmp = auxmiemp;
	        			   miEmp.setIdEmpleado(idEmpleado);
	        			   misEmpleados.add(miEmp);
	    	           }else{
	    	        	   throw new ExcepcionIntegracion("No encuentro el empleado externo al listar");
	    	           }
	        	   }
	           }
	           
		       stmt.close();
		       stmt2.close();
		       rs.close();
		       rs2.close();
	    }catch (Exception e){
	    	throw new ExcepcionIntegracion("Error en listar un empleado.");
	    }
		return misEmpleados;
		
	}

	@Override
	public TEmpleado readEmpleadoByDNI(TEmpleado emp) throws ExcepcionIntegracion{
		TEmpleado miEmp = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		String nombre;
		String dni;
		int idProyecto, idEmpleado;
		String tipoEmpleado;
		boolean activo;
		int duracion;
		double costeFormacion;
		
		
		 //:::COMPROBAMOS DE QUE TIPO DE empleado SE TRATA:::
	    try{
	    	stmt = con.createStatement();
	           String sql="SELECT * FROM Empleados WHERE dni='"+ emp.getDni()+"'";
	           rs=stmt.executeQuery(sql);
	       
	    	if (rs.next()){
	    		idEmpleado = rs.getInt("idEmpleado");
	    		nombre = rs.getString("nombre");
	    		dni = rs.getString("dni");
	    		idProyecto = rs.getInt("idProyecto");
	    		tipoEmpleado = rs.getString("tipoEmpleado");
	    		activo = rs.getBoolean("activo");
	    		
	    		if(tipoEmpleado.equalsIgnoreCase("interno")){
	    			
    				sql="SELECT * FROM EmpleadosInternos WHERE idEmpleado="+ idEmpleado;
        	        rs=stmt.executeQuery(sql);
	    			
	    			if (rs.next()){
    					costeFormacion = rs.getDouble("costeFormacion");
    					miEmp = new TEmpleadoInterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, rs.getInt("idEmpleadoInterno"), idEmpleado, costeFormacion);
	    	        }
	    		}
	    		else if(tipoEmpleado.equalsIgnoreCase("externo")){
	    			
    				sql="SELECT * FROM EmpleadosExternos WHERE idEmpleado="+ idEmpleado;
        	        rs=stmt.executeQuery(sql);
	    			
	    			if (rs.next()){
    					duracion = rs.getInt("duracion");
    					miEmp = new TEmpleadoExterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, rs.getInt("idEmpleadoExterno"), idEmpleado, duracion);
	    	        }
	    		}
		        stmt.close();
		        rs.close();
	    	}
	    }
	    catch (Exception e){
	    	   throw new ExcepcionIntegracion("Error en la busqueda del empleado");
	       }
	    
		return miEmp;
	}

	@Override
	public ArrayList<TEmpleado> readEmpleadosPorProyecto(TEmpleado emp) throws ExcepcionIntegracion{
		TEmpleado miEmp = null;
		ArrayList<TEmpleado> misEmpleados = new ArrayList<TEmpleado>();
		Connection con = null;
		Statement stmt = null;
		Statement stmt2 = null;
		ResultSet rs = null, rs2 = null;
		
		Transaction transaction = TransactionManager.getInstance()
				.getTransaction();
		con = (Connection) transaction.getResource();
		
		String sql;
		int idEmpleado, idEmpleadoInterno, idEmpleadoExterno;
		String nombre;
		String dni;
		int idProyecto;
		String tipoEmpleado;
		boolean activo;
		int duracion;
		double costeFormacion;
		
		
		//:::CONSULTAMOS A LA BBDD:::
		try{
			stmt = con.createStatement();
			stmt2 = con.createStatement();
	           sql = "SELECT * FROM Empleados WHERE idProyecto = " + emp.getIdProyecto();
	           rs=stmt.executeQuery(sql);
	    
	    	   
	    	   //Aadimos a la lista todos los empleados encontrados en la base de datos.
	    	   while(rs.next()){
	    		   	idEmpleado = rs.getInt("idEmpleado");
	    		   	nombre = rs.getString("nombre");
		    		dni = rs.getString("dni");
		    		idProyecto = rs.getInt("idProyecto");
		    		tipoEmpleado = rs.getString("tipoEmpleado");
		    		activo = rs.getBoolean("activo");
		       		
	        	   if (tipoEmpleado.equalsIgnoreCase("interno")){
	        		   sql = "SELECT * FROM EmpleadosInternos WHERE idEmpleado="+rs.getInt("idEmpleado");
	        		   rs2=stmt2.executeQuery(sql);
	        		   if (rs2.next()){
	        			   idEmpleadoInterno = rs2.getInt("idEmpleadoInterno");
	        			   costeFormacion = rs2.getDouble("costeFormacion");
	        	    	   TEmpleadoInterno auxmiempleado = new TEmpleadoInterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, idEmpleadoInterno, idEmpleado, costeFormacion);
	        	    	   miEmp = auxmiempleado;
	        	    	   miEmp.setIdEmpleado(idEmpleado);
	        	    	   misEmpleados.add(miEmp);
	    	           }else{
	    	        	   throw new ExcepcionIntegracion("No encuentro el empleado interno al listar");
	    	           }
	        	   }
	        	   else if(tipoEmpleado.equalsIgnoreCase("externo")){
	        		   sql = "SELECT * FROM EmpleadosExternos WHERE idEmpleado="+rs.getInt("idEmpleado");
	        		   rs2=stmt2.executeQuery(sql);
	        		   if (rs2.next()){
	        			   idEmpleadoExterno = rs2.getInt("idEmpleadoExterno");
	        			   duracion = rs2.getInt("duracion");
	        	    	   TEmpleadoExterno auxmiemp = new TEmpleadoExterno(idEmpleado, nombre, dni, idProyecto, tipoEmpleado, activo, idEmpleadoExterno, idEmpleado, duracion);
	        			   miEmp = auxmiemp;
	        			   miEmp.setIdEmpleado(idEmpleado);
	        			   misEmpleados.add(miEmp);
	    	           }else{
	    	        	   throw new ExcepcionIntegracion("No encuentro el empleado externo al listar");
	    	           }
	        	   }
	           }
	           
		       stmt.close();
		       stmt2.close();
		       rs2.close();
		       rs.close();
	    }catch (Exception e){
	    	throw new ExcepcionIntegracion("Error en listar empleados.");
	    }
		return misEmpleados;
	}
}