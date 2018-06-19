/**
 * 
 */
package MySystemDAO.Negocio.Proyecto;

import java.util.ArrayList;

import MySystemDAO.Integracion.Empleado.DAOEmpleado;
import MySystemDAO.Integracion.ExcepcionesIntegracion.ExcepcionIntegracion;
import MySystemDAO.Integracion.FactoriaDAO.FactoriaDAO;
import MySystemDAO.Integracion.FactoriaQuery.FactoriaQuery;
import MySystemDAO.Integracion.Proyecto.DAOProyecto;
import MySystemDAO.Integracion.Query.Query;
import MySystemDAO.Integracion.TransactionManager.TransactionManager;
import MySystemDAO.Integracion.Transactions.Transaction;
import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Negocio.ExcepcionesNegocio.ExcepcionNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAProyectoImp implements SAProyecto {
	
	/*
	 * codigo = 0 si se cambia atributo activo, >0 si se crea nuevo(sin Javadoc)
	 * @see MySystemDAO.Negocio.Proyecto.SAProyecto#createProyecto(MySystemDAO.Negocio.Proyecto.TProyecto)
	 */
	@Override
	public int createProyecto(TProyecto proy) throws ExcepcionNegocio{
		int codigo = -1;
		
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOProyecto daoProy = FactoriaDAO.getInstance().createDAOProyecto();
			
			try {
				TProyecto miProy = daoProy.readProyectoByNombre(proy);
				
				if(miProy == null){
					codigo = daoProy.createProyecto(proy);
					t.commit();
				}
				else if (miProy != null && miProy.getActivo() == false){
					proy.setActivo(true);
					proy.setIdProyecto(miProy.getIdProyecto());
					if(daoProy.updateProyecto(proy)){
						codigo = 0;
						t.commit();
					}
					else
						t.rollback();
				}
				else{
					codigo = -1;
					t.rollback();
				}
				
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
		}
		
		return codigo;		
	}

	@Override
	public TProyecto readProyecto(TProyecto proy) throws ExcepcionNegocio{
		TProyecto miProy = null;
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOProyecto daoProy = FactoriaDAO.getInstance().createDAOProyecto();
			
			try {
				miProy = daoProy.readProyecto(proy);
				
				if(miProy == null){
					t.rollback();
				}
				else{
					t.commit();
				}
				
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
		}		
		
		return miProy;
	}

	@Override
	public boolean updateProyecto(TProyecto proy) throws ExcepcionNegocio{
		boolean resul = false;
		
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOProyecto daoProy = FactoriaDAO.getInstance().createDAOProyecto();
			
			try {
				TProyecto miProy = daoProy.readProyecto(proy);
				
				if(miProy == null){
					t.rollback();
				}
				else{
					miProy = daoProy.readProyectoByNombre(proy);
					
					if(miProy == null || miProy.getIdProyecto() == proy.getIdProyecto()) {
						if(!proy.getActivo()) {
							DAOEmpleado daoEmp = FactoriaDAO.getInstance().createDAOEmpleado();
							
							TEmpleado emp = new TEmpleado();
							emp.setIdProyecto(proy.getIdProyecto());
							
							ArrayList<TEmpleado> misEmpleados = daoEmp.readEmpleadosPorProyecto(emp);
							
							Boolean todosInactivos = true;
							
							for(TEmpleado empleado : misEmpleados) {
								if(empleado.getActivo())
									todosInactivos = false;
							}
							
							if(todosInactivos) {
								resul = daoProy.updateProyecto(proy);
							}
							else {
								t.rollback();
								
								throw new ExcepcionNegocio("Hay empleados activos asignados a este proyecto.");
							}	
						}
						else
							resul = daoProy.updateProyecto(proy);
											
						
					}
						
					else {
						throw new ExcepcionNegocio("El nombre del proyecto ya existe."); 
					}
					if(resul){
						t.commit();
					}
					else{
						t.rollback();
					}
				}				
				
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
		}
		
		return resul;
	}

	@Override
	public boolean deleteProyecto(TProyecto proy) throws ExcepcionNegocio{
		boolean resul = false;
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOProyecto daoProy = FactoriaDAO.getInstance().createDAOProyecto();
			
			try {
				TProyecto miProy = daoProy.readProyecto(proy);
				
				if(miProy == null || miProy.getActivo() == false){
					t.rollback();
				}
				else{
					DAOEmpleado daoEmp = FactoriaDAO.getInstance().createDAOEmpleado();
					
					TEmpleado emp = new TEmpleado();
					emp.setIdProyecto(miProy.getIdProyecto());
					
					ArrayList<TEmpleado> misEmpleados = daoEmp.readEmpleadosPorProyecto(emp);
					
					Boolean todosInactivos = true;
					
					for(TEmpleado empleado : misEmpleados) {
						if(empleado.getActivo())
							todosInactivos = false;
					}
					
					if(todosInactivos) {
						resul = daoProy.deleteProyecto(proy);
						
						if(resul)
							t.commit();
						else
							t.rollback();
					}
					else {
						t.rollback();
						
						throw new ExcepcionNegocio("Hay empleados activos asignados a este proyecto.");
					}
				}
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
		}
		return resul;
	}

	@Override
	public ArrayList<TProyecto> readAllProyectos() throws ExcepcionNegocio{
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		ArrayList<TProyecto> resul = new ArrayList<TProyecto>();
		if(t != null){
			t.start();
			
			DAOProyecto daoProy = FactoriaDAO.getInstance().createDAOProyecto();
			try {
				resul = daoProy.readAllProyectos();
				t.commit();
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
			
		}
		return resul;	
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<TProyecto> readProyectosConTresEmpleados() throws ExcepcionNegocio{
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		ArrayList<TProyecto> resul = new ArrayList<TProyecto>();
		if(t != null){
			t.start();
			
			Query qry = FactoriaQuery.getInstance().createQuery();
			try {
				resul = (ArrayList<TProyecto>) qry.execute(null);
				t.commit();
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
			
		}
		return resul;	
	}

	@Override
	public TProyecto readProyectoByNombre(TProyecto proy) throws ExcepcionNegocio{
		TProyecto miProy = null;
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOProyecto daoProy = FactoriaDAO.getInstance().createDAOProyecto();
			
			try {
				miProy = daoProy.readProyectoByNombre(proy);
				
				if(miProy == null){
					t.rollback();
				}
				else{
					t.commit();
				}
				
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
		}		
		
		return miProy;	
	}
}