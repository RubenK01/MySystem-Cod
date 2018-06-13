package MySystemDAO.Presentacion.Empleado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import MySystemDAO.Negocio.Proyecto.TProyecto;
import MySystemDAO.Presentacion.Comandos.FactoriaComandos.FactoriaComandos;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ventanaPrueba extends JFrame {
	private javax.swing.JScrollPane ListarEmpleadosByProyectos;
    private javax.swing.JPanel PanelListarEmpleadosByProyectos;
    private javax.swing.JTable TablaListarEmpleadosByProyectos;
    private JLabel lblIdProyecto;
    private JTextField textFieldIdProyecto;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("serial")
	public ventanaPrueba() {
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
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
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

		Contexto context = new Contexto(EventoGUI.COMANDO_READ_EMPLEADOS_BY_PROYECTO,
				null);
		Controlador.getInstance().action(context);

        ListarEmpleadosByProyectos.setViewportView(TablaListarEmpleadosByProyectos);
        
        lblIdProyecto = new JLabel("Id Proyecto: ");
        
        textFieldIdProyecto = new JTextField();
        textFieldIdProyecto.setColumns(10);
        
        JButton btnBuscar = new JButton("Buscar");

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
	}
}
