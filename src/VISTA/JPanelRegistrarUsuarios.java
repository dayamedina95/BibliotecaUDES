package VISTA;

public class JPanelRegistrarUsuarios extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelRegistrarUsuarios(IniciarSesion login) {
        
        initComponents();
        this.login = login;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        documento = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        confirContrasena = new javax.swing.JPasswordField();
        contrasena = new javax.swing.JPasswordField();
        tipoDoc = new javax.swing.JComboBox<>();
        rol = new javax.swing.JComboBox<>();
        femenino1 = new javax.swing.JCheckBox();
        femenino = new javax.swing.JCheckBox();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoActionPerformed(evt);
            }
        });
        add(documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 230, 30));

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 30));
        add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 230, 30));

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 230, 30));
        add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 230, 30));
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 230, 30));

        confirContrasena.setText("jPasswordField1");
        add(confirContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 230, 30));

        contrasena.setText("jPasswordField1");
        add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 230, 30));

        tipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C", "C.E", "T.I" }));
        add(tipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });
        add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 220, 30));

        femenino1.setText("       MASCULINO");
        add(femenino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        femenino.setText("       FEMENINO");
        add(femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));
        add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 230, 30));

        btnRegistrar.setText("REGISTRAR");
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 170, 60));

        jLabel3.setText("TELEFONO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        jLabel4.setText("NOMBRE COMPLETO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel5.setText("GENERO");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, 20));

        jLabel6.setText("DIRECCIÓN:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel7.setText("FECHA DE NACIMIENTO:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel8.setText("CORREO ELECTRONICO");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 20));

        jLabel9.setText("CONFIRMAR CONTRASEÑA:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 20));

        jLabel10.setText("USUARIO:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 20));

        jLabel11.setText("CONTRASEÑA:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 20));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 726, 220));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 726, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPasswordField confirContrasena;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField documento;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JCheckBox femenino;
    private javax.swing.JCheckBox femenino1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipoDoc;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
