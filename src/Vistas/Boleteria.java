/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

/**
 *
 * @author yamic
 */
public class Boleteria extends javax.swing.JFrame {

    /** Creates new form Boleteria */
    public Boleteria() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiCliente = new javax.swing.JMenu();
        jmiNuevoCliente = new javax.swing.JMenuItem();
        jmProgramacion = new javax.swing.JMenu();
        jmiProyecciones = new javax.swing.JMenuItem();
        jmiSalas = new javax.swing.JMenuItem();
        jmiPeliculas = new javax.swing.JMenuItem();
        jmTicket = new javax.swing.JMenu();
        jmiTicket = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 0, 204));
        jLabel1.setForeground(new java.awt.Color(255, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/fondo minions.jpg"))); // NOI18N

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jmiCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/usuarios hombre y mujer.png"))); // NOI18N
        jmiCliente.setText("Cliente");
        jmiCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jmiNuevoCliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jmiNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/agregar usuario.png"))); // NOI18N
        jmiNuevoCliente.setText("Nuevo Cliente");
        jmiNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoClienteActionPerformed(evt);
            }
        });
        jmiCliente.add(jmiNuevoCliente);

        jMenuBar1.add(jmiCliente);

        jmProgramacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/cine .png"))); // NOI18N
        jmProgramacion.setText("Programacion");
        jmProgramacion.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jmiProyecciones.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jmiProyecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/pryector negro.png"))); // NOI18N
        jmiProyecciones.setText("Proyecciones");
        jmiProyecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProyeccionesActionPerformed(evt);
            }
        });
        jmProgramacion.add(jmiProyecciones);

        jmiSalas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jmiSalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/stage_theater_show_performance_cinema_icon_190832 - copia.png"))); // NOI18N
        jmiSalas.setText("Salas");
        jmiSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalasActionPerformed(evt);
            }
        });
        jmProgramacion.add(jmiSalas);

        jmiPeliculas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jmiPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/rollo de pelicula.png"))); // NOI18N
        jmiPeliculas.setText("Peliculas");
        jmiPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPeliculasActionPerformed(evt);
            }
        });
        jmProgramacion.add(jmiPeliculas);

        jMenuBar1.add(jmProgramacion);

        jmTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/ticket de colores.png"))); // NOI18N
        jmTicket.setText("Ticket");
        jmTicket.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jmiTicket.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jmiTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/ticket-add_25321.png"))); // NOI18N
        jmiTicket.setText("Creacion de Ticket");
        jmiTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTicketActionPerformed(evt);
            }
        });
        jmTicket.add(jmiTicket);

        jMenuBar1.add(jmTicket);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgVistas/salir.png"))); // NOI18N
        jmSalir.setText("Salir ");
        jmSalir.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmiNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Clientes c = new Clientes();
        c.setVisible(true);
        escritorio.add(c);
    }//GEN-LAST:event_jmiNuevoClienteActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmiProyeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProyeccionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Proyecciones pro = new Proyecciones();
        pro.setVisible(true);
        escritorio.add(pro);
    }//GEN-LAST:event_jmiProyeccionesActionPerformed

    private void jmiSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Salas s = new Salas();
        s.setVisible(true);
        escritorio.add(s);
    }//GEN-LAST:event_jmiSalasActionPerformed

    private void jmiPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPeliculasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Peliculas p = new Peliculas();
        p.setVisible(true);
        escritorio.add(p);
    }//GEN-LAST:event_jmiPeliculasActionPerformed

    private void jmiTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTicketActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Tickets t = new Tickets();
        t.setVisible(true);
        escritorio.add(t);
    }//GEN-LAST:event_jmiTicketActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Boleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boleteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmProgramacion;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmTicket;
    private javax.swing.JMenu jmiCliente;
    private javax.swing.JMenuItem jmiNuevoCliente;
    private javax.swing.JMenuItem jmiPeliculas;
    private javax.swing.JMenuItem jmiProyecciones;
    private javax.swing.JMenuItem jmiSalas;
    private javax.swing.JMenuItem jmiTicket;
    // End of variables declaration//GEN-END:variables

}
