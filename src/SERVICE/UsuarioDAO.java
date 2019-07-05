package SERVICE;

import MODELO.Usuario;
import SERVICE.Database;
import java.util.ArrayList;

public class UsuarioDAO {

    public static String login(Usuario usuario) {
        StringBuilder cadSql = new StringBuilder();
        cadSql.append(" select *  from usuario where idPersona=");
        cadSql.append(usuario.getCodigoDocente());
        cadSql.append(" and contraseña =");
        cadSql.append(usuario.getPassword());
        if (Database.getSQL(cadSql.toString()).size() > 0) {
            if (personaRol(usuario)) {
                return "ok";
            } else {
                return "este usuario no tiene asignado este rol";
            }
        }
        return "usuario incorrecto";
    }

    public static boolean personaRol(Usuario myUsuario) {
        StringBuilder cadSql = new StringBuilder();
        cadSql.append(" select *  from usuario where idPersona=");
        cadSql.append(myUsuario.getCodigoDocente());
        cadSql.append(" and idRol =");
        cadSql.append(myUsuario.getRol());
        if(Database.getSQL(cadSql.toString()).size() > 0) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> consultarPrivilegios(String rol) {
        StringBuilder cadSql = new StringBuilder();
        cadSql.append(" select p.idRequerimiento,p.idRol,m.idModulo  from privilegios p");
        cadSql.append(" inner join requerimientos r on p.idRequerimiento = r.idRequerimiento ");
        cadSql.append(" inner join modulosistema m on r.idModulo = m.idModulo ");
        cadSql.append(" where p.idRol = ");
        cadSql.append(rol);
        return Database.getSQL(cadSql.toString());
    }
    
}
