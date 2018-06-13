package MySystemDAO.Presentacion.Proyecto;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Negocio.Proyecto.TProyecto;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

public class VentanaCreateProyectoImp extends VentanaCreateProyecto{
	
	private JPanel PanelAltaProyecto;
    private JButton botonAceptarAltaProyecto;
    private JTextField jTextFieldCoste;
    private JLabel jLabelDniProyecto;
    private JTextField jTextFieldNombreAltaProyecto;
    private JLabel jLabelNombreProyecto;
    private JLabel lblIdProyecto;
    private JTextField textFieldIdJefe;

	@Override
	public void update(Object datos) {
		if (datos != null){
			if(((TProyecto)datos).getIdProyecto() > 0)
				JOptionPane.showMessageDialog(null, "Empleado creado con exito con el ID: " + ((TProyecto)datos).getIdProyecto());
			else
				JOptionPane.showMessageDialog(null, "El proyecto con el nombre introducido ya existía y se ha procedido a dar de alta con los nuevos datos.");
			PanelAltaProyecto.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al crear el proyecto, verificar si el nombre ya esta dado de alta.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelAltaProyecto = new javax.swing.JPanel();
		jLabelNombreProyecto = new javax.swing.JLabel();
		jLabelDniProyecto = new javax.swing.JLabel();

		jTextFieldNombreAltaProyecto = new javax.swing.JTextField();
		jTextFieldCoste = new javax.swing.JTextField();
		botonAceptarAltaProyecto = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelAltaProyecto.setAlignmentX(1.0F);
		PanelAltaProyecto.setAlignmentY(1.0F);
		PanelAltaProyecto.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelAltaProyecto.setName(""); // NOI18N


		jTextFieldNombreAltaProyecto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreProyecto.setText("*Nombre: ");

		jTextFieldCoste.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniProyecto.setText("*Coste: ");
		
		lblIdProyecto = new JLabel("Id Jefe:");
		
		textFieldIdJefe = new JTextField();
		textFieldIdJefe.setColumns(10);
		
		botonAceptarAltaProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarAltaProyecto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarAltaProyecto.setText("Aceptar");
		botonAceptarAltaProyecto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		botonAceptarAltaProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (jTextFieldNombreAltaProyecto.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Nombre' es obligatorio.");
    				jTextFieldNombreAltaProyecto.requestFocus();
    			}
            	else if (jTextFieldCoste.getText().compareTo("") == 0){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'Coste' es obligatorio.");
            		jTextFieldCoste.requestFocus();
            	}
            	else{
	    			TProyecto trProyecto = null;
	            	
	    			trProyecto = new TProyecto();
	    			
	    			trProyecto.setNombre(jTextFieldNombreAltaProyecto.getText());
	    			trProyecto.setCoste(Double.valueOf(jTextFieldCoste.getText()));
	    			trProyecto.setActivo(true);
	    			
	    			if(textFieldIdJefe.getText().compareTo("") == 0) {
	    				trProyecto.setIdJefe(0);
	    			}
	    			else {
	    				trProyecto.setIdJefe(Integer.parseInt(textFieldIdJefe.getText()));	    				
	    			}
	    			            		
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_CREATE_PROYECTO, trProyecto);
	   				Controlador.getInstance().action(context);	            	
            	}
			
            }
        });
		
		javax.swing.GroupLayout PanelAltaProyectoLayout = new javax.swing.GroupLayout(PanelAltaProyecto);
		PanelAltaProyectoLayout.setHorizontalGroup(
			PanelAltaProyectoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelAltaProyectoLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(PanelAltaProyectoLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(botonAceptarAltaProyecto, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGroup(PanelAltaProyectoLayout.createSequentialGroup()
							.addGap(41)
							.addGroup(PanelAltaProyectoLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabelDniProyecto)
								.addComponent(jLabelNombreProyecto)
								.addGroup(PanelAltaProyectoLayout.createSequentialGroup()
									.addComponent(lblIdProyecto)
									.addGap(1)))
							.addGap(39)
							.addGroup(PanelAltaProyectoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(jTextFieldCoste, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldNombreAltaProyecto, 198, 198, Short.MAX_VALUE)
								.addComponent(textFieldIdJefe, 198, 198, 198))))
					.addGap(60))
		);
		PanelAltaProyectoLayout.setVerticalGroup(
			PanelAltaProyectoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelAltaProyectoLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(PanelAltaProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreAltaProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreProyecto))
					.addGap(18)
					.addGroup(PanelAltaProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldCoste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelDniProyecto))
					.addGap(18)
					.addGroup(PanelAltaProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdProyecto)
						.addComponent(textFieldIdJefe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(197)
					.addComponent(botonAceptarAltaProyecto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelAltaProyecto.setLayout(PanelAltaProyectoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAltaProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAltaProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelAltaProyecto.setVisible(true);
        pack();
		return PanelAltaProyecto;
	}

}
