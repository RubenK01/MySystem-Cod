package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Presentacion.Comandos.FactoriaComandos.FactoriaComandos;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;

public class VentanaCreateEmpleadoImp extends VentanaCreateEmpleado{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7023792715260898403L;
	private JPanel PanelAltaEmpleado;
    private JButton botonAceptarAltaEmpleado;
    private JTextField jTextFieldDescripcionAltaEmpleado;
    private JLabel jLabelDescripcionEmpleado;
    private JTextField jTextFieldNombreAltaEmpleado;
    private JLabel jLabelNombreEmpleado;


	
	@Override
	public Component initGUI() {
		// begin-user-code
		PanelAltaEmpleado = new javax.swing.JPanel();
		jLabelNombreEmpleado = new javax.swing.JLabel();
		jLabelDescripcionEmpleado = new javax.swing.JLabel();

		jTextFieldNombreAltaEmpleado = new javax.swing.JTextField();
		jTextFieldDescripcionAltaEmpleado = new javax.swing.JTextField();
		botonAceptarAltaEmpleado = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		PanelAltaEmpleado.setAlignmentX(1.0F);
		PanelAltaEmpleado.setAlignmentY(1.0F);
		PanelAltaEmpleado.setMinimumSize(new java.awt.Dimension(300, 300));
		PanelAltaEmpleado.setName(""); // NOI18N


		jTextFieldNombreAltaEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNombreEmpleado.setText("Nombre: ");

		jTextFieldDescripcionAltaEmpleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelDescripcionEmpleado.setText("Descripción: ");
		
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
            	else if (jTextFieldDescripcionAltaEmpleado.getText().compareTo("") == 0){
            		JOptionPane.showMessageDialog(null,
    						"El campo 'Descripción' es obligatorio.");
            		jTextFieldDescripcionAltaEmpleado.requestFocus();
            	}
            	else{
	    			TEmpleado trEmpleado = null;
	            	
	            	trEmpleado = new TEmpleado();
            		trEmpleado.setNombre(jTextFieldNombreAltaEmpleado.getText());
            		trEmpleado.setDni(jTextFieldDescripcionAltaEmpleado.getText());
            		
	   				Contexto context = new Contexto(
	   						FactoriaComandos.COMANDO_CREATE_EMPLEADO, trEmpleado);
	   				Controlador.getInstance().action(context);	            	
            	}
			
            }
        });

		javax.swing.GroupLayout PanelAltaEmpleadoLayout = new javax.swing.GroupLayout(PanelAltaEmpleado);
		PanelAltaEmpleado.setLayout(PanelAltaEmpleadoLayout);
        PanelAltaEmpleadoLayout.setHorizontalGroup(
        		PanelAltaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAltaEmpleadoLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(PanelAltaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
                        .addGroup(PanelAltaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreEmpleado)
                            .addComponent(jLabelDescripcionEmpleado))
                        .addGap(39, 39, 39)
                        .addGroup(PanelAltaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDescripcionAltaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreAltaEmpleado)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAltaEmpleadoLayout.createSequentialGroup()
                        
                        .addGap(57, 57, 57)
                        .addComponent(botonAceptarAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        
        PanelAltaEmpleadoLayout.setVerticalGroup(
        		PanelAltaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAltaEmpleadoLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(PanelAltaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombreAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNombreEmpleado))
                    .addGap(28, 28, 28)
                    .addGroup(PanelAltaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldDescripcionAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDescripcionEmpleado))
                    .addGap(53, 53, 53)
                    .addGroup(PanelAltaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAceptarAltaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(368, Short.MAX_VALUE))
        );
        
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
		if (datos == null){
			JOptionPane.showMessageDialog(null, "Empleado creado con exito.");
			PanelAltaEmpleado.setVisible(false);
		}
		else {
			String mensaje = (String) datos;
			JOptionPane.showMessageDialog(null, mensaje);
		}
		
	}

}
