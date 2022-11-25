/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import ClasesData.ClienteData;
import ClasesData.PeliculaData;
import ClasesData.ProyeccionData;
import ClasesModelo.Cliente;
import java.sql.Connection;
import javax.swing.JOptionPane;
import ClasesModelo.Conexion;
import ClasesData.TicketData;
import ClasesModelo.Butaca;
import ClasesModelo.Pelicula;
import ClasesModelo.Proyeccion;
import ClasesModelo.Sala;
import ClasesModelo.Ticket;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yamic
 */
public class Tickets extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    private ClienteData clienteData;
    private PeliculaData peliculaData;
    private Pelicula pelicula;
    private ProyeccionData proData;
    private Connection con;
    private TicketData ticketD;
    private ArrayList<Butaca> listarButacas;
    private ArrayList<Proyeccion> listaProyeccion;
    private Sala sala;
    private Proyeccion proyeccion;
    private Ticket t;
    

    /** Creates new form ticket */
    public Tickets() {
        initComponents();
        peliculaData=new PeliculaData();
        proData= new ProyeccionData();
        modelo = new DefaultTableModel();
        this.con = Conexion.getConexion();
        this.clienteData = new ClienteData();
        this.ticketD= new TicketData();
        jdcFechaCompra.setDate( new Date());
        armarCabecera();
        cargarProyeccion();
       
        

    }
    
    public void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("Id proyeccion");
        columnas.add("Nombre Peli");
        columnas.add("N° de sala");
        columnas.add("Fecha y Hora de Inicio");
        columnas.add("Fecha y Hora de fin");
        
        
        for(Object it:columnas){
            modelo.addColumn(it);
        }
        tProyeccion.setModel(modelo);
    }
    
    public void borrarFilas() {
        
        int a = modelo.getRowCount()-1;
        for(int i= a; i>=0; i--  ){
            modelo.removeRow(i);
        }
    }
    
    public void cargarProyeccion(){
        borrarFilas();
       listaProyeccion = (ArrayList<Proyeccion>) proData.listarProyeccion();
       Proyeccion pro = new Proyeccion();
         
        for(Proyeccion p:listaProyeccion)          
             modelo.addRow(new Object[]{p.getIdProyeccion(),p.getPelicula().getNombrePeli(),p.getSala().getIdSala(),p.getInicioPro(),p.getFinPro()});
            
    }
    
//    public void cargarButacas(){
//       for (Butaca b: listarButacas)
//           jcbButaca.addItem(b);   
//    }
       

   
        
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jdcFechaCompra = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jbLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tProyeccion = new javax.swing.JTable();
        jtfDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfMonto = new javax.swing.JTextField();
        jboxMetPago = new javax.swing.JComboBox<>();
        jcbButaca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfIdTicket = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jtfNombreCli = new javax.swing.JTextField();
        jtfApellidoCli = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtfIdCliente = new javax.swing.JTextField();
        jtfHCompra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("fecha de compra");

        jdcFechaCompra.setForeground(new java.awt.Color(0, 0, 204));
        jdcFechaCompra.setDoubleBuffered(false);
        jdcFechaCompra.setEnabled(false);
        jdcFechaCompra.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Ticket");

        jbBuscar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/buscarUsuario.png"))); // NOI18N
        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 0, 255));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/discoDuroAnimado.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));

        jbLimpiar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 255));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/borrarTicket.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        tProyeccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Nº de sala", "Fecha de inicio", "Hora de inicio", "Hora de fin", "Id Proyeccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tProyeccion.setGridColor(new java.awt.Color(0, 0, 255));
        tProyeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProyeccionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tProyeccion);

        jtfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDniFocusLost(evt);
            }
        });
        jtfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Ingrese DNI del cliente:");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Peliculas:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Butaca:");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Monto a pagar:");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Metodo de pago:");

        jtfMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMontoActionPerformed(evt);
            }
        });

        jboxMetPago.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jboxMetPago.setForeground(new java.awt.Color(0, 0, 204));
        jboxMetPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Debito", "Credito", "Mercado Pago" }));
        jboxMetPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxMetPagoActionPerformed(evt);
            }
        });

        jcbButaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbButacaMouseClicked(evt);
            }
        });
        jcbButaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbButacaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Nº de Ticket");

        jtfIdTicket.setEnabled(false);
        jtfIdTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdTicketActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/salir.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtfNombreCli.setEditable(false);
        jtfNombreCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreCliActionPerformed(evt);
            }
        });

        jtfApellidoCli.setEditable(false);
        jtfApellidoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoCliActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("Nombre:");

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("Apellido:");

        jLabel19.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("Nº de cliente:");

        jtfIdCliente.setEditable(false);

        jtfHCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHCompraActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Hora de compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfHCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfApellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfIdTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jboxMetPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbButaca, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jbGuardar)
                .addGap(92, 92, 92)
                .addComponent(jbLimpiar)
                .addGap(89, 89, 89)
                .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(129, 129, 129))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(247, 247, 247)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addComponent(jLabel2))
                    .addContainerGap(306, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar)
                            .addComponent(jLabel9))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jdcFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfHCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtfNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jtfApellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfIdTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jcbButaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxMetPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(jLabel2)
                    .addContainerGap(413, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

                int dni = Integer.parseInt(jtfDni.getText());
                Cliente c = clienteData.obtenerClientePorDni(dni);
                if (c.getDni()>0){
            
                        try{
                               jtfIdCliente.setText(c.getIdCliente()+"");
                               jtfDni.setText(c.getDni()+"");
                               jtfNombreCli.setText(c.getNombre());
                               jtfApellidoCli.setText(c.getApellido());

                           
                           } catch (NumberFormatException e) {
                               JOptionPane.showMessageDialog(this, "Ud debe ingresar un Numero de Documento");
                               jtfDni.requestFocus();
                
                            }
                        }else {
                             JOptionPane.showMessageDialog(this, "Cliente no encontrado");
                    }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDniActionPerformed

    private void jtfIdTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdTicketActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfNombreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreCliActionPerformed

    private void jtfApellidoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidoCliActionPerformed

    private void jboxMetPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxMetPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxMetPagoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
//         TODO add your handling code here:


        int dni = Integer.parseInt(jtfDni.getText());
        Cliente cli = clienteData.obtenerClientePorDni(dni);
        
        int filaElegida = tProyeccion.getSelectedRow();
        
        int idPro = (Integer) tProyeccion.getValueAt(filaElegida,0);
        Proyeccion pro = proData.obtenerProyeccionPorId(idPro);
        
        Butaca b = (Butaca) jcbButaca.getSelectedItem();
              
        LocalDate fCompra = jdcFechaCompra.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    
        double monto = Double.parseDouble(jtfMonto.getText());
        
        String fp = (String)jboxMetPago.getSelectedItem();
        
        Ticket tic = new Ticket(cli,pro,b,fCompra,monto,fp,true);
         jtfIdTicket.setText(tic.getIdTicket()+"");
        
        ticketD.agregarTicket(tic);
        

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbButacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbButacaMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jcbButacaMouseClicked

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        
        jtfDni.setText("");
        jtfNombreCli.setText("");
        jtfApellidoCli.setText("");
        jtfIdCliente.setText("");
        jtfIdTicket.setText("");
        jtfMonto.setText("");
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtfDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDniFocusLost
        // TODO add your handling code here:
          try {
            Integer.parseInt(jtfDni.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
            jtfDni.setText("");
            jtfDni.requestFocus();
        }
        
    }//GEN-LAST:event_jtfDniFocusLost

    private void jtfMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMontoActionPerformed

    private void jcbButacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbButacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbButacaActionPerformed

    private void tProyeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProyeccionMouseClicked
        // TODO add your handling code here:
        int filaElegida = tProyeccion.getSelectedRow();
        jcbButaca.removeAllItems();
        int idSalaa = (Integer) tProyeccion.getValueAt(filaElegida,2);
        Object iniciop = tProyeccion.getValueAt(filaElegida,3);

        listarButacas = (ArrayList<Butaca>) ticketD.butacasLibres(idSalaa, (java.sql.Timestamp) iniciop);
//        System.out.println("Salida"+ listarButacas);
        for (Butaca b : listarButacas) {
            jcbButaca.addItem(b);
        }

    }//GEN-LAST:event_tProyeccionMouseClicked

    private void jtfHCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jboxMetPago;
    private javax.swing.JComboBox<Butaca> jcbButaca;
    private com.toedter.calendar.JDateChooser jdcFechaCompra;
    private javax.swing.JTextField jtfApellidoCli;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfHCompra;
    private javax.swing.JTextField jtfIdCliente;
    private javax.swing.JTextField jtfIdTicket;
    private javax.swing.JTextField jtfMonto;
    private javax.swing.JTextField jtfNombreCli;
    private javax.swing.JTable tProyeccion;
    // End of variables declaration//GEN-END:variables

}
