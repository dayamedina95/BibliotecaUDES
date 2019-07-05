package SERVICE;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionBD {

    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaCon = "jdbc:mysql://127.0.0.1/bibliotecaudes";
    private String usuario = "root";
    private String contraseña  = "";

    public Connection con;

    public conexionBD() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(cadenaCon, usuario, contraseña);
           // JOptionPane.showMessageDialog(null, "conectado");
        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
