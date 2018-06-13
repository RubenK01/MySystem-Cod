package MySystemDAO.Presentacion.Proyecto;

import java.awt.Component;
import java.util.Collection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import MySystemDAO.Negocio.Proyecto.TProyecto;
import MySystemDAO.Presentacion.Controlador.Contexto;
import MySystemDAO.Presentacion.Controlador.Controlador;
import MySystemDAO.Presentacion.Controlador.EventoGUI;
import MySystemDAO.Presentacion.Proyecto.MyTablaProy;

public class VentanaReadAllProyectosImp extends VentanaReadAllProyectos{
	private javax.swing.JScrollPane ListarProyectos;
	private javax.swing.JPanel PanelListarProyectos;
	private javax.swing.JTable TablaListarProyectos;
	
	@Override
	public void update(Object data) {
		//Collection<TProyecto> Proyectos ;
		MyTablaProy tiModel = new MyTablaProy((Collection<TProyecto>) data);
		TablaListarProyectos.setModel(tiModel);
		repaint();
		revalidate();
		
	}
	
	@SuppressWarnings("serial")
	@Override
	public Component initGUI() {
		PanelListarProyectos = new javax.swing.JPanel();
		ListarProyectos = new javax.swing.JScrollPane();
		TablaListarProyectos = new javax.swing.JTable();
	
	    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	
	    TablaListarProyectos.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
	    TablaListarProyectos.setModel(new javax.swing.table.DefaultTableModel(
	        new Object [][] {
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null},
	            {null, null, null, null, null}
	        },
	        new String [] {
	        		"ID Proyecto", "Nombre", "Id Jefe", "Coste", "Activo"}
	    ) {
	        Class[] types = new Class [] {
	            java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
	        };
	        boolean[] canEdit = new boolean [] {
	            false, false, false, false, false
	        };
	
	        public Class getColumnClass(int columnIndex) {
	            return types [columnIndex];
	        }
	
	        public boolean isCellEditable(int rowIndex, int columnIndex) {
	            return canEdit [columnIndex];
	        }
	    });
	    TablaListarProyectos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
	
		Contexto context = new Contexto(EventoGUI.COMANDO_READALL_PROYECTO,
				null);
		Controlador.getInstance().action(context);
	
	    ListarProyectos.setViewportView(TablaListarProyectos);
	
	    javax.swing.GroupLayout PanelListarProyectosLayout = new javax.swing.GroupLayout(PanelListarProyectos);
	    PanelListarProyectosLayout.setHorizontalGroup(
	    	PanelListarProyectosLayout.createParallelGroup(Alignment.LEADING)
	    		.addGroup(PanelListarProyectosLayout.createSequentialGroup()
	    			.addGap(44)
	    			.addComponent(ListarProyectos, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(313, Short.MAX_VALUE))
	    );
	    PanelListarProyectosLayout.setVerticalGroup(
	    	PanelListarProyectosLayout.createParallelGroup(Alignment.LEADING)
	    		.addGroup(PanelListarProyectosLayout.createSequentialGroup()
	    			.addGap(19)
	    			.addComponent(ListarProyectos, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(107, Short.MAX_VALUE))
	    );
	    PanelListarProyectos.setLayout(PanelListarProyectosLayout);
	
	    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	    getContentPane().setLayout(layout);
	    layout.setHorizontalGroup(
	        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addComponent(PanelListarProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    );
	    layout.setVerticalGroup(
	        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(layout.createSequentialGroup()
	            .addComponent(PanelListarProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addGap(0, 0, Short.MAX_VALUE))
	    );
	
	
	           
	    PanelListarProyectos.setVisible(true);
	    
	    pack();
		return PanelListarProyectos;
	}

}