/**
 * 
 */
package MySystemDAO.Integracion.Transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransactionImp implements Transaction {
	
	private Connection connection;


	String url = "jdbc:mysql://localhost:3306/MySystem";

	String username = "root";

	String password = "";

	public void start() {
		// begin-user-code
		//DriverManager driver = forName(oracle.jdbc.driver.OracleDriver).newInstance();
		try {
			connection = DriverManager.getConnection(url, username, password);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// end-user-code
	}

	public Object getResource() {
		// begin-user-code
		return connection;
		// end-user-code
	}

	public void commit() {
		try {
			connection.commit();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void rollback() {
		try {
			connection.rollback();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}