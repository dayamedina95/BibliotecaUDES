package DAO;

import MODELO.Persona;
import MODELO.Usuario;
import UTIL.Database;
import UTIL.Database;
import java.util.ArrayList;

public class UsuarioDAO {

    //Iniciar Sesion **********************************************************
    public static boolean login(String cedula, String clave, String rol) {
        StringBuilder cadSql = new StringBuilder();
        cadSql.append(" select *  from usuario where id_persona=");
        cadSql.append(cedula);
        cadSql.append(" and contraseña =");
        cadSql.append(clave);
        cadSql.append(" and id_rol =");
        cadSql.append(rol);
        if (Database.getSQL(cadSql.toString()).size() > 0) {
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

    //Registro de Persona (Usuario) ********************************************************
    public static ArrayList<String> registrarUsuario(ArrayList<Persona> persona) {
        ArrayList<String> respuestas = new ArrayList<>();
        for (int i = 0; i < persona.size(); i++) {
            if (existeRegistro(persona.get(i).getCedula())) {
                respuestas.add(persona.get(i).getCedula() + "/" + "false");
            } else if (agregarRegistro(persona.get(i))) {
                respuestas.add(persona.get(i).getCedula() + "/" + "true");
            } else {
                respuestas.add(persona.get(i).getCedula() + "/" + "false");
            }
        }
        return respuestas;
    }

    private static boolean existeRegistro(String cedula) {
        return (Database.getSQL("select * from persona where numero_cedula = '" + cedula + "'")).size() > 0;
    }

    private static boolean agregarRegistro(Persona persona) {
        return (Database.ejecutarActualizacionSQL("insert into persona (numero_cedula, tipo_documento, nombre, telefono, direccion, sexo, fecha_nacimiento, email) values ('" + persona.getCedula() + "','" + persona.getTipoDocumento() + "','" + persona.getNombre() + "','" + persona.getTelefono() + "','" + persona.getDireccion() + "','" + persona.getSexo() + "','" + persona.getFechaNacimiento() + "','" + persona.getEmail() + "')"));
    }

    //Crear Usuario*************************************************************
    public static ArrayList<String> cargarPersonas() {
        return (Database.getSQL("select numero_cedula, tipo_documento, nombre, telefono, direccion, sexo, fecha_nacimiento, email from persona where 1"));
    }

    public static boolean asignarUsuario(String cedula, String clave, int idRol) {
        if (verificarUsuario(cedula)) {
            return false;
        }
        return (Database.ejecutarActualizacionSQL("INSERT INTO usuario (id_persona, contraseña, id_rol) VALUES ('" + cedula + "','" + clave + "','" + idRol + "')"));
    }

    private static boolean verificarUsuario(String cedula) {
        return (Database.getSQL("select * from usuario where id_persona = '" + cedula + "'")).size() > 0;
    }
    
    public static ArrayList<String> cargarUsuarios() {
        return (Database.getSQL("select id_persona, contraseña, id_rol from usuario where 1"));
    }
}
