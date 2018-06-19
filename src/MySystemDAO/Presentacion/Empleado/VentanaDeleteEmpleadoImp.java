package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

public class VentanaDeleteEmpleadoImp extends VentanaDeleteEmpleado {
	
	private JPanel PanelDeleteEmpleado;
    private JButton botonAceptarDeleteEmpleado;
    private JLabel lblIdEmpleado;
    private JTextField textFieldIdEmpleado;

	@Override
	public void update(Object datos) {
		
		if (datos != null){
			JOptionPane.showMessageDialog(null, "Empleado borrado con exito.");
			PanelDeleteEmpleado.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el empleado buscado o ya está dado de baja.");
		}
	}

	@Override
	public Component initGUI() {
		PanelDeleteEmpleado = new javax.swing.JPanel();
		botonAceptarDeleteEmpleado = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelDeleteEmpleado.setAlignmentX(1.0F);
		PanelDeleteEmpleado.setAlignmentY(1.0F);
		PanelDeleteEmpleado.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelDeleteEmpleado.setName("");
		
		botonAceptarDeleteEmpleado.setBackground(new java.awt.Color(255, 102, 0));
		botonAceptarDeleteEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		botonAceptarDeleteEmpleado.setText("Aceptar");
		botonAceptarDeleteEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
		
		
		textFieldIdEmpleado = new JTextField();
		textFieldIdEmpleado.setColumns(10);
		
		lblIdEmpleado = new JLabel("Id Empleado:");
		
		botonAceptarDeleteEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdEmpleado.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Empleado' es obligatorio.");
    				textFieldIdEmpleado.requestFocus();
    			}
            	TEmpleado trEmpleado = new TEmpleado();
            	
            	trEmpleado.setIdEmpleado(Integer.parseInt(textFieldIdEmpleado.getText()));
            	Contexto context = new Contexto(
            			EventoGUI.COMANDO_DELETE_EMPLEADO, trEmpleado);
   				Controlador.getInstance().action(context);	        
            }
        });

		javax.swing.GroupLayout PanelDeleteEmpleadoLayout = new javax.swing.GroupLayout(PanelDeleteEmpleado);
		PanelDeleteEmpleadoLayout.setHorizontalGroup(
			PanelDeleteEmpleadoLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(PanelDeleteEmpleadoLayout.createSequentialGroup()
					.addGap(178)
					.addComponent(lblIdEmpleado)
					.addGap(18)
					.addGroup(PanelDeleteEmpleadoLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textFieldIdEmpleado, Alignment.TRAILING)
						.addComponent(botonAceptarDeleteEmpleado, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
					.addGap(60))
		);
		PanelDeleteEmpleadoLayout.setVerticalGroup(
			PanelDeleteEmpleadoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(PanelDeleteEmpleadoLayout.createSequentialGroup()
					.addGap(118)
					.addGroup(PanelDeleteEmpleadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldIdEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdEmpleado))
					.addGap(197)
					.addComponent(botonAceptarDeleteEmpleado, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		PanelDeleteEmpleado.setLayout(PanelDeleteEmpleadoLayout);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeleteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeleteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelDeleteEmpleado.setVisible(true);
        pack();
		return PanelDeleteEmpleado;
	}

}
