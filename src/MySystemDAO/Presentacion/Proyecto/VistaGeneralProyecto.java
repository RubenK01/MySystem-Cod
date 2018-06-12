package MySystemDAO.Presentacion.Proyecto;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import MySystemDAO.Presentacion.Proyecto.VentanaCreateProyecto;
import MySystemDAO.Presentacion.Proyecto.VentanaDeleteProyecto;
import MySystemDAO.Presentacion.Proyecto.VentanaReadAllProyectos;
import MySystemDAO.Presentacion.Proyecto.VentanaReadProyecto;
import MySystemDAO.Presentacion.Proyecto.VentanaUpdateProyecto;

public class VistaGeneralProyecto extends JPanel {
	private JButton botonAltaProyecto;
	
	private JButton botonBajaProyecto;
	
	private JButton botonListarProyecto;
	
	private JButton botonModificarProyecto;
	
	private JButton botonDetalleProyecto;
	
	private JPanel PanelDerecha;
	
	private JPanel PanelBotones;

	public VistaGeneralProyecto() {
		// begin-user-code
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
		botonAltaProyecto = new javax.swing.JButton();
		botonBajaProyecto = new javax.swing.JButton();
		botonListarProyecto = new javax.swing.JButton();
		botonModificarProyecto = new javax.swing.JButton();
		botonDetalleProyecto = new javax.swing.JButton();
		PanelDerecha = new javax.swing.JPanel();
		PanelBotones = new javax.swing.JPanel();

		botonAltaProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonAltaProyecto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonAltaProyecto.setText("Alta");
		botonAltaProyecto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonAltaProyecto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonAltaProyectoActionPerformed(evt);
					}
				});

		botonBajaProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonBajaProyecto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonBajaProyecto.setText("Baja");
		botonBajaProyecto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonBajaProyecto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonBajaProyectoActionPerformed(evt);
					}
				});

		botonModificarProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonModificarProyecto
				.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonModificarProyecto.setText("Modificar");
		botonModificarProyecto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonModificarProyecto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonModificarProyectoActionPerformed(evt);
					}
				});

		botonDetalleProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonDetalleProyecto.setFont(new java.awt.Font("Comic Sans MS", 1,
				14)); // NOI18N
		botonDetalleProyecto.setText("Ver Detalles");
		botonDetalleProyecto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonDetalleProyecto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonDetallesProyectoActionPerformed(evt);
					}
				});

		botonListarProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonListarProyecto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonListarProyecto.setText("Listar");
		botonListarProyecto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonListarProyecto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonListarProyectoActionPerformed(evt);
					}
				});


		javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(
				PanelBotones);
		PanelBotones.setLayout(PanelBotonesLayout);
		PanelBotonesLayout
				.setHorizontalGroup(PanelBotonesLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 167, Short.MAX_VALUE)
						.addGroup(
								PanelBotonesLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												PanelBotonesLayout
														.createSequentialGroup()
														.addGap(19, 19, 19)
														.addGroup(
																PanelBotonesLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				botonListarProyecto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonDetalleProyecto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonModificarProyecto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonBajaProyecto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonAltaProyecto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE))
														.addContainerGap(19,
																Short.MAX_VALUE))));
		PanelBotonesLayout
				.setVerticalGroup(PanelBotonesLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 510, Short.MAX_VALUE)
						.addGroup(
								PanelBotonesLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												PanelBotonesLayout
														.createSequentialGroup()
														.addGap(76, 76, 76)
														.addComponent(
																botonAltaProyecto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonBajaProyecto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonModificarProyecto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonDetalleProyecto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonListarProyecto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																37,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addContainerGap(185,
																Short.MAX_VALUE))));

		javax.swing.GroupLayout PanelDerechaLayout = new javax.swing.GroupLayout(
				PanelDerecha);
		PanelDerecha.setLayout(PanelDerechaLayout);
		PanelDerechaLayout.setHorizontalGroup(PanelDerechaLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 608, Short.MAX_VALUE));
		PanelDerechaLayout.setVerticalGroup(PanelDerechaLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 452, Short.MAX_VALUE));

		javax.swing.GroupLayout PanelProyectoLayout = new javax.swing.GroupLayout(
				this);
		this.setLayout(PanelProyectoLayout);
		PanelProyectoLayout.setHorizontalGroup(PanelProyectoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						PanelProyectoLayout
								.createSequentialGroup()
								.addGap(31, 31, 31)
								.addComponent(PanelBotones,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(PanelDerecha,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(22, Short.MAX_VALUE)));
		PanelProyectoLayout
				.setVerticalGroup(PanelProyectoLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								PanelProyectoLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												PanelProyectoLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																PanelBotones,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																PanelProyectoLayout
																		.createSequentialGroup()
																		.addGap(0,
																				0,
																				Short.MAX_VALUE)
																		.addComponent(
																				PanelDerecha,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonAltaProyectoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaCreateProyecto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonBajaProyectoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaDeleteProyecto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonDetallesProyectoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadProyecto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonListarProyectoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadAllProyectos.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}


	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonModificarProyectoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaUpdateProyecto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}
}
