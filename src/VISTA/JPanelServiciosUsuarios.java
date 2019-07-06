package VISTA;

import UTIL.CambiaPanel;
import java.awt.Component;
import java.util.ArrayList;

public class JPanelServiciosUsuarios extends javax.swing.JPanel {

    private IniciarSesion login;
    private String rolLogueado;
    private Component gestionarLibros;

    public JPanelServiciosUsuarios(IniciarSesion login, String rol) {
        initComponents();
        this.login = login;
        this.rolLogueado = rol;
        gestionarLibros = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(gestionarLibros);
        this.btnConsultarLibros.setVisible(false);
        this.btnRegistrarPrestamo.setVisible(false);
        this.btnRegistrarDevolucion.setVisible(false);
        this.btnReservarLibro.setVisible(false);
        cargarPermisos();
    }

    private void cargarPermisos() {
        ArrayList<String> permisos = login.getFacade().listarPrivilegios(this.rolLogueado);
        for (int i = 0; i < permisos.size(); i++) {
            String[] permiso = permisos.get(i).split("/");
            switch (permiso[0]) {
                case "28":
                    this.gestionarLibros.setName("Gestionar Libros");
                    this.jTabbedPane1.add(this.gestionarLibros);
                    break;
                case "29":
                    this.btnConsultarLibros.setVisible(true);
                    break;
                case "30":
                    this.btnRegistrarPrestamo.setVisible(true);
                    break;
                case "31":
                    this.btnRegistrarDevolucion.setVisible(true);
                    break;
                case "32":
                    this.btnReservarLibro.setVisible(true);
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnConsultarLibros = new javax.swing.JButton();
        btnRegistrarPrestamo = new javax.swing.JButton();
        btnRegistrarDevolucion = new javax.swing.JButton();
        btnReservarLibro = new javax.swing.JButton();
        pnlPrin = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultarLibros.setText("Consultar Libros");
        btnConsultarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarLibrosActionPerformed(evt);
            }
        });

        btnRegistrarPrestamo.setText("Registrar Prestamo");
        btnRegistrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPrestamoActionPerformed(evt);
            }
        });

        btnRegistrarDevolucion.setText("Registrar Devolucion");
        btnRegistrarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDevolucionActionPerformed(evt);
            }
        });

        btnReservarLibro.setText("Reservar Libro");
        btnReservarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarLibroActionPerformed(evt);
            }
        });

        pnlPrin.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnConsultarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarPrestamo)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarDevolucion)
                .addGap(18, 18, 18)
                .addComponent(btnReservarLibro)
                .addContainerGap(214, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsultarLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReservarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPrin, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestionar Libros", jPanel1);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarLibrosActionPerformed
        new CambiaPanel(pnlPrin, new JPanelConsultarLibros(login));
    }//GEN-LAST:event_btnConsultarLibrosActionPerformed

    private void btnRegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoActionPerformed
       new CambiaPanel(pnlPrin, new JPanelRegistrarPrestamo(login));
    }//GEN-LAST:event_btnRegistrarPrestamoActionPerformed

    private void btnRegistrarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDevolucionActionPerformed
       new CambiaPanel(pnlPrin, new JPanelRegistrarDevolucion(login));
    }//GEN-LAST:event_btnRegistrarDevolucionActionPerformed

    private void btnReservarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarLibroActionPerformed
        new CambiaPanel(pnlPrin, new JPanelReservarLibros(login));
    }//GEN-LAST:event_btnReservarLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarLibros;
    private javax.swing.JButton btnRegistrarDevolucion;
    private javax.swing.JButton btnRegistrarPrestamo;
    private javax.swing.JButton btnReservarLibro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlPrin;
    // End of variables declaration//GEN-END:variables
}
