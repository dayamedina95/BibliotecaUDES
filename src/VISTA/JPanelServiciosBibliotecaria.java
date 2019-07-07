package VISTA;

import UTIL.CambiaPanel;
import java.awt.Component;
import java.util.ArrayList;

public class JPanelServiciosBibliotecaria extends javax.swing.JPanel {

    private IniciarSesion login;
    private String rolLogueado;
    private Component gestionarUsuarios;
    private Component actualizarSistema;
    private Component gestionarInventario;
    private Component gestionarLibro;
    private Component generarReportes;

    public JPanelServiciosBibliotecaria(IniciarSesion login, String rol) {
        initComponents();
        this.login = login;
        this.rolLogueado = rol;
        gestionarUsuarios = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(gestionarUsuarios);
        actualizarSistema = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(actualizarSistema);
        gestionarInventario = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(gestionarInventario);
        gestionarLibro = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(gestionarLibro);
        generarReportes = this.jTabbedPane1.getComponent(0);
        this.jTabbedPane1.remove(generarReportes);
        this.btnRegistrarUsuario.setVisible(false);
        this.btnModificarUsuario.setVisible(false);
        this.btnActualizarSección.setVisible(false);
        this.btnActualizarUsuarios.setVisible(false);
        this.consultarInventario.setVisible(false);
        this.registrarInventario.setVisible(false);
        this.registrarLibro.setVisible(false);
        this.consultarLibros.setVisible(false);
        this.solicitudes.setVisible(false);
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
                case "11":
                    this.gestionarUsuarios.setName("Gestionar Usuarios");
                    this.jTabbedPane1.add(this.gestionarUsuarios);
                    break;
                case "12":
                    this.btnRegistrarUsuario.setVisible(true);
                    break;
                case "13":
                    this.btnModificarUsuario.setVisible(true);
                    break;
                case "14":
                    this.actualizarSistema.setName("Actualizar Sistema");
                    this.jTabbedPane1.add(this.actualizarSistema);
                    break;
                case "15":
                    this.btnActualizarSección.setVisible(true);
                    break;
                case "16":
                    this.btnActualizarUsuarios.setVisible(true);
                    break;
                case "17":
                    this.gestionarInventario.setName("Gestionar Inventario");
                    this.jTabbedPane1.add(this.gestionarInventario);
                    break;
                case "18":
                    this.consultarInventario.setVisible(true);
                    break;
                case "19":
                    this.registrarInventario.setVisible(true);
                    break;
                case "20":
                    this.gestionarLibro.setName("Gestionar Libros");
                    this.jTabbedPane1.add(this.gestionarLibro);
                    break;
                case "21":
                    this.registrarLibro.setVisible(true);
                    break;
                case "22":
                    this.consultarLibros.setVisible(true);
                    break;
                case "23":
                    this.solicitudes.setVisible(true);
                    break;
                case "24":
                    this.generarReportes.setName("Generar Reportes");
                    this.jTabbedPane1.add(this.generarReportes);
                    break;
                case "25":
                    this.btnReporteUsuarios.setVisible(true);
                    break;
                case "26":
                    this.btnReporteReservas.setVisible(true);
                    break;
                case "27":
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
        pnlPrin1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnActualizarSección = new javax.swing.JButton();
        btnActualizarUsuarios = new javax.swing.JButton();
        pnlPrin2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        consultarInventario = new javax.swing.JButton();
        registrarLibro = new javax.swing.JButton();
        registrarInventario = new javax.swing.JButton();
        pnlPrin3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        consultarLibros = new javax.swing.JButton();
        solicitudes = new javax.swing.JButton();
        pnlPrin4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnReporteUsuarios = new javax.swing.JButton();
        btnReporteReservas = new javax.swing.JButton();
        btnReporteInventarios = new javax.swing.JButton();
        pnlPrin5 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlPrin1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlPrin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPrin1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
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

        pnlPrin2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnActualizarSección, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pnlPrin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Actualizar Sistema", jPanel2);

        consultarInventario.setText("Consultar Inventario");
        consultarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarInventarioActionPerformed(evt);
            }
        });

        registrarLibro.setText("Registrar Nuevo Libro");
        registrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarLibroActionPerformed(evt);
            }
        });

        registrarInventario.setText("Registrar Inventario");
        registrarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarInventarioActionPerformed(evt);
            }
        });

        pnlPrin3.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(consultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(registrarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(registrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrin3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(registrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consultarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlPrin3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestionar Inventario", jPanel3);

        consultarLibros.setText("Consultar Libros");
        consultarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarLibrosActionPerformed(evt);
            }
        });

        solicitudes.setText("Solicitudes");
        solicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudesActionPerformed(evt);
            }
        });

        pnlPrin4.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(consultarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(solicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrin4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(consultarLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPrin4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestionar Libros", jPanel4);

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

        pnlPrin5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPrin5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnReporteUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporteUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(pnlPrin5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Generar Reportes", jPanel5);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        new CambiaPanel(pnlPrin1, new JPanelRegistrarUsuarios(login));
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        new CambiaPanel(pnlPrin1, new JPanelModificarUsuarios(login));
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnActualizarSecciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSecciónActionPerformed
        new CambiaPanel(pnlPrin2, new JPanelActualizarSección(login));
    }//GEN-LAST:event_btnActualizarSecciónActionPerformed

    private void btnActualizarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuariosActionPerformed
        new CambiaPanel(pnlPrin2, new JPanelActualizarUsuarios(login));
    }//GEN-LAST:event_btnActualizarUsuariosActionPerformed

    private void btnReporteUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteUsuariosActionPerformed
        new CambiaPanel(pnlPrin5, new JPanelReporteUsuarios(login));
    }//GEN-LAST:event_btnReporteUsuariosActionPerformed

    private void btnReporteReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteReservasActionPerformed
        new CambiaPanel(pnlPrin5, new JPanelReporteReservas(login));
    }//GEN-LAST:event_btnReporteReservasActionPerformed

    private void btnReporteInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteInventariosActionPerformed
        new CambiaPanel(pnlPrin5, new JPanelReporteInventarios(login));
    }//GEN-LAST:event_btnReporteInventariosActionPerformed

    private void consultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarInventarioActionPerformed
        new CambiaPanel(pnlPrin3, new JPanelConsultarInventario(login));
    }//GEN-LAST:event_consultarInventarioActionPerformed

    private void registrarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarInventarioActionPerformed
        new CambiaPanel(pnlPrin3, new JPanelRegistrarInventario(login));
    }//GEN-LAST:event_registrarInventarioActionPerformed

    private void registrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarLibroActionPerformed
        new CambiaPanel(pnlPrin3, new JPanelRegistrarLibro(login));
    }//GEN-LAST:event_registrarLibroActionPerformed

    private void consultarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarLibrosActionPerformed
        new CambiaPanel(pnlPrin4, new JPanelConsultarLibros(login));
    }//GEN-LAST:event_consultarLibrosActionPerformed

    private void solicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudesActionPerformed
        new CambiaPanel(pnlPrin4, new JPanelSolicitudes(login));
    }//GEN-LAST:event_solicitudesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarSección;
    private javax.swing.JButton btnActualizarUsuarios;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnReporteInventarios;
    private javax.swing.JButton btnReporteReservas;
    private javax.swing.JButton btnReporteUsuarios;
    private javax.swing.JButton consultarInventario;
    private javax.swing.JButton consultarLibros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlPrin1;
    private javax.swing.JPanel pnlPrin2;
    private javax.swing.JPanel pnlPrin3;
    private javax.swing.JPanel pnlPrin4;
    private javax.swing.JPanel pnlPrin5;
    private javax.swing.JButton registrarInventario;
    private javax.swing.JButton registrarLibro;
    private javax.swing.JButton solicitudes;
    // End of variables declaration//GEN-END:variables

}
