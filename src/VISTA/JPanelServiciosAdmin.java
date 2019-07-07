package VISTA;

import UTIL.CambiaPanel;
import java.awt.Component;
import java.util.ArrayList;

public class JPanelServiciosAdmin extends javax.swing.JPanel {

    private IniciarSesion login;
    private String rolLogueado;
    private Component gestionarUsuarios;
    private Component actualizarSistema;
    private Component generarReportes;

    public JPanelServiciosAdmin(IniciarSesion login, String rol) {
        initComponents();
        this.login = login;
        this.rolLogueado = rol;
        
        gestionarUsuarios = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(gestionarUsuarios);
        actualizarSistema = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(actualizarSistema);
        generarReportes = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(generarReportes);
        
        this.btnRegistrarUsuario.setVisible(false);
        this.btnModificarUsuario.setVisible(false);
        this.btnActualizarSección.setVisible(false);
        this.btnActualizarUsuarios.setVisible(false);
        this.btnReporteUsuarios.setVisible(false);
        this.btnReporteReservas.setVisible(false);
        this.btnReporteInventarios.setVisible(false);
        cargarPermisos();
    }

    private void cargarPermisos() {
        ArrayList<String> permisos = login.getFacade().listarPrivilegios(this.rolLogueado);
        for (int i = 0; i < permisos.size(); i++) {
            String[] permiso = permisos.get(i).split("/");
            switch (permiso[0]) {
                case "1":
                    this.gestionarUsuarios.setName("Gestionar Usuarios");
                    this.jTabbedPane1.add(this.gestionarUsuarios);
                    break;
                case "2":
                    this.btnRegistrarUsuario.setVisible(true);
                    break;
                case "3":
                    this.btnModificarUsuario.setVisible(true);
                    break;
                case "4":
                    this.actualizarSistema.setName("Actualizar Sistema");
                    this.jTabbedPane1.add(this.actualizarSistema);
                    break;
                case "5":
                    this.btnActualizarSección.setVisible(true);
                    break;
                case "6":
                    this.btnActualizarUsuarios.setVisible(true);
                    break;
                case "7":
                    this.generarReportes.setName("Generar Reportes");
                    this.jTabbedPane1.add(this.generarReportes);
                    break;
                case "8":
                    this.btnReporteUsuarios.setVisible(true);
                    break;
                case "9":
                    this.btnReporteReservas.setVisible(true);
                    break;
                case "10":
                    this.btnReporteInventarios.setVisible(true);
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        pnlPrin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnActualizarSección = new javax.swing.JButton();
        btnActualizarUsuarios = new javax.swing.JButton();
        pnlPrin1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnReporteUsuarios = new javax.swing.JButton();
        btnReporteReservas = new javax.swing.JButton();
        btnReporteInventarios = new javax.swing.JButton();
        pnlPrin2 = new javax.swing.JPanel();

        btnRegistrarUsuario.setText("REGISTRAR USUARIOS");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setText("MODIFICAR USUARIOS");
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        pnlPrin.setLayout(new javax.swing.BoxLayout(pnlPrin, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestionar Usuarios", jPanel1);

        btnActualizarSección.setText("SECCIÓN");
        btnActualizarSección.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSecciónActionPerformed(evt);
            }
        });

        btnActualizarUsuarios.setText("USUARIOS");
        btnActualizarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuariosActionPerformed(evt);
            }
        });

        pnlPrin1.setLayout(new javax.swing.BoxLayout(pnlPrin1, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnActualizarSección, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnActualizarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarSección, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Actualizar Sistema", jPanel2);

        btnReporteUsuarios.setText("USUARIOS");
        btnReporteUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteUsuariosActionPerformed(evt);
            }
        });

        btnReporteReservas.setText("RESERVAS");
        btnReporteReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteReservasActionPerformed(evt);
            }
        });

        btnReporteInventarios.setText("INVENTARIOS");
        btnReporteInventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteInventariosActionPerformed(evt);
            }
        });

        pnlPrin2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnlPrin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnReporteUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnReporteReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(btnReporteInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporteUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(pnlPrin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Generar Reportes", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
       new CambiaPanel(pnlPrin, new JPanelRegistrarUsuarios(login));
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        new CambiaPanel(pnlPrin, new JPanelModificarUsuarios(login));
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnActualizarSecciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSecciónActionPerformed
        new CambiaPanel(pnlPrin1, new JPanelActualizarSección(login));
    }//GEN-LAST:event_btnActualizarSecciónActionPerformed

    private void btnActualizarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuariosActionPerformed
        new CambiaPanel(pnlPrin1, new JPanelActualizarUsuarios(login));
    }//GEN-LAST:event_btnActualizarUsuariosActionPerformed

    private void btnReporteUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteUsuariosActionPerformed
        new CambiaPanel(pnlPrin2, new JPanelReporteUsuarios(login));
    }//GEN-LAST:event_btnReporteUsuariosActionPerformed

    private void btnReporteReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteReservasActionPerformed
       new CambiaPanel(pnlPrin2, new JPanelReporteReservas(login));
    }//GEN-LAST:event_btnReporteReservasActionPerformed

    private void btnReporteInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteInventariosActionPerformed
       new CambiaPanel(pnlPrin2, new JPanelReporteInventarios(login));
    }//GEN-LAST:event_btnReporteInventariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarSección;
    private javax.swing.JButton btnActualizarUsuarios;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnReporteInventarios;
    private javax.swing.JButton btnReporteReservas;
    private javax.swing.JButton btnReporteUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlPrin;
    private javax.swing.JPanel pnlPrin1;
    private javax.swing.JPanel pnlPrin2;
    // End of variables declaration//GEN-END:variables
}
