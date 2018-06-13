package MySystemDAO.Presentacion.Proyecto;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import MySystemDAO.Negocio.Proyecto.TProyecto;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

public class VentanaUpdateProyectoImp extends VentanaUpdateProyecto{
	private JPanel PanelUpdateProyecto;
    private JTextField jTextFieldCoste;
    private JLabel jLabelDniProyecto;
    private JTextField jTextFieldNombreUpdateProyecto;
    private JLabel jLabelNombreProyecto;
    private JLabel lblIdProyecto;
    private JTextField textFieldIdJefe;
    private JTextField textFieldIdProyecto;
    private JLabel lblActivo;
    private JTextField textFieldActivo;
    private JButton botonModificarProyecto;

	@Override
	public void update(Object datos) {
		if (datos != null){
			JOptionPane.showMessageDialog(null, "Empleado modificado con exito. " );
			PanelUpdateProyecto.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al modificar el proyecto, verificar que el id sea correcto.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelUpdateProyecto = new javax.swing.JPanel();
		jLabelNombreProyecto = new javax.swing.JLabel();
		jLabelDniProyecto = new javax.swing.JLabel();

		jTextFieldNombreUpdateProyecto = new javax.swing.JTextField();
		jTextFieldCoste = new javax.swing.JTextField();
		botonModificarProyecto = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelUpdateProyecto.setAlignmentX(1.0F);
		PanelUpdateProyecto.setAlignmentY(1.0F);
		PanelUpdateProyecto.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelUpdateProyecto.setName(""); // NOI18N


		jTextFieldNombreUpdateProyecto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreProyecto.setText("*Nombre: ");

		jTextFieldCoste.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniProyecto.setText("*Coste: ");
		
		lblIdProyecto = new JLabel("Id Jefe:");
		
		textFieldIdJefe = new JTextField();
		textFieldIdJefe.setColumns(10);
		
		botonModificarProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonModificarProyecto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonModificarProyecto.setText("Modificar");
		botonModificarProyecto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		botonModificarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdProyecto.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Proyecto' es obligatorio.");
    				textFieldIdProyecto.requestFocus();
    			}
            	else if (jTextFieldNombreUpdateProyecto.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Nombre' es obligatorio.");
    				jTextFieldNombreUpdateProyecto.requestFocus();
    			}
            	else if (jTextFieldCoste.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Coste' es obligatorio.");
    				jTextFieldCoste.requestFocus();
    			}
            	else if (textFieldActivo.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Activo' es obligatorio.");
    				textFieldActivo.requestFocus();
    			}
            	
            	else{
	    			TProyecto trProyecto = null;
	            	
	    			trProyecto = new TProyecto();

	    			trProyecto.setIdProyecto(Integer.parseInt(textFieldIdProyecto.getText()));
	    			trProyecto.setNombre(jTextFieldNombreUpdateProyecto.getText());
	    			trProyecto.setCoste(Double.parseDouble(jTextFieldCoste.getText()));
	    			if(textFieldIdJefe.getText().compareTo("") != 0){
	    				trProyecto.setIdJefe(Integer.parseInt(textFieldIdJefe.getText()));
					}
	    			else {
	    				trProyecto.setIdJefe(0);
	    			}
					
	    			trProyecto.setActivo(Boolean.valueOf(textFieldActivo.getText()));				
	    			
	    			            		
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_UPDATE_PROYECTO, trProyecto);
	   				Controlador.getInstance().action(context);	            	
            	}
			
            }
        });
		
		JLabel lblIdProyecto_1 = new JLabel("*Id Proyecto:");
		
		textFieldIdProyecto = new JTextField();
		textFieldIdProyecto.setColumns(10);
		
		lblActivo = new JLabel("*Activo:");
		
		textFieldActivo = new JTextField();
		textFieldActivo.setColumns(10);
		
		javax.swing.GroupLayout PanelUpdateProyectoLayout = new javax.swing.GroupLayout(PanelUpdateProyecto);
		PanelUpdateProyectoLayout.setHorizontalGroup(
			PanelUpdateProyectoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, PanelUpdateProyectoLayout.createSequentialGroup()
					.addGroup(PanelUpdateProyectoLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(PanelUpdateProyectoLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(botonModificarProyecto, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addGroup(PanelUpdateProyectoLayout.createSequentialGroup()
							.addGap(95)
							.addGroup(PanelUpdateProyectoLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabelNombreProyecto)
								.addComponent(jLabelDniProyecto)
								.addComponent(lblIdProyecto)
								.addComponent(lblActivo)
								.addComponent(lblIdProyecto_1))
							.addGap(39)
							.addGroup(PanelUpdateProyectoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldActivo, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldNombreUpdateProyecto, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(jTextFieldCoste, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
								.addComponent(textFieldIdJefe, 198, 198, Short.MAX_VALUE)
								.addComponent(textFieldIdProyecto, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
					.addGap(37))
		);
		PanelUpdateProyectoLayout.setVerticalGroup(
			PanelUpdateProyectoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelUpdateProyectoLayout.createSequentialGroup()
					.addGap(71)
					.addGroup(PanelUpdateProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdProyecto_1))
					.addGap(18)
					.addGroup(PanelUpdateProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreUpdateProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreProyecto))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(PanelUpdateProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelDniProyecto)
						.addComponent(jTextFieldCoste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelUpdateProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldIdJefe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdProyecto))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(PanelUpdateProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldActivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblActivo))
					.addGap(72)
					.addComponent(botonModificarProyecto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(277, Short.MAX_VALUE))
		);
		PanelUpdateProyecto.setLayout(PanelUpdateProyectoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUpdateProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUpdateProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelUpdateProyecto.setVisible(true);
        pack();
		return PanelUpdateProyecto;
	}

}
