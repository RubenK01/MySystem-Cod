package MySystemDAO.Presentacion.Proyecto;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import MySystemDAO.Negocio.Proyecto.TProyecto;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

public class VentanaDeleteProyectoImp extends VentanaDeleteProyecto{

	private JPanel PanelDeleteProyecto;
    private JButton botonAceptarDeleteProyecto;
    private JLabel lblIdProyecto;
    private JTextField textFieldIdProyecto;

	@Override
	public void update(Object datos) {
		
		if (datos != null){
			JOptionPane.showMessageDialog(null, "Proyecto borrado con exito.");
			PanelDeleteProyecto.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el Proyecto buscado.");
		}
	}

	@Override
	public Component initGUI() {
		PanelDeleteProyecto = new javax.swing.JPanel();
		botonAceptarDeleteProyecto = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelDeleteProyecto.setAlignmentX(1.0F);
		PanelDeleteProyecto.setAlignmentY(1.0F);
		PanelDeleteProyecto.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelDeleteProyecto.setName("");
		
		botonAceptarDeleteProyecto.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarDeleteProyecto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarDeleteProyecto.setText("Aceptar");
		botonAceptarDeleteProyecto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		
		
		textFieldIdProyecto = new JTextField();
		textFieldIdProyecto.setColumns(10);
		
		lblIdProyecto = new JLabel("Id Proyecto:");
		
		botonAceptarDeleteProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdProyecto.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Proyecto' es obligatorio.");
    				textFieldIdProyecto.requestFocus();
    			}
            	TProyecto trProyecto = new TProyecto();
            	
            	trProyecto.setIdProyecto(Integer.parseInt(textFieldIdProyecto.getText()));
            	Contexto context = new Contexto(
            			EventoGUI.COMANDO_DELETE_PROYECTO, trProyecto);
   				Controlador.getInstance().action(context);	        
            }
        });

		javax.swing.GroupLayout PanelDeleteProyectoLayout = new javax.swing.GroupLayout(PanelDeleteProyecto);
		PanelDeleteProyectoLayout.setHorizontalGroup(
			PanelDeleteProyectoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelDeleteProyectoLayout.createSequentialGroup()
					.addGap(178)
					.addComponent(lblIdProyecto)
					.addGap(18)
					.addGroup(PanelDeleteProyectoLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textFieldIdProyecto, Alignment.TRAILING)
						.addComponent(botonAceptarDeleteProyecto, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
					.addGap(60))
		);
		PanelDeleteProyectoLayout.setVerticalGroup(
			PanelDeleteProyectoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelDeleteProyectoLayout.createSequentialGroup()
					.addGap(118)
					.addGroup(PanelDeleteProyectoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdProyecto))
					.addGap(197)
					.addComponent(botonAceptarDeleteProyecto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelDeleteProyecto.setLayout(PanelDeleteProyectoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeleteProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeleteProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelDeleteProyecto.setVisible(true);
        pack();
		return PanelDeleteProyecto;
	}

}
