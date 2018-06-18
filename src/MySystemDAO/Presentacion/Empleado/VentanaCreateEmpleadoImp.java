package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Negocio.Empleado.TEmpleadoExterno;
import MySystemDAO.Negocio.Empleado.TEmpleadoInterno;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

public class VentanaCreateEmpleadoImp extends VentanaCreateEmpleado{

	/**
	 * 
	 */
	private JPanel PanelAltaEmpleado;
    private JButton botonAceptarAltaEmpleado;
    private JTextField jTextFieldDNIAltaEmpleado;
    private JLabel jLabelDniEmpleado;
    private JTextField jTextFieldNombreAltaEmpleado;
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

	
	@Override
	public Component initGUI() {
		// begin-user-code
		PanelAltaEmpleado = new javax.swing.JPanel();
		jLabelNombreEmpleado = new javax.swing.JLabel();
		jLabelDniEmpleado = new javax.swing.JLabel();

		jTextFieldNombreAltaEmpleado = new javax.swing.JTextField();
		jTextFieldDNIAltaEmpleado = new javax.swing.JTextField();
		botonAceptarAltaEmpleado = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelAltaEmpleado.setAlignmentX(1.0F);
		PanelAltaEmpleado.setAlignmentY(1.0F);
		PanelAltaEmpleado.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelAltaEmpleado.setName(""); // NOI18N


		jTextFieldNombreAltaEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreEmpleado.setText("*Nombre: ");

		jTextFieldDNIAltaEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniEmpleado.setText("*DNI: ");
		
		lblIdProyecto = new JLabel("*Id Proyecto:");
		
		textFieldIdProyecto = new JTextField();
		textFieldIdProyecto.setColumns(10);
		
		rdbtnInterno = new JRadioButton("Interno");
		
		rdbtnExterno = new JRadioButton("Externo");
		
		lblTipoProyecto = new JLabel("*Tipo Empleado:");
		
		lblDuracion = new JLabel("*Duracion:");
		
		lblCosteFormacion = new JLabel("*Coste Formacion:");
		
		textFieldDuracion = new JTextField();
		textFieldDuracion.setColumns(10);
		textFieldDuracion.setEnabled(false);
		
		textFieldCosteFormacion = new JTextField();
		textFieldCosteFormacion.setColumns(10);
		textFieldCosteFormacion.setEnabled(false);
		
		botonAceptarAltaEmpleado.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarAltaEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarAltaEmpleado.setText("Aceptar");
		botonAceptarAltaEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		botonAceptarAltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (jTextFieldNombreAltaEmpleado.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Nombre' es obligatorio.");
    				jTextFieldNombreAltaEmpleado.requestFocus();
    			}
            	else if (jTextFieldDNIAltaEmpleado.getText().compareTo("") == 0){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'DNI' es obligatorio.");
            		jTextFieldDNIAltaEmpleado.requestFocus();
            	}
            	else if (textFieldIdProyecto.getText().compareTo("") == 0){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'Id Proyecto' es obligatorio.");
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
            	else{
	    			TEmpleado trEmpleado = null;
	            	
	            	trEmpleado = new TEmpleado();
            		trEmpleado.setNombre(jTextFieldNombreAltaEmpleado.getText());
            		trEmpleado.setDni(jTextFieldDNIAltaEmpleado.getText());
            		trEmpleado.setActivo(true);
            		
            		if(textFieldIdProyecto.getText().compareTo("") == 0) {
            			trEmpleado.setIdProyecto(0);
            		}
            		else {
            			trEmpleado.setIdProyecto(Integer.parseInt(textFieldIdProyecto.getText()));
            		}
            		trEmpleado.setTipoEmpleado(tipoEmpleado);
            		if("interno".equalsIgnoreCase(tipoEmpleado)) {
            			trEmpleado =  new TEmpleadoInterno(trEmpleado);
            			((TEmpleadoInterno) trEmpleado).setCosteFormacion(Double.parseDouble(textFieldCosteFormacion.getText()));
            			//trEmpleado = (TEmpleado) empInterno;
            		}
            		else if("externo".equalsIgnoreCase(tipoEmpleado)) {
            			trEmpleado = new TEmpleadoExterno(trEmpleado);
            			((TEmpleadoExterno)trEmpleado).setDuracion(Integer.parseInt(textFieldDuracion.getText()));
            			//trEmpleado = (TEmpleado) empExterno;
            		}
            		
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_CREATE_EMPLEADO, trEmpleado);
	   				Controlador.getInstance().action(context);	            	
            	}
			
            }
        });
		
		

		rdbtnInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if(rdbtnInterno.isSelected()) {
            		tipoEmpleado = "interno";
            		rdbtnExterno.setSelected(false);
            		textFieldCosteFormacion.setEnabled(true);
            		textFieldDuracion.setEnabled(false);
            	}
            	if(!rdbtnInterno.isSelected()) {
            		rdbtnExterno.setSelected(false);
            		textFieldCosteFormacion.setEnabled(false);
            		textFieldDuracion.setEnabled(false);
            	}
            	
            }
		});
		
		rdbtnExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if(rdbtnExterno.isSelected()) {
            		tipoEmpleado = "externo";
            		rdbtnInterno.setSelected(false);
            		textFieldDuracion.setEnabled(true);
            		textFieldCosteFormacion.setEnabled(false);
            	}
            	if(!rdbtnExterno.isSelected()) {
            		rdbtnInterno.setSelected(false);
            		textFieldDuracion.setEnabled(false);
            		textFieldCosteFormacion.setEnabled(false);
            	}
            	
            }
		});
		
		javax.swing.GroupLayout PanelAltaEmpleadoLayout = new javax.swing.GroupLayout(PanelAltaEmpleado);
		PanelAltaEmpleadoLayout.setHorizontalGroup(
			PanelAltaEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(botonAceptarAltaEmpleado, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
							.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabelDniEmpleado)
								.addComponent(jLabelNombreEmpleado)
								.addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
									.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblTipoProyecto)
										.addComponent(lblIdProyecto)
										.addComponent(lblDuracion)
										.addComponent(lblCosteFormacion))
									.addGap(1)))
							.addGap(39)
							.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldCosteFormacion, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldDuracion, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldDNIAltaEmpleado, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldNombreAltaEmpleado, 198, 198, Short.MAX_VALUE)
								.addComponent(textFieldIdProyecto)
								.addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
									.addComponent(rdbtnInterno)
									.addGap(18)
									.addComponent(rdbtnExterno)))))
					.addGap(60))
		);
		PanelAltaEmpleadoLayout.setVerticalGroup(
			PanelAltaEmpleadoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreAltaEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreEmpleado))
					.addGap(18)
					.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldDNIAltaEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelDniEmpleado))
					.addGap(18)
					.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdProyecto)
						.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(PanelAltaEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnInterno)
								.addComponent(rdbtnExterno))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldDuracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldCosteFormacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(98)
							.addComponent(botonAceptarAltaEmpleado, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblTipoProyecto)
							.addGap(18)
							.addComponent(lblDuracion)
							.addGap(18)
							.addComponent(lblCosteFormacion)))
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelAltaEmpleado.setLayout(PanelAltaEmpleadoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelAltaEmpleado.setVisible(true);
        pack();
        return PanelAltaEmpleado;	
		
	}

	@Override
	public void update(Object datos) {
		if (datos != null){
			if(((TEmpleado)datos).getIdEmpleado() > 0){
				JOptionPane.showMessageDialog(null, "Empleado creado con exito con el ID: " + ((TEmpleado)datos).getIdEmpleado());
			}
			else {
				JOptionPane.showMessageDialog(null, "El empleado con el dni introducido ya existía y se ha procedido a dar de alta con los nuevos datos. ");
			}
			
			PanelAltaEmpleado.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al crear empleado, verificar si el dni ya está dado de alta.");
		}
		
	}

}
