package SERVICE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static Connection connection;
    private static String database = "bibliotecaudes";
    private static String user = "root";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost:3306/" + database;
    private static JDBCMiddler jdbc;

    public static boolean connect() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
            return true;
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return false;
        }

    }

    public static boolean isConnected() {
        return connection != null;
    }

    public static void closeConnection() {

        if (isConnected()) {
            try {
                connection.close();
                connection = null;
                // System.out.println("Se ha finalizado la conexión con el servidor");
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static boolean ejecutarActualizacionSQL(String comandoSQL) {
        {
            try {
                boolean ok;
                if (connect()) {
                    PreparedStatement sql = connection.prepareStatement(comandoSQL);
                    ok = sql.executeUpdate() != 0;
                    sql.close();
                    sql = null;
                    closeConnection();
                    return ok;
                } else {
                    return false;
                }
            } catch (Exception e) {
                System.err.println("SQL Error:" + e.getMessage());
                return (false);
            }
        }
    }

    public static ArrayList<String> getSQL(String a) {
        StringBuffer html = new StringBuffer();
        ArrayList<String> v = new ArrayList();
        try {
            if (connect()) {
                Statement sql = connection.createStatement();
                //System.out.println(a);
                ResultSet rs = sql.executeQuery(a);
                ResultSetMetaData rsm = rs.getMetaData();
                while (rs.next()) {
                    String r = "";
                    for (int i = 1; i <= rsm.getColumnCount(); i++) {
                        r = r + rs.getString(i) + "/";
                    }
                    v.add(r);
                }
                closeConnection();
            }
        } catch (SQLException n) {
            System.err.println("SQL " + n.getMessage());
        } catch (Exception e) {
            System.err.println("SQL Error:" + e.getMessage());
        }
        return v;
    }
}
