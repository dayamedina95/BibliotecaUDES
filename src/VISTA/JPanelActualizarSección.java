package VISTA;

public class JPanelActualizarSección extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelActualizarSección(IniciarSesion login) {
        initComponents();
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rol = new javax.swing.JComboBox<>();
        categorias = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        seccionA = new javax.swing.JCheckBox();
        seccionB = new javax.swing.JCheckBox();
        seccionC = new javax.swing.JCheckBox();
        seccionD = new javax.swing.JCheckBox();
        seccionE = new javax.swing.JCheckBox();
        seccionF = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        add(categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 63, 251, 33));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 20, 290));

        seccionA.setBackground(new java.awt.Color(255, 255, 255));
        seccionA.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        seccionA.setText("     Sección A");
        seccionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccionAActionPerformed(evt);
            }
        });
        add(seccionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 230, 40));

        seccionB.setBackground(new java.awt.Color(255, 255, 255));
        seccionB.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        seccionB.setText("     Sección B");
        add(seccionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 230, 40));

        seccionC.setBackground(new java.awt.Color(255, 255, 255));
        seccionC.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        seccionC.setText("     Sección C");
        seccionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccionCActionPerformed(evt);
            }
        });
        add(seccionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 230, -1));

        seccionD.setBackground(new java.awt.Color(255, 255, 255));
        seccionD.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        seccionD.setText("     Sección D");
        add(seccionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 230, -1));

        seccionE.setBackground(new java.awt.Color(255, 255, 255));
        seccionE.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        seccionE.setText("     Sección E");
        seccionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccionEActionPerformed(evt);
            }
        });
        add(seccionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 230, -1));

        seccionF.setBackground(new java.awt.Color(255, 255, 255));
        seccionF.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        seccionF.setText("     Sección F");
        add(seccionF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 230, -1));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel6.setText("CATEGORIAS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel8.setText("SECCIÓN");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 713, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed

    }//GEN-LAST:event_rolActionPerformed

    private void seccionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seccionAActionPerformed

    private void seccionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccionCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seccionCActionPerformed

    private void seccionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccionEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seccionEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JCheckBox seccionA;
    private javax.swing.JCheckBox seccionB;
    private javax.swing.JCheckBox seccionC;
    private javax.swing.JCheckBox seccionD;
    private javax.swing.JCheckBox seccionE;
    private javax.swing.JCheckBox seccionF;
    // End of variables declaration//GEN-END:variables
}
