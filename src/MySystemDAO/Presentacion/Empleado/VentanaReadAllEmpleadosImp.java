package MySystemDAO.Presentacion.Empleado;

import java.awt.Component;
import java.util.Collection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;

import MySystemDAO.Negocio.Empleado.TEmpleado;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;

public class VentanaReadAllEmpleadosImp extends VentanaReadAllEmpleados{
	private javax.swing.JScrollPane ListarEmpleados;
    private javax.swing.JPanel PanelListarEmpleados;
    private javax.swing.JTable TablaListarEmpleados;

	@Override
	public void update(Object data) {
		if(data != null){
			MyTabla tiModel = new MyTabla((Collection<TEmpleado>)data);
			TablaListarEmpleados.setModel(tiModel);
			repaint();
			revalidate();
		}
		else {
			JOptionPane.showMessageDialog(null, "No se encontraron registros.");
		}
		
		
	}

	@SuppressWarnings("serial")
	@Override
	public Component initGUI() {
		PanelListarEmpleados = new javax.swing.JPanel();
		ListarEmpleados = new javax.swing.JScrollPane();
		TablaListarEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaListarEmpleados.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        TablaListarEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaListarEmpleados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

		Contexto context = new Contexto(EventoGUI.COMANDO_READALL_EMPLEADO,
				null);
		Controlador.getInstance().action(context);

        ListarEmpleados.setViewportView(TablaListarEmpleados);

        javax.swing.GroupLayout PanelListarEmpleadosLayout = new javax.swing.GroupLayout(PanelListarEmpleados);
        PanelListarEmpleadosLayout.setHorizontalGroup(
        	PanelListarEmpleadosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarEmpleadosLayout.createSequentialGroup()
        			.addGap(44)
        			.addComponent(ListarEmpleados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(240, Short.MAX_VALUE))
        );
        PanelListarEmpleadosLayout.setVerticalGroup(
        	PanelListarEmpleadosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelListarEmpleadosLayout.createSequentialGroup()
        			.addGap(19)
        			.addComponent(ListarEmpleados, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(31, Short.MAX_VALUE))
        );
        PanelListarEmpleados.setLayout(PanelListarEmpleadosLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelListarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelListarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
   

	           
	    PanelListarEmpleados.setVisible(true);
        
        pack();
		return PanelListarEmpleados;
	}

}
