/**
 * 
 */
package MySystemDAO.Presentacion.JPrincipal;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import MySystemDAO.Presentacion.Empleado.VistaGeneralEmpleado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rbn99
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class JPrincipalMySystem extends JFrame {
//	private V PanelCliente;
//	/** 
//	 * <!-- begin-UML-doc -->
//	 * <!-- end-UML-doc -->
//	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
//	 */
//	private VistaGeneralFactura PanelFactura;
//	/** 
//	 * <!-- begin-UML-doc -->
//	 * <!-- end-UML-doc -->
//	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
//	 */
	private JTabbedPane PanelPesta�as;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JPanel PanelPrincipal;
//	/** 
//	 * <!-- begin-UML-doc -->
//	 * <!-- end-UML-doc -->
//	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
//	 */
	private VistaGeneralEmpleado PanelEmpleado;
//	
//	private VistaGeneralDepartamento PanelDepartamento;
//	
//	private VistaGeneralCurso PanelCurso;
//	
//	private VistaGeneralEmpleado PanelEmpleado;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public JPrincipalMySystem() {
		// begin-user-code
		// LOGO Y T�TULO
		super("MySystem");
//		try {
//			java.net.URL url = this.getClass().getClassLoader()
//					.getResource("img" + java.io.File.separator + "logo.png");
//			java.awt.image.BufferedImage image = javax.imageio.ImageIO
//					.read(url);
//			this.setIconImage(new javax.swing.ImageIcon(image).getImage());
//		} catch (IOException e) {
//			// TODO Bloque catch generado autom�ticamente
//			e.printStackTrace();
//		}

		initComponents();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initComponents() {
		// begin-user-code	
		initPanelOperaciones();

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private void initPanelOperaciones() {
		// begin-user-code

		PanelPrincipal = new javax.swing.JPanel();
		PanelPesta�as = new javax.swing.JTabbedPane();
		PanelEmpleado = new VistaGeneralEmpleado();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

		PanelPesta�as.setBackground(new java.awt.Color(204, 204, 204));
		PanelPesta�as.setBorder(javax.swing.BorderFactory.createBevelBorder(
				javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255,
						102, 0), new java.awt.Color(255, 102, 0),
				new java.awt.Color(255, 102, 0),
				new java.awt.Color(255, 102, 0)));
		PanelPesta�as.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

		PanelPesta�as.addTab("Empleado", PanelEmpleado);

		
		javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(
				PanelPrincipal);
		PanelPrincipal.setLayout(PanelPrincipalLayout);
		PanelPrincipalLayout.setHorizontalGroup(PanelPrincipalLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
				.addGroup(
						PanelPrincipalLayout.createSequentialGroup()
								.addContainerGap().addComponent(PanelPesta�as)
								.addContainerGap()));
		PanelPrincipalLayout.setVerticalGroup(PanelPrincipalLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
				.addGroup(
						PanelPrincipalLayout.createSequentialGroup()
								.addContainerGap().addComponent(PanelPesta�as)
								.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.CENTER).addGroup(
				layout.createSequentialGroup().addContainerGap()
						.addComponent(PanelPrincipal).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.CENTER).addGroup(
				layout.createSequentialGroup().addContainerGap()
						.addComponent(PanelPrincipal).addContainerGap()));

		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		// end-user-code
	}
}