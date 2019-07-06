package VISTA;

public class JPanelReservarLibros extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelReservarLibros(IniciarSesion login) {
        initComponents();
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        codigoLibro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrestamo = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultar.setText("RESERVAR");
        add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 14, 175, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CODIGO LIBRO:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, 160, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("TITULO:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 66, 160, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("AUTOR:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 121, 160, 34));

        autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorActionPerformed(evt);
            }
        });
        add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 124, 227, 34));

        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 69, 227, 34));

        codigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoLibroActionPerformed(evt);
            }
        });
        add(codigoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 14, 227, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("SOLICITUDES DE RESERVAS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 176, 264, 34));

        jTablePrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePrestamo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 223, 523, 240));

        btnCancelar.setText("CANCELAR SOLICITUD");
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 309, 188, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void codigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JTextField codigoLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrestamo;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
