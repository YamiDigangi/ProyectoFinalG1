/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ClasesData.ClienteData;
import ClasesModelo.Conexion;
import ClasesModelo.Cliente;

import java.sql.Connection;
import javax.swing.JOptionPane;


public class Clientes extends javax.swing.JInternalFrame {
    private ClienteData clienteData;
    private Connection con;

   
    public Clientes() {
        initComponents();
        
        
        this.con = Conexion.getConexion();
        this.clienteData = new ClienteData();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jboxEstado = new javax.swing.JCheckBox();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Cliente");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Nº de cliente");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Estado activo:");

        jtfId.setEnabled(false);
        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        jtfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDniFocusLost(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/buscar usuario.png"))); // NOI18N
        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 0, 255));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/disco duro animado.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(0, 0, 255));
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/modificar con lapiz.png"))); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/salir.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jboxEstado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar)))
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jboxEstado)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       int dni = Integer.parseInt(jtfDni.getText());
       String nombre = jtfNombre.getText();
       String apellido = jtfApellido.getText();
       boolean estado = jboxEstado.isEnabled();
       
       
       Cliente cliente = new Cliente(dni, nombre, apellido, estado);     
       clienteData.agregarCliente(cliente);
       jtfId.setText(cliente.getIdCliente()+"");
       
       jtfDni.setText("");
       jtfId.setText("");
       jtfNombre.setText("");
       jtfApellido.setText("");
       jboxEstado.setEnabled(false);
       
       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        int dni = Integer.parseInt(jtfDni.getText());
        Cliente c = clienteData.obtenerClientePorDni(dni);
        if (c.getDni()>0){
            
            try{
               jtfId.setText(c.getIdCliente()+"");
               jtfDni.setText(c.getDni()+"");
               jtfNombre.setText(c.getNombre());
               jtfApellido.setText(c.getApellido());
               jboxEstado.setSelected(c.isEstado());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ud debe ingresar un Numero de Documento");                
                jtfDni.requestFocus();
            
            } 
            }else {
                 JOptionPane.showMessageDialog(this, "Cliente no encontrado");               
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtfDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDniFocusLost
        try {
            Integer.parseInt(jtfDni.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
            jtfDni.setText("");
            jtfDni.requestFocus();
        }
    }//GEN-LAST:event_jtfDniFocusLost

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        if (jtfId.getText() != null) {
            int idCliente = Integer.parseInt(jtfId.getText());
            int dni = Integer.parseInt(jtfDni.getText());
            String nombre = jtfNombre.getText();
            String apellido = jtfApellido.getText();
            boolean estado= jboxEstado.isEnabled();
            
            Cliente cliente = new Cliente(idCliente,dni,nombre,apellido,estado);
            clienteData.modificarCliente(cliente);
        }
    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jboxEstado;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
