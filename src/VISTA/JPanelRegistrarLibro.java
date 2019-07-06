package VISTA;

import UTIL.CambiaPanel;

public class JPanelRegistrarLibro extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelRegistrarLibro(IniciarSesion login) {
        initComponents();
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoLibro = new javax.swing.JTextField();
        tituloLibro = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        precioLibro = new javax.swing.JTextField();
        cantidadLibro = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlAutor = new javax.swing.JPanel();
        btnRegistrarAutor = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(codigoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, 30));
        add(tituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 190, 30));
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, 30));
        add(precioLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 200, 30));
        add(cantidadLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 200, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 200, 30));

        btnGuardar.setText("Guardar");
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 140, 50));

        jLabel8.setText("Categoria:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 60, 30));

        jLabel7.setText("Autor:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, 30));

        jLabel4.setText("Fecha Adquisicion:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel5.setText("Precio:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, 30));

        jLabel6.setText("Cantidad:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 30));

        jLabel3.setText("Titulo:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 30));

        jLabel2.setText("Codigo:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro")));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 250));

        pnlAutor.setLayout(new java.awt.BorderLayout());
        add(pnlAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 630, 140));

        btnRegistrarAutor.setText("Registrar Autor");
        btnRegistrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutorActionPerformed(evt);
            }
        });
        add(btnRegistrarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutorActionPerformed
         new CambiaPanel(pnlAutor, new JPanelRegistroAutor(login));
    }//GEN-LAST:event_btnRegistrarAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrarAutor;
    private javax.swing.JTextField cantidadLibro;
    private javax.swing.JTextField codigoLibro;
    private javax.swing.JTextField fecha;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pnlAutor;
    private javax.swing.JTextField precioLibro;
    private javax.swing.JTextField tituloLibro;
    // End of variables declaration//GEN-END:variables
}
