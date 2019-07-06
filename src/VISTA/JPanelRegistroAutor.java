package VISTA;

public class JPanelRegistroAutor extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelRegistroAutor(IniciarSesion login) {
        initComponents();
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreAutor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nacionalidadAutor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnGuardarAutor = new javax.swing.JButton();
        codigoAutor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(nombreAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, 30));

        jLabel11.setText("Nombre:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 30));

        jLabel12.setText("Nacionalidad:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 70, 30));

        nacionalidadAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadAutorActionPerformed(evt);
            }
        });
        add(nacionalidadAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 180, 30));

        jLabel10.setText("Codigo:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 30));

        btnGuardarAutor.setText("Guardar");
        add(btnGuardarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 110, 40));
        add(codigoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 30));

        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Autor"));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void nacionalidadAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarAutor;
    private javax.swing.JTextField codigoAutor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nacionalidadAutor;
    private javax.swing.JTextField nombreAutor;
    // End of variables declaration//GEN-END:variables
}
