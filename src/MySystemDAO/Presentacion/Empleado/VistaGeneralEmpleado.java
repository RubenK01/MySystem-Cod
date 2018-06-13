package MySystemDAO.Presentacion.Empleado;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class VistaGeneralEmpleado extends JPanel {
	private JButton botonAltaEmpleado;
	
	private JButton botonBajaEmpleado;
	
	private JButton botonListarEmpleado;
	
	private JButton botonModificarEmpleado;
	
	private JButton botonDetalleEmpleado;
	
	private JButton botonEmpleadosPorProyecto;
	
	private JPanel PanelDerecha;
	
	private JPanel PanelBotones;

	public VistaGeneralEmpleado() {
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
		botonAltaEmpleado = new javax.swing.JButton();
		botonBajaEmpleado = new javax.swing.JButton();
		botonListarEmpleado = new javax.swing.JButton();
		botonEmpleadosPorProyecto = new javax.swing.JButton();
		botonModificarEmpleado = new javax.swing.JButton();
		botonDetalleEmpleado = new javax.swing.JButton();
		PanelDerecha = new javax.swing.JPanel();
		PanelBotones = new javax.swing.JPanel();

		botonAltaEmpleado.setBackground(new java.awt.Color(255, 102, 0));
		botonAltaEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonAltaEmpleado.setText("Alta");
		botonAltaEmpleado
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonAltaEmpleado
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonAltaEmpleadoActionPerformed(evt);
					}
				});

		botonBajaEmpleado.setBackground(new java.awt.Color(255, 102, 0));
		botonBajaEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonBajaEmpleado.setText("Baja");
		botonBajaEmpleado
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonBajaEmpleado
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonBajaEmpleadoActionPerformed(evt);
					}
				});

		botonModificarEmpleado.setBackground(new java.awt.Color(255, 102, 0));
		botonModificarEmpleado
				.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonModificarEmpleado.setText("Modificar");
		botonModificarEmpleado
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonModificarEmpleado
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonModificarEmpleadoActionPerformed(evt);
					}
				});

		botonDetalleEmpleado.setBackground(new java.awt.Color(255, 102, 0));
		botonDetalleEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1,
				14)); // NOI18N
		botonDetalleEmpleado.setText("Ver Detalles");
		botonDetalleEmpleado
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonDetalleEmpleado
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonDetallesEmpleadoActionPerformed(evt);
					}
				});

		botonListarEmpleado.setBackground(new java.awt.Color(255, 102, 0));
		botonListarEmpleado.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonListarEmpleado.setText("Listar");
		botonListarEmpleado
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonListarEmpleado
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonListarEmpleadoActionPerformed(evt);
					}
				});
		
		
		botonEmpleadosPorProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonEmpleadosPorProyecto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
		botonEmpleadosPorProyecto.setText("EmpleadosByProyecto");
		botonEmpleadosPorProyecto
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
						1, new java.awt.Color(255, 102, 0)));
		botonEmpleadosPorProyecto
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						botonListarEmpleadosPorProyectoActionPerformed(evt);
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
																				botonEmpleadosPorProyecto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonListarEmpleado,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonDetalleEmpleado,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonModificarEmpleado,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonBajaEmpleado,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				129,
																				Short.MAX_VALUE)
																		.addComponent(
																				botonAltaEmpleado,
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
																botonAltaEmpleado,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonBajaEmpleado,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonModificarEmpleado,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonDetalleEmpleado,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonListarEmpleado,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																37,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(
																botonEmpleadosPorProyecto,
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

		javax.swing.GroupLayout PanelEmpleadoLayout = new javax.swing.GroupLayout(
				this);
		this.setLayout(PanelEmpleadoLayout);
		PanelEmpleadoLayout.setHorizontalGroup(PanelEmpleadoLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						PanelEmpleadoLayout
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
		PanelEmpleadoLayout
				.setVerticalGroup(PanelEmpleadoLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								PanelEmpleadoLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												PanelEmpleadoLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																PanelBotones,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																PanelEmpleadoLayout
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
	protected void botonAltaEmpleadoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaCreateEmpleado.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonBajaEmpleadoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaDeleteEmpleado.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonDetallesEmpleadoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadEmpleado.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonListarEmpleadoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadAllEmpleados.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}
	
	protected void botonListarEmpleadosPorProyectoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaReadEmpleadosByProyecto.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}


	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param evt
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void botonModificarEmpleadoActionPerformed(ActionEvent evt) {
		// begin-user-code		
		PanelDerecha.removeAll();
		PanelDerecha.repaint();
		PanelDerecha.revalidate();
		PanelDerecha.add(VentanaUpdateEmpleado.getInstance().initGUI());
		this.add(PanelDerecha);
		// end-user-code
	}
}
