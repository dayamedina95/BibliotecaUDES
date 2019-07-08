package DAO;

import UTIL.Database;
import UTIL.Database;
import java.util.ArrayList;

public class RolDAO {

    public static ArrayList<String> cargarRoles() {
        return Database.getSQL("select * from rol order by id_rol asc");
    }
    
    public static boolean crearRol(String descripcion) {
        if (verificarRol(descripcion))
            return false;
        
        return Database.ejecutarActualizacionSQL("insert into rol (descripcion) values ('" + descripcion.toLowerCase()
                + "')");
    }

    public static boolean verificarRol(String descripcion) {
        return (Database.getSQL("select * from rol where descripcion = '" + descripcion.toLowerCase()+"'")).size()  > 0;
    }
}
