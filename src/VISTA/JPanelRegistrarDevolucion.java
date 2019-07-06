package VISTA;

public class JPanelRegistrarDevolucion extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelRegistrarDevolucion(IniciarSesion login) {
        initComponents();
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrestamo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDevololver = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("LIBROS PRESTADOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 201, 34));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 523, 159));

        jButton1.setText("DEVOLVER");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 107, 201, 44));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SOLICITUD DE LIBROS A DEVOLVER");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 244, 316, 34));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 226, 782, 12));

        jTableDevololver.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableDevololver);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 523, 159));

        jButton2.setText("CANCELAR");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 338, 201, 44));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDevololver;
    private javax.swing.JTable jTablePrestamo;
    // End of variables declaration//GEN-END:variables
}
