package VISTA;

public class JPanelConsultarLibros extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelConsultarLibros(IniciarSesion login) {
        initComponents();
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        filtrar = new javax.swing.JComboBox<>();
        buscador = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar Por:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, -1, 26));

        filtrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        add(filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 11, 185, 26));
        add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 11, 178, 26));

        buscar.setText("Buscar");
        add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 11, 125, 26));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 643, 170));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscador;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> filtrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
