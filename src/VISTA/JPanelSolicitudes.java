package VISTA;

import UTIL.CambiaPanel;

public class JPanelSolicitudes extends javax.swing.JPanel {

    private IniciarSesion login;

    public JPanelSolicitudes(IniciarSesion login) {
        initComponents();
        this.login = login;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brtnPrestamos = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        pnlPrin = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brtnPrestamos.setText("Prestamos");
        brtnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brtnPrestamosActionPerformed(evt);
            }
        });
        add(brtnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 21, 143, 63));

        btnDevoluciones.setText("Devoluciones");
        btnDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionesActionPerformed(evt);
            }
        });
        add(btnDevoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 21, 143, 63));

        pnlPrin.setLayout(new java.awt.BorderLayout());
        add(pnlPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 660, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void brtnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brtnPrestamosActionPerformed
        new CambiaPanel(pnlPrin, new JPanelPrestamos(login));
    }//GEN-LAST:event_brtnPrestamosActionPerformed

    private void btnDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionesActionPerformed
       new CambiaPanel(pnlPrin, new JPanelDevoluciones(login));
    }//GEN-LAST:event_btnDevolucionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brtnPrestamos;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JPanel pnlPrin;
    // End of variables declaration//GEN-END:variables
}
