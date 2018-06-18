package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Negocio.Empleado.TEmpleadoExterno;
import MySystemDAO.Negocio.Empleado.TEmpleadoInterno;
import MySystemDAO.Presentacion.Comandos.FactoriaComandos.FactoriaComandos;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

public class VentanaUpdateEmpleadoImp extends VentanaUpdateEmpleado {

	private JPanel PanelUpdateEmpleado;
	private JButton botonBuscarUpdateEmpleado;
	private JTextField jTextFieldDNIUpdateEmpleado;
	private JLabel jLabelDniEmpleado;
	private JTextField jTextFieldNombreUpdateEmpleado;
	private JLabel jLabelNombreEmpleado;
	private JLabel lblIdProyecto;
	private JTextField textFieldIdProyecto;
	private JLabel lblTipoProyecto;
	private JLabel lblDuracion;
	private JLabel lblCosteFormacion;
	private JTextField textFieldDuracion;
	private JTextField textFieldCosteFormacion;
	private JRadioButton rdbtnInterno;
	private JRadioButton rdbtnExterno;
	private String tipoEmpleado = "";
	private JLabel lblIdEmpleado;
	private JTextField textFieldIdEmpleado;
	private JLabel lblActivo;
	private JTextField textFieldActivo;
	private JTextField jTextFieldDNIReadEmpleado;
	private JTextField jTextFieldNombreReadEmpleado;

	@Override
	public void update(Object data) {
		if (data != null) {
			JOptionPane.showMessageDialog(null, "El empleado se ha actualizado correctamente.");
			PanelUpdateEmpleado.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(null, "Error al actualizar el empleado. Comprobar que el DNI no esté repetido y el id exista.");
		}

	}

	@Override
	public Component initGUI() {
		PanelUpdateEmpleado = new javax.swing.JPanel();
		jLabelNombreEmpleado = new javax.swing.JLabel();
		jLabelDniEmpleado = new javax.swing.JLabel();

		jTextFieldNombreUpdateEmpleado = new javax.swing.JTextField();
		jTextFieldNombreUpdateEmpleado.setEditable(true);
		jTextFieldDNIUpdateEmpleado = new javax.swing.JTextField();
		jTextFieldDNIUpdateEmpleado.setEditable(true);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		PanelUpdateEmpleado.setAlignmentX(1.0F);
		PanelUpdateEmpleado.setAlignmentY(1.0F);
		PanelUpdateEmpleado.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelUpdateEmpleado.setName(""); // NOI18N

		jTextFieldNombreUpdateEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreEmpleado.setText("Nombre: ");

		jTextFieldDNIUpdateEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniEmpleado.setText("DNI: ");

		lblIdProyecto = new JLabel("Id Proyecto:");

		textFieldIdProyecto = new JTextField();
		textFieldIdProyecto.setEditable(true);
		textFieldIdProyecto.setColumns(10);

		rdbtnInterno = new JRadioButton("Interno");

		rdbtnExterno = new JRadioButton("Externo");

		rdbtnExterno.setEnabled(true);
		rdbtnInterno.setEnabled(true);

		lblTipoProyecto = new JLabel("Tipo Empleado:");

		lblDuracion = new JLabel("Duracion:");

		lblCosteFormacion = new JLabel("Coste Formacion:");

		textFieldDuracion = new JTextField();
		textFieldDuracion.setColumns(10);
		textFieldDuracion.setEditable(true);

		textFieldCosteFormacion = new JTextField();
		textFieldCosteFormacion.setEditable(true);
		textFieldCosteFormacion.setColumns(10);

		lblIdEmpleado = new JLabel("Id Empleado:");

		textFieldIdEmpleado = new JTextField();
		textFieldIdEmpleado.setColumns(10);
		textFieldIdEmpleado.requestFocus();
		
		textFieldCosteFormacion.setEnabled(false);
		textFieldDuracion.setEnabled(false);

		rdbtnInterno.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (rdbtnInterno.isSelected()) {
					tipoEmpleado = "interno";
					rdbtnExterno.setSelected(false);
					textFieldCosteFormacion.setEnabled(true);
					textFieldDuracion.setEnabled(false);
				}
				if (!rdbtnInterno.isSelected()) {
					rdbtnExterno.setSelected(false);
					textFieldCosteFormacion.setEnabled(false);
					textFieldDuracion.setEnabled(false);
				}

			}
		});

		rdbtnExterno.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (rdbtnExterno.isSelected()) {
					tipoEmpleado = "externo";
					rdbtnInterno.setSelected(false);
					textFieldDuracion.setEnabled(true);
					textFieldCosteFormacion.setEnabled(false);
				}
				if (!rdbtnExterno.isSelected()) {
					rdbtnInterno.setSelected(false);
					textFieldDuracion.setEnabled(false);
					textFieldCosteFormacion.setEnabled(false);
				}

			}
		});

		lblActivo = new JLabel("Activo:");

		textFieldActivo = new JTextField();
		textFieldActivo.setEditable(true);
		textFieldActivo.setColumns(10);

		JButton btnModificar = new JButton("Modificar");

		btnModificar.setBackground(new java.awt.Color(255, 102, 0));
		btnModificar.setEnabled(true);
		btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		// btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1,
		// 1, new java.awt.Color(255, 102, 0)));

			
		btnModificar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (textFieldIdEmpleado.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Empleado' es obligatorio.");
    				textFieldIdEmpleado.requestFocus();
    			}
				else if (jTextFieldNombreUpdateEmpleado.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Nombre' es obligatorio.");
    				jTextFieldNombreUpdateEmpleado.requestFocus();
    			}
            	else if (jTextFieldDNIUpdateEmpleado.getText().compareTo("") == 0){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'DNI' es obligatorio.");
            		jTextFieldDNIUpdateEmpleado.requestFocus();
            	}
            	else if (textFieldIdProyecto.getText().compareTo("") == 0){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'Id Proyecto' es obligatorio. En caso de no querer asignar un proyecto, escribir '0'.");
            		textFieldIdProyecto.requestFocus();
            	}
            	else if (rdbtnInterno.isSelected() == false && rdbtnExterno.isSelected() == false){
            		JOptionPane.showMessageDialog(null,
    						"Debes seleccionar un tipo de empleado.");
            	}
            	else if (rdbtnInterno.isSelected() && textFieldCosteFormacion.getText().compareTo("") == 0 ){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'Coste Formación' es obligatorio.");
            		textFieldCosteFormacion.requestFocus();
            	}
            	else if (rdbtnExterno.isSelected() && textFieldDuracion.getText().compareTo("") == 0 ){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'Duración' es obligatorio.");
            		textFieldDuracion.requestFocus();
            	}
            	else if (textFieldActivo.getText().compareTo("") == 0 ){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'Activo' es obligatorio.");
            		textFieldActivo.requestFocus();
            	}
            	else if(textFieldActivo.getText().compareTo("true") != 0 && textFieldActivo.getText().compareTo("false") != 0) {
            		JOptionPane.showMessageDialog(null,
    						"El valor de Activo debe ser 'true' o 'false'.");
            		textFieldActivo.requestFocus();
            	}
            	else{
	    			TEmpleado trEmpleado = null;
	            	
	            	trEmpleado = new TEmpleado();
	            	trEmpleado.setIdEmpleado(Integer.parseInt(textFieldIdEmpleado.getText()));
            		trEmpleado.setNombre(jTextFieldNombreUpdateEmpleado.getText());
            		trEmpleado.setDni(jTextFieldDNIUpdateEmpleado.getText());
            		trEmpleado.setActivo(Boolean.parseBoolean(textFieldActivo.getText()));
            		trEmpleado.setIdProyecto(Integer.parseInt(textFieldIdProyecto.getText()));
            		trEmpleado.setTipoEmpleado(tipoEmpleado);
            		if("interno".equalsIgnoreCase(tipoEmpleado)) {
            			trEmpleado =  new TEmpleadoInterno(trEmpleado);
            			((TEmpleadoInterno) trEmpleado).setCosteFormacion(Double.parseDouble(textFieldCosteFormacion.getText()));
            			((TEmpleadoInterno) trEmpleado).setIdEmpleado(Integer.parseInt(textFieldIdEmpleado.getText()));
            		}
            		else if("externo".equalsIgnoreCase(tipoEmpleado)) {
            			trEmpleado = new TEmpleadoExterno(trEmpleado);
            			((TEmpleadoExterno)trEmpleado).setDuracion(Integer.parseInt(textFieldDuracion.getText()));
            			((TEmpleadoExterno)trEmpleado).setIdEmpleado(Integer.parseInt(textFieldIdEmpleado.getText()));
            		}
            		
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_UPDATE_EMPLEADO, trEmpleado);
	   				Controlador.getInstance().action(context);	            	
            	}

			}
		});
		
		javax.swing.GroupLayout PanelUpdateEmpleadoLayout = new javax.swing.GroupLayout(PanelUpdateEmpleado);
		PanelUpdateEmpleadoLayout.setHorizontalGroup(
			PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnModificar))
						.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabelDniEmpleado)
								.addComponent(jLabelNombreEmpleado)
								.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
									.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblTipoProyecto)
										.addComponent(lblIdProyecto)
										.addComponent(lblDuracion)
										.addComponent(lblCosteFormacion)
										.addComponent(lblActivo))
									.addGap(1))
								.addComponent(lblIdEmpleado))
							.addGap(39)
							.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldActivo, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldCosteFormacion, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldDuracion, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldDNIUpdateEmpleado, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldNombreUpdateEmpleado, 198, 198, Short.MAX_VALUE)
								.addComponent(textFieldIdProyecto, 198, 198, Short.MAX_VALUE)
								.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
									.addComponent(rdbtnInterno)
									.addGap(18)
									.addComponent(rdbtnExterno))
								.addComponent(textFieldIdEmpleado, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
					.addGap(60))
		);
		PanelUpdateEmpleadoLayout.setVerticalGroup(
			PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdEmpleado)
						.addComponent(textFieldIdEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreUpdateEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreEmpleado))
					.addGap(18)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldDNIUpdateEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelDniEmpleado))
					.addGap(18)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdProyecto)
						.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
							.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnInterno)
								.addComponent(rdbtnExterno))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldDuracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldCosteFormacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(PanelUpdateEmpleadoLayout.createSequentialGroup()
							.addComponent(lblTipoProyecto)
							.addGap(18)
							.addComponent(lblDuracion)
							.addGap(18)
							.addComponent(lblCosteFormacion)))
					.addGap(18)
					.addGroup(PanelUpdateEmpleadoLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblActivo)
						.addComponent(textFieldActivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(63)
					.addComponent(btnModificar)
					.addContainerGap(257, Short.MAX_VALUE))
		);
		PanelUpdateEmpleado.setLayout(PanelUpdateEmpleadoLayout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(PanelUpdateEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout
						.createSequentialGroup().addComponent(PanelUpdateEmpleado, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		PanelUpdateEmpleado.setVisible(true);
		pack();
		return PanelUpdateEmpleado;
	}

}
