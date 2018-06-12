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

public class VentanaReadEmpleadoImp extends VentanaReadEmpleado{
	
	private JPanel PanelReadEmpleado;
    private JButton botonAceptarReadEmpleado;
    private JTextField jTextFieldDNIReadEmpleado;
    private JLabel jLabelDniEmpleado;
    private JTextField jTextFieldNombreReadEmpleado;
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

	@Override
	public void update(Object data) {
		if(data != null) {
			TEmpleado miEmp = (TEmpleado) data;
			
			if("interno".equalsIgnoreCase(miEmp.getTipoEmpleado())){
				
				rdbtnInterno.setSelected(true);
				rdbtnExterno.setSelected(false);
				
				jTextFieldDNIReadEmpleado.setText(miEmp.getDni());
				jTextFieldNombreReadEmpleado.setText(miEmp.getNombre());
				textFieldActivo.setText(String.valueOf(miEmp.getActivo()));
				textFieldIdProyecto.setText(String.valueOf(miEmp.getIdProyecto()));		
				
				textFieldCosteFormacion.setText(String.valueOf(((TEmpleadoInterno)miEmp).getCosteFormacion()));
				textFieldDuracion.setText("");
			}
			else if("externo".equalsIgnoreCase(miEmp.getTipoEmpleado())){
				rdbtnInterno.setSelected(false);
				rdbtnExterno.setSelected(true);
				
				jTextFieldDNIReadEmpleado.setText(miEmp.getDni());
				jTextFieldNombreReadEmpleado.setText(miEmp.getNombre());
				textFieldActivo.setText(String.valueOf(miEmp.getActivo()));
				textFieldIdProyecto.setText(String.valueOf(miEmp.getIdProyecto()));		
				
				textFieldCosteFormacion.setText("");
				textFieldDuracion.setText(String.valueOf(((TEmpleadoExterno)miEmp).getDuracion()));
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "No se ha encontrado el empleado.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelReadEmpleado = new javax.swing.JPanel();
		jLabelNombreEmpleado = new javax.swing.JLabel();
		jLabelDniEmpleado = new javax.swing.JLabel();

		jTextFieldNombreReadEmpleado = new javax.swing.JTextField();
		jTextFieldNombreReadEmpleado.setEditable(false);
		jTextFieldDNIReadEmpleado = new javax.swing.JTextField();
		jTextFieldDNIReadEmpleado.setEditable(false);
		botonAceptarReadEmpleado = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelReadEmpleado.setAlignmentX(1.0F);
		PanelReadEmpleado.setAlignmentY(1.0F);
		PanelReadEmpleado.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelReadEmpleado.setName(""); // NOI18N


		jTextFieldNombreReadEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreEmpleado.setText("Nombre: ");

		jTextFieldDNIReadEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniEmpleado.setText("DNI: ");
		
		lblIdProyecto = new JLabel("Id Proyecto:");
		
		textFieldIdProyecto = new JTextField();
		textFieldIdProyecto.setEditable(false);
		textFieldIdProyecto.setColumns(10);
		
		rdbtnInterno = new JRadioButton("Interno");
		
		rdbtnExterno = new JRadioButton("Externo");
		
		rdbtnExterno.setEnabled(false);
		rdbtnInterno.setEnabled(false);
		
		lblTipoProyecto = new JLabel("Tipo Empleado:");
		
		lblDuracion = new JLabel("Duracion:");
		
		lblCosteFormacion = new JLabel("Coste Formacion:");
		
		textFieldDuracion = new JTextField();
		textFieldDuracion.setColumns(10);
		textFieldDuracion.setEditable(false);
		
		textFieldCosteFormacion = new JTextField();
		textFieldCosteFormacion.setEditable(false);
		textFieldCosteFormacion.setColumns(10);
		
		
		
		botonAceptarReadEmpleado.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarReadEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarReadEmpleado.setText("Buscar");
		botonAceptarReadEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		
		
		lblIdEmpleado = new JLabel("Id Empleado:");
		
		textFieldIdEmpleado = new JTextField();
		textFieldIdEmpleado.setColumns(10);		
		textFieldIdEmpleado.requestFocus();
		
		botonAceptarReadEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdEmpleado.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id' es obligatorio.");
    				textFieldIdEmpleado.requestFocus();
    			}            	
            	else{
	    			TEmpleado trEmpleado = null;
	            	
	            	trEmpleado = new TEmpleado();
            		trEmpleado.setIdEmpleado(Integer.parseInt(textFieldIdEmpleado.getText()));
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_READ_EMPLEADO, trEmpleado);
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
		
		lblActivo = new JLabel("Activo:");
		
		textFieldActivo = new JTextField();
		textFieldActivo.setEditable(false);
		textFieldActivo.setColumns(10);
		
		javax.swing.GroupLayout PanelReadEmpleadoLayout = new javax.swing.GroupLayout(PanelReadEmpleado);
		PanelReadEmpleadoLayout.setHorizontalGroup(
			PanelReadEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelReadEmpleadoLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabelDniEmpleado)
						.addComponent(jLabelNombreEmpleado)
						.addGroup(PanelReadEmpleadoLayout.createSequentialGroup()
							.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblTipoProyecto)
								.addComponent(lblIdProyecto)
								.addComponent(lblDuracion)
								.addComponent(lblCosteFormacion)
								.addComponent(lblActivo))
							.addGap(1))
						.addComponent(lblIdEmpleado))
					.addGap(39)
					.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldActivo, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(textFieldCosteFormacion, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(textFieldDuracion, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(jTextFieldDNIReadEmpleado, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(jTextFieldNombreReadEmpleado, 198, 198, Short.MAX_VALUE)
						.addComponent(textFieldIdProyecto, 198, 198, Short.MAX_VALUE)
						.addGroup(PanelReadEmpleadoLayout.createSequentialGroup()
							.addComponent(rdbtnInterno)
							.addGap(18)
							.addComponent(rdbtnExterno))
						.addGroup(PanelReadEmpleadoLayout.createSequentialGroup()
							.addComponent(textFieldIdEmpleado, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
							.addComponent(botonAceptarReadEmpleado, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
					.addGap(60))
		);
		PanelReadEmpleadoLayout.setVerticalGroup(
			PanelReadEmpleadoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelReadEmpleadoLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdEmpleado)
						.addComponent(textFieldIdEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonAceptarReadEmpleado, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreReadEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreEmpleado))
					.addGap(18)
					.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldDNIReadEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelDniEmpleado))
					.addGap(18)
					.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdProyecto)
						.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(PanelReadEmpleadoLayout.createSequentialGroup()
							.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnInterno)
								.addComponent(rdbtnExterno))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldDuracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldCosteFormacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(PanelReadEmpleadoLayout.createSequentialGroup()
							.addComponent(lblTipoProyecto)
							.addGap(18)
							.addComponent(lblDuracion)
							.addGap(18)
							.addComponent(lblCosteFormacion)))
					.addGap(18)
					.addGroup(PanelReadEmpleadoLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblActivo)
						.addComponent(textFieldActivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(343, Short.MAX_VALUE))
		);
		PanelReadEmpleado.setLayout(PanelReadEmpleadoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(PanelReadEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(PanelReadEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(22, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        PanelReadEmpleado.setVisible(true);
        pack();
        
        return PanelReadEmpleado;
	}
	
}
