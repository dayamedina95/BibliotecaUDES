package DAO;

import UTIL.Database;
import UTIL.Database;
import java.util.ArrayList;

public class RolDAO {

    public static ArrayList<String> cargarRoles() {
        return Database.getSQL("select * from rol order by id_rol asc");
    }
}
