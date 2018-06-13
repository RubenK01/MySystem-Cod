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

public class VentanaReadProyectoImp extends VentanaReadProyecto{
	private JPanel PanelReadProyecto;
    private JButton botonAceptarBuscarProyecto;
    private JTextField jTextFieldCoste;
    private JLabel jLabelDniProyecto;
    private JTextField jTextFieldNombreReadProyecto;
    private JLabel jLabelNombreProyecto;
    private JLabel lblIdProyecto;
    private JTextField textFieldIdJefe;
    private JTextField textFieldIdProyecto;
    private JLabel lblActivo;
    private JTextField textFieldActivo;

	@Override
	public void update(Object datos) {
		if (datos != null){
			TProyecto miProy = (TProyecto) datos;
			jTextFieldCoste.setText(String.valueOf(miProy.getCoste()));
			jTextFieldNombreReadProyecto.setText(miProy.getNombre());
			textFieldIdJefe.setText(String.valueOf(miProy.getIdJefe()));
			textFieldActivo.setText(String.valueOf(miProy.getActivo()));
			
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el empleado buscado.");
		}
		
	}

	@Override
	public Component initGUI() {
		PanelReadProyecto = new javax.swing.JPanel();
		jLabelNombreProyecto = new javax.swing.JLabel();
		jLabelDniProyecto = new javax.swing.JLabel();

		jTextFieldNombreReadProyecto = new javax.swing.JTextField();
		jTextFieldNombreReadProyecto.setEditable(false);
		jTextFieldCoste = new javax.swing.JTextField();
		jTextFieldCoste.setEditable(false);
		botonAceptarBuscarProyecto = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelReadProyecto.setAlignmentX(1.0F);
		PanelReadProyecto.setAlignmentY(1.0F);
		PanelReadProyecto.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelReadProyecto.setName(""); // NOI18N


		jTextFieldNombreReadProyecto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreProyecto.setText("Nombre: ");

		jTextFieldCoste.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDniProyecto.setText("Coste: ");
		
		lblIdProyecto = new JLabel("Id Jefe:");
		
		textFieldIdJefe = new JTextField();
		textFieldIdJefe.setEditable(false);
		textFieldIdJefe.setColumns(10);
		
		botonAceptarBuscarProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarBuscarProyecto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarBuscarProyecto.setText("Buscar");
		botonAceptarBuscarProyecto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		botonAceptarBuscarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdProyecto.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Proyecto' es obligatorio.");
    				textFieldIdProyecto.requestFocus();
    			}
            	else{
	    			TProyecto trProyecto = null;
	            	
	    			trProyecto = new TProyecto();

	    			trProyecto.setIdProyecto(Integer.parseInt(textFieldIdProyecto.getText()));
	    			
	    			            		
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_READ_PROYECTO, trProyecto);
	   				Controlador.getInstance().action(context);	            	
            	}
			
            }
        });
		
		JLabel lblIdProyecto_1 = new JLabel("Id Proyecto:");
		
		textFieldIdProyecto = new JTextField();
		textFieldIdProyecto.setColumns(10);
		
		lblActivo = new JLabel("Activo:");
		
		textFieldActivo = new JTextField();
		textFieldActivo.setEditable(false);
		textFieldActivo.setColumns(10);
		
		javax.swing.GroupLayout PanelReadProyectoLayout = new javax.swing.GroupLayout(PanelReadProyecto);
		PanelReadProyectoLayout.setHorizontalGroup(
			PanelReadProyectoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelReadProyectoLayout.createSequentialGroup()
					.addGap(95)
					.addGroup(PanelReadProyectoLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblIdProyecto_1)
						.addComponent(jLabelNombreProyecto)
						.addComponent(jLabelDniProyecto)
						.addComponent(lblIdProyecto)
						.addComponent(lblActivo))
					.addGap(39)
					.addGroup(PanelReadProyectoLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldActivo, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(jTextFieldNombreReadProyecto, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addComponent(jTextFieldCoste, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addGroup(PanelReadProyectoLayout.createSequentialGroup()
							.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(botonAceptarBuscarProyecto, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addComponent(textFieldIdJefe, 198, 198, Short.MAX_VALUE))
					.addGap(37))
		);
		PanelReadProyectoLayout.setVerticalGroup(
			PanelReadProyectoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelReadProyectoLayout.createSequentialGroup()
					.addGap(15)
					.addGroup(PanelReadProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdProyecto_1)
						.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonAceptarBuscarProyecto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(77)
					.addGroup(PanelReadProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextFieldNombreReadProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelNombreProyecto))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(PanelReadProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabelDniProyecto)
						.addComponent(jTextFieldCoste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(PanelReadProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldIdJefe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdProyecto))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(PanelReadProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldActivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblActivo))
					.addContainerGap(384, Short.MAX_VALUE))
		);
		PanelReadProyecto.setLayout(PanelReadProyectoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelReadProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelReadProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelReadProyecto.setVisible(true);
        pack();
		return PanelReadProyecto;
	}

}
