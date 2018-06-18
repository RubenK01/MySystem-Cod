package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;
import java.util.Collection;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

public class VentanaReadEmpleadosByProyectoImp extends VentanaReadEmpleadosByProyecto{
	private javax.swing.JScrollPane ListarEmpleadosByProyectos;
    private javax.swing.JPanel PanelListarEmpleadosByProyectos;
    private javax.swing.JTable TablaListarEmpleadosByProyectos;
    private JLabel lblIdProyecto;
    private JTextField textFieldIdProyecto;

	@Override
	public void update(Object data) {
		
		if(data != null){
			MyTabla tiModel = new MyTabla((Collection<TEmpleado>) data);
			TablaListarEmpleadosByProyectos.setModel(tiModel);
			repaint();
			revalidate();
		}
		else {
			JOptionPane.showMessageDialog(null, "No se encontraron registros.");
			PanelListarEmpleadosByProyectos.setVisible(false);
		}
		
		
	}

	@SuppressWarnings("serial")
	@Override
	public Component initGUI() {
		PanelListarEmpleadosByProyectos = new javax.swing.JPanel();
		ListarEmpleadosByProyectos = new javax.swing.JScrollPane();
		TablaListarEmpleadosByProyectos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaListarEmpleadosByProyectos.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        TablaListarEmpleadosByProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Empleado", "Nombre", "DNI", "ID Proyecto", "Tipo Empleado", "Activo"}
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaListarEmpleadosByProyectos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

		
        ListarEmpleadosByProyectos.setViewportView(TablaListarEmpleadosByProyectos);
        
        lblIdProyecto = new JLabel("Id Proyecto: ");
        
        textFieldIdProyecto = new JTextField();
        textFieldIdProyecto.setColumns(10);
        
        JButton btnBuscar = new JButton();
        btnBuscar.setBackground(new java.awt.Color(255, 102, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
		
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	if (textFieldIdProyecto.getText().compareTo("") == 0) {
    				JOptionPane.showMessageDialog(null,
    						"El campo 'Id Proyecto' es obligatorio.");
    				textFieldIdProyecto.requestFocus();
    			}            	
            	else{
	    			TEmpleado trEmpleado = null;
	            	
	            	trEmpleado = new TEmpleado();
            		trEmpleado.setIdProyecto(Integer.parseInt(textFieldIdProyecto.getText()));
            		
	   				Contexto context = new Contexto(
	   						EventoGUI.COMANDO_READ_EMPLEADOS_BY_PROYECTO, trEmpleado);
	   				Controlador.getInstance().action(context);	            	
            	}
			
            }
        });

        javax.swing.GroupLayout PanelListarEmpleadosByProyectosLayout = new javax.swing.GroupLayout(PanelListarEmpleadosByProyectos);
        PanelListarEmpleadosByProyectosLayout.setHorizontalGroup(
        	PanelListarEmpleadosByProyectosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarEmpleadosByProyectosLayout.createSequentialGroup()
        			.addGap(44)
        			.addGroup(PanelListarEmpleadosByProyectosLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(PanelListarEmpleadosByProyectosLayout.createSequentialGroup()
        					.addComponent(lblIdProyecto)
        					.addGap(18)
        					.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnBuscar))
        				.addComponent(ListarEmpleadosByProyectos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(240, Short.MAX_VALUE))
        );
        PanelListarEmpleadosByProyectosLayout.setVerticalGroup(
        	PanelListarEmpleadosByProyectosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarEmpleadosByProyectosLayout.createSequentialGroup()
        			.addGap(20)
        			.addGroup(PanelListarEmpleadosByProyectosLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblIdProyecto)
        				.addComponent(textFieldIdProyecto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBuscar))
        			.addGap(37)
        			.addComponent(ListarEmpleadosByProyectos, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(31, Short.MAX_VALUE))
        );
        PanelListarEmpleadosByProyectos.setLayout(PanelListarEmpleadosByProyectosLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelListarEmpleadosByProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelListarEmpleadosByProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
   

	           
	    PanelListarEmpleadosByProyectos.setVisible(true);
        
        pack();
		return PanelListarEmpleadosByProyectos;
	}

}
