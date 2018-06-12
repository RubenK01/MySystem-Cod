/**
 * 
 */
package MySystemDAO.Negocio.Empleado;

import java.util.ArrayList;

import MySystemDAO.Integracion.Empleado.DAOEmpleado;
import MySystemDAO.Integracion.ExcepcionesIntegracion.ExcepcionIntegracion;
import MySystemDAO.Integracion.FactoriaDAO.FactoriaDAO;
import MySystemDAO.Integracion.TransactionManager.TransactionManager;
import MySystemDAO.Integracion.Transactions.Transaction;
import MySystemDAO.Negocio.ExcepcionesNegocio.ExcepcionNegocio;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAEmpleadoImp implements SAEmpleado {
	/*
	 * codigo = 0 si se cambia atributo activo, >0 si se crea nuevo
	 * @see MySystemDAO.Negocio.Empleado.SAEmpleado#crearEmpleado(MySystemDAO.Negocio.Empleado.TEmpleado)
	 */
	@Override
	public int crearEmpleado(TEmpleado emp) throws ExcepcionNegocio {
		int codigo = -1;
		
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOEmpleado daoEmp = FactoriaDAO.getInstance().createDAOEmpleado();
			
			try {
				TEmpleado miEmp = daoEmp.readEmpleadoByDNI(emp);
				
				if(miEmp == null){
					codigo = daoEmp.createEmpleado(emp);
					t.commit();
				}
				else if (miEmp != null && miEmp.getActivo() == false){
					emp.setActivo(true);
					emp.setIdEmpleado(miEmp.getIdEmpleado());
					if(daoEmp.updateEmpleado(emp)){
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
	public TEmpleado readEmpleado(TEmpleado emp) throws ExcepcionNegocio {
		TEmpleado miEmpleado = null;
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOEmpleado daoEmp = FactoriaDAO.getInstance().createDAOEmpleado();
			
			try {
				miEmpleado = daoEmp.readEmpleado(emp);
				
				if(miEmpleado == null){
					t.rollback();
				}
				else{
					t.commit();
				}
				
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
		}		
		
		return miEmpleado;
		
	}

	@Override
	public boolean updateEmpleado(TEmpleado emp) throws ExcepcionNegocio{
		boolean resul = false;
		
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOEmpleado daoEmp = FactoriaDAO.getInstance().createDAOEmpleado();
			
			try {
				TEmpleado miEmp = daoEmp.readEmpleado(emp);
				
				if(miEmp == null){
					t.rollback();
				}
				else{
					resul = daoEmp.updateEmpleado(emp);
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
	public boolean deleteEmpleado(TEmpleado emp) throws ExcepcionNegocio {
		boolean resul = false;
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		if(t != null){
			t.start();
			
			DAOEmpleado daoEmp = FactoriaDAO.getInstance().createDAOEmpleado();
			
			try {
				TEmpleado miEmp = daoEmp.readEmpleado(emp);
				
				if(miEmp == null || miEmp.getActivo() == false){
					t.rollback();
				}
				else{
					resul = daoEmp.deleteEmpleado(emp);
					
					if(resul)
						t.commit();
					else
						t.rollback();
				}
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
		}
		return resul;
	}

	@Override
	public ArrayList<TEmpleado> readAllEmpleado() throws ExcepcionNegocio {
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		ArrayList<TEmpleado> resul = new ArrayList<TEmpleado>();
		if(t != null){
			t.start();
			
			DAOEmpleado daoEmp = FactoriaDAO.getInstance().createDAOEmpleado();
			try {
				resul = daoEmp.readAllEmpleado();
				t.commit();
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
			
		}
		return resul;
	}

	@Override
	public ArrayList<TEmpleado> readAllEmpleadosPorProyecto(TEmpleado emp) throws ExcepcionNegocio {
		TransactionManager.getInstance().createTransaction();
		
		Transaction t = TransactionManager.getInstance().getTransaction();
		
		ArrayList<TEmpleado> resul = new ArrayList<TEmpleado>();
		if(t != null){
			t.start();
			
			DAOEmpleado daoEmp = FactoriaDAO.getInstance().createDAOEmpleado();
			
			try {
				resul = daoEmp.readEmpleadosPorProyecto(emp);
				
				t.commit();
			} catch (ExcepcionIntegracion e) {
				throw new ExcepcionNegocio(e.getMessage());
			}
			
		}
		return resul;
	}
}