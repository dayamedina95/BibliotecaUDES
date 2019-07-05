package VISTA;

import CONTROLADOR.iniciarSesion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    private iniciarSesion login;

    public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(this);
        this.login = new iniciarSesion();
        this.cargarSelect();
    }

    public void cargarSelect() {
        ArrayList<String> elementos = login.listarRoles();
        String numero = 0 + "";
        for (int i = 0; i < elementos.size(); i++) {
            rol.addItem(elementos.get(i).substring(0, elementos.get(i).length() - 1));
        }
    }

    public iniciarSesion getFacade() {
        return this.login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        rol = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        iniciarSesion = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/escudo.png"))); // NOI18N
        jLabel5.setFocusable(false);
        jLabel5.setInheritsPopupMenu(false);
        jLabel5.setRequestFocusEnabled(false);
        jLabel5.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 150));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Ing sistemas (1).png"))); // NOI18N
        jLabel6.setFocusable(false);
        jLabel6.setInheritsPopupMenu(false);
        jLabel6.setRequestFocusEnabled(false);
        jLabel6.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 170));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(34, 115, 168));
        jTextField3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Biblioteca UDES");
        jTextField3.setFocusable(false);
        jTextField3.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 240, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.png"))); // NOI18N
        jLabel1.setText("Cedula:");
        jLabel1.setFocusable(false);
        jLabel1.setInheritsPopupMenu(false);
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 90, 40));

        codigo.setBackground(new java.awt.Color(234, 232, 232));
        codigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        codigo.setForeground(new java.awt.Color(51, 51, 51));
        codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigo.setAutoscrolls(false);
        codigo.setBorder(null);
        codigo.setFocusCycleRoot(true);
        codigo.setFocusTraversalPolicyProvider(true);
        codigo.setName("Username"); // NOI18N
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 240, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pass.png"))); // NOI18N
        jLabel2.setText("Contraseña:");
        jLabel2.setFocusable(false);
        jLabel2.setInheritsPopupMenu(false);
        jLabel2.setRequestFocusEnabled(false);
        jLabel2.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 100, 40));

        contraseña.setBackground(new java.awt.Color(234, 232, 232));
        contraseña.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        contraseña.setForeground(new java.awt.Color(51, 51, 51));
        contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseña.setBorder(null);
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 240, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/rol.png"))); // NOI18N
        jLabel3.setText("Rol");
        jLabel3.setFocusable(false);
        jLabel3.setInheritsPopupMenu(false);
        jLabel3.setRequestFocusEnabled(false);
        jLabel3.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 60, 40));

        rol.setBackground(new java.awt.Color(234, 232, 232));
        rol.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rol.setForeground(new java.awt.Color(51, 51, 51));
        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        rol.setBorder(null);
        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });
        jPanel1.add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 240, 40));

        jTextField8.setBackground(new java.awt.Color(234, 232, 232));
        jTextField8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 51, 51));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setAutoscrolls(false);
        jTextField8.setBorder(null);
        jTextField8.setFocusable(false);
        jTextField8.setName("Username"); // NOI18N
        jTextField8.setRequestFocusEnabled(false);
        jTextField8.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, 40));

        jTextField5.setBackground(new java.awt.Color(234, 232, 232));
        jTextField5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setAutoscrolls(false);
        jTextField5.setBorder(null);
        jTextField5.setFocusable(false);
        jTextField5.setName("Username"); // NOI18N
        jTextField5.setRequestFocusEnabled(false);
        jTextField5.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 160, 40));

        iniciarSesion.setBackground(new java.awt.Color(34, 115, 168));
        iniciarSesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/inicio.png"))); // NOI18N
        iniciarSesion.setText("Iniciar Sesion");
        iniciarSesion.setBorder(null);
        iniciarSesion.setBorderPainted(false);
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 150, 40));

        jTextField7.setBackground(new java.awt.Color(234, 232, 232));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 102, 102));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setAutoscrolls(false);
        jTextField7.setBorder(null);
        jTextField7.setFocusable(false);
        jTextField7.setName("Username"); // NOI18N
        jTextField7.setRequestFocusEnabled(false);
        jTextField7.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 160, 40));

        jTextField1.setBackground(new java.awt.Color(247, 247, 247));
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);
        jTextField1.setRequestFocusEnabled(false);
        jTextField1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 430, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolActionPerformed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        String codigoUser = codigo.getText();
        String clave = contraseña.getText();
        String rolV = rol.getSelectedIndex() + "";
        if (codigo.toString().length() > 3 && clave.isEmpty() && rol.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por Favor Complete los Campos");
        } else if (login.login(codigoUser, clave, rolV).equalsIgnoreCase("ok")) {
            JPanelPrincipal p = new JPanelPrincipal(this, rolV);
            p.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "datos Incorrectos");
        }
    }//GEN-LAST:event_iniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JComboBox<String> rol;
    // End of variables declaration//GEN-END:variables
}
