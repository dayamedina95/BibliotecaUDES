package VISTA;

import CONTROLADOR.UsuarioControler;
import UTIL.CambiaPanel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPanelRegistrarUsuarios extends javax.swing.JPanel {

    private IniciarSesion login;
    private UsuarioControler control;
    private ArrayList roles;
    private String personaCambiarRol[];
    private String personaContraseña;
    private final DefaultTableModel modelo;
    private ArrayList personas;

    public JPanelRegistrarUsuarios(IniciarSesion login) {
        String encabezado[] = {"Cedula", "Tipo Documento", "Nombre", "Telefono", "Direccion", "Sexo", "Fecha Nacimiento", "Correo"};
        modelo = new DefaultTableModel(null, encabezado);
        initComponents();
        this.login = login;
        this.control = new UsuarioControler();
        pnlPrincipal.setVisible(false);
        cargarSelect();
        this.roles = new ArrayList();
        roles = control.listarRoles();
        this.personas = new ArrayList();
        cargarPersonas();
    }

    public void cargarPersonas() {
        personas = control.listarPersonas();
        UTIL.manejoTablas.llenarTabla(modelo, personas);
    }

    public void cargarSelect() {
        roles = control.listarRoles();
        for (Object role : roles) {
            String split[] = role.toString().split("/");
            comboRolAsiganar.addItem(split[0] + "-" + split[1]);
        }
//        for (int i = 0; i < roles.size(); i++) {
//            String rol[] = roles.get(i).toString().split("/");
//            comboRolAsiganar.addItem(rol[1]);
//
//        }
        System.out.println(roles);
    }

//    private void asigarRol(ActionEvent evt) {
//        System.out.println(comboRolAsiganar.getSelectedItem());
//        String rol[] = roles.get(comboRolAsiganar.getSelectedIndex()).toString().split("/");
//        if (control.asignarUsuario(personaCambiarRol[0], personaContraseña, Integer.parseInt(rol[0]))) {
//            JOptionPane.showMessageDialog(null, "Rol asignado correctamente");
//            comboRolAsiganar.addItem((String) comboRolAsiganar.getSelectedItem());
//        }
//        JOptionPane.showMessageDialog(null, "A ocurrido un error al asignar el nuevo rol");
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSexo = new javax.swing.ButtonGroup();
        numeroCedula = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        tipoDocumento = new javax.swing.JComboBox<>();
        masculino = new javax.swing.JCheckBox();
        femenino = new javax.swing.JCheckBox();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAsignarUsuario = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        contrasena1 = new javax.swing.JPasswordField();
        confirContrasena1 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnRegistrar1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        comboRolAsiganar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaPersonas = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(numeroCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 230, 30));
        add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 230, 30));
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 230, 30));
        add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 230, 30));
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 230, 30));

        tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Documento", "C.C", "C.E", "T.I" }));
        add(tipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        btnSexo.add(masculino);
        masculino.setText("       MASCULINO");
        add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 20));

        btnSexo.add(femenino);
        femenino.setText("       FEMENINO");
        add(femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, 20));
        add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 230, 30));

        jLabel3.setText("TELEFONO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 20));

        jLabel4.setText("NOMBRE COMPLETO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel5.setText("GENERO: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jLabel6.setText("DIRECCIÓN:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 20));

        jLabel7.setText("FECHA DE NACIMIENTO:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel8.setText("CORREO ELECTRONICO");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 20, 130, 20));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 130, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 51)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 200));

        btnAsignarUsuario.setText("Asignar Usuario");
        btnAsignarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarUsuarioActionPerformed(evt);
            }
        });
        add(btnAsignarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 140, 40));

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlPrincipal.add(contrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 280, 30));

        confirContrasena1.setToolTipText("");
        pnlPrincipal.add(confirContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 280, 30));

        jLabel16.setText("CONFIRMAR CONTRASEÑA:");
        pnlPrincipal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 20));
        pnlPrincipal.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 280, 30));

        jLabel15.setText("CONTRASEÑA:");
        pnlPrincipal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel14.setText("NUMERO DE CEDULA:");
        pnlPrincipal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        btnRegistrar1.setText("REGISTRAR");
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 170, 40));

        jLabel17.setText("ROL:");
        pnlPrincipal.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 30, 20));

        comboRolAsiganar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        pnlPrincipal.add(comboRolAsiganar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 220, 30));

        jTablaPersonas.setModel(modelo);
        jTablaPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaPersonas);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 760, 100));

        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 51)));
        pnlPrincipal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 260));

        add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 780, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String cedula = numeroCedula.getText();
        String tipoDoc = tipoDocumento.getSelectedItem() + "";
        String nombreUser = nombre.getText();
        String cel = telefono.getText();
        String direc = direccion.getText();
        String fecha1 = (fechaNacimiento.getCalendar().get(Calendar.YEAR)) + "-" + (fechaNacimiento.getCalendar().get(Calendar.MONTH) + 1) + "-" + (fechaNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH)) + "";
        String correo = email.getText();
        String sexo = "";
        if (femenino.isSelected()) {
            sexo = "femenino";
        } else {
            sexo = "masculino";
        }
        if (numeroCedula.toString().length() > 11 && tipoDocumento.getSelectedIndex() == 0 && nombreUser.isEmpty() && cel.isEmpty()
                && direc.isEmpty() && correo.isEmpty() && fechaNacimiento.getDate() == null && femenino.isSelected() == false
                && masculino.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Por Favor Complete los Campos");
        } else if (control.registrarPersona(cedula, tipoDoc, nombreUser, cel, direc, sexo, fecha1, correo)) {
            numeroCedula.setText("");
            tipoDocumento.setSelectedIndex(0);
            nombre.setText("");
            telefono.setText("");
            direccion.setText("");
            fechaNacimiento.setDateFormatString("");
            email.setText("");
            femenino.setSelected(false);
            masculino.setSelected(false);

            JOptionPane.showMessageDialog(null, "Datos registrados con exito");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAsignarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarUsuarioActionPerformed
        pnlPrincipal.setVisible(true);
    }//GEN-LAST:event_btnAsignarUsuarioActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed

        String split[] = roles.get(comboRolAsiganar.getSelectedIndex() - 1).toString().split("/");
        String cedula = txtCedula.getText();
        String clave = confirContrasena1.getText();
        String conClave = contrasena1.getText();
        int Rol = Integer.parseInt(split[0]);

        if (!contrasena1.getText().equals(confirContrasena1.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        } else if (cedula.isEmpty() || clave.isEmpty() || conClave.isEmpty() || comboRolAsiganar.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por Favor Complete los Campos");
        } else if (control.registrarUsuario(cedula, clave, Rol)) {
            comboRolAsiganar.setSelectedIndex(0);
            txtCedula.setText("");
            contrasena1.setText("");
            confirContrasena1.setText("");
            JOptionPane.showMessageDialog(null, "Datos registrados con exito");
        }

    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void jTablaPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaPersonasMouseClicked
        personaCambiarRol = personas.get(jTablaPersonas.getSelectedRow()).toString().split("/");
        txtCedula.setText(personaCambiarRol[0]);
    }//GEN-LAST:event_jTablaPersonasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarUsuario;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.ButtonGroup btnSexo;
    private javax.swing.JComboBox<String> comboRolAsiganar;
    private javax.swing.JPasswordField confirContrasena1;
    private javax.swing.JPasswordField contrasena1;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField email;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JCheckBox femenino;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaPersonas;
    private javax.swing.JCheckBox masculino;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroCedula;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipoDocumento;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
