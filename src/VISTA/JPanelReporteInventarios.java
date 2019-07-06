package VISTA;

public class JPanelReporteInventarios extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelReporteInventarios(IniciarSesion login) {
        initComponents();
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        filtro = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 130, 140, -1));

        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Filtro" }));
        add(filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 16, 239, 34));

        buscar.setText("filtro");
        add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 16, 227, 34));

        btnFiltrar.setText("FILTRAR");
        add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 14, 256, 39));

        jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableInventario);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 175, 821, 210));

        btnImprimir.setText("IMPRIMIR");
        add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 415, 227, 45));

        codigo.setText("  ");
        codigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("fecha:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 60, 20));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("Codigo:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 20));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("INVENTARIO MENSUAL DE LA CANTIDAD DE LIBROS QUE POSEE LA BIBLIOTECA");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 530, 20));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("BIBLIOTECA  UDES");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 220, 20));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 64, 821, 100));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<String> filtro;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInventario;
    // End of variables declaration//GEN-END:variables
}
