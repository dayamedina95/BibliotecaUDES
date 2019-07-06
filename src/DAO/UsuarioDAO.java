package DAO;

import MODELO.Usuario;
import UTIL.Database;
import UTIL.Database;
import java.util.ArrayList;

public class UsuarioDAO {

    public static boolean login(String cedula, String clave, String rol) {
        StringBuilder cadSql = new StringBuilder();
        cadSql.append(" select *  from usuario where id_persona=");
        cadSql.append(cedula);
        cadSql.append(" and contraseña =");
        cadSql.append(clave);
        cadSql.append(" and id_rol =");
        cadSql.append(rol);
        if(Database.getSQL(cadSql.toString()).size() > 0) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> consultarPrivilegios(String rol) {
        StringBuilder cadSql = new StringBuilder();
        cadSql.append(" select p.id_requerimiento,p.id_rol,m.id from privilegios p");
        cadSql.append(" inner join requerimiento r on p.id_requerimiento = r.id ");
        cadSql.append(" inner join modulo m on r.id_modulo = m.id ");
        cadSql.append(" where p.id_rol = ");
        cadSql.append(rol);
        return Database.getSQL(cadSql.toString());
    }
    
}
