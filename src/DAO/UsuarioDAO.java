package DAO;

import MODELO.Persona;
import UTIL.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO extends Database {

    //Iniciar Sesion **********************************************************
    public boolean login(String cedula, String clave, String rol) {
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

    public ArrayList<String> consultarPrivilegios(String rol) {
        StringBuilder cadSql = new StringBuilder();
        cadSql.append(" select p.id_requerimiento,p.id_rol,m.id from privilegios p");
        cadSql.append(" inner join requerimiento r on p.id_requerimiento = r.id ");
        cadSql.append(" inner join modulo m on r.id_modulo = m.id ");
        cadSql.append(" where p.id_rol = ");
        cadSql.append(rol);
        return Database.getSQL(cadSql.toString());
    }

    //Registro********************************************************
    public boolean registrarPersona(Persona persona) {
        return (Database.ejecutarActualizacionSQL("insert into persona "
                + "(numero_cedula, tipo_documento, nombre, "
                + "telefono, direccion, sexo, fecha_nacimiento, "
                + "email) values ('" + persona.getCedula() + "','"
                + persona.getTipoDocumento() + "','" + persona.getNombre()
                + "','" + persona.getTelefono() + "','" + persona.getDireccion()
                + "','" + persona.getSexo() + "','" + persona.getFechaNacimiento() + "','" + persona.getEmail() + "')"));
    }

    public boolean registrarUsuario(String cedula, String clave, int idRol) {
        return (Database.ejecutarActualizacionSQL("INSERT INTO usuario (id_persona, contraseña, id_rol) "
                + "VALUES ('" + cedula + "','" + clave + "','" + idRol + "')"));
    }

    //Actualizaciones***********************************************************
    public boolean actualizarPersona(Persona persona) {
        return (Database.ejecutarActualizacionSQL("UPDATE persona SET tipo_documento = '" + persona.getTipoDocumento() + "', nombre = '" + persona.getNombre() + "', "
                + "telefono = '" + persona.getTelefono() + "', direccion = '" + persona.getDireccion() + "', sexo = '" + persona.getSexo() + "', "
                + "fecha_nacimiento = '" + persona.getFechaNacimiento() + "', email = '" + persona.getEmail() + "' where numero_cedula = " + persona.getCedula()));
    }

    //Listar********************************************************************
    public ArrayList<String> cargarUsuarios() {
        return (Database.getSQL("select id_persona, contraseña, id_rol from usuario where 1"));
    }

//    public ArrayList<String> cargarPersonas() {
//        return (Database.getSQL("select numero_cedula, tipo_documento, nombre, telefono, direccion, sexo, fecha_nacimiento, email from persona where 1"));
//    }

//    public ArrayList<String> filtroPersona(Persona persona) {
//        return (Database.getSQL("select * from persona where numero_cedula = " + persona.getCedula()));
//    }

    //Validaciones*************************************************************
    public boolean existeRegistro(String cedula) {
        return (Database.getSQL("select * from persona where numero_cedula = '" + cedula + "'")).size() > 0;
    }

    public boolean verificarUsuario(String cedula) {
        return (Database.getSQL("select * from usuario where id_persona = '" + cedula + "'")).size() > 0;
    }

    // este es el metodo luis
    public ArrayList<Persona> listarPersonas(){
        ArrayList<Persona> list = new ArrayList<>();
        String sql = "select * from persona";
        Database conec = new Database();
        Statement ps = null;
        ResultSet rs = null;
        try {
            ps = conec.getConnection().createStatement();
            rs = ps.executeQuery(sql);
            while(rs.next()){
                Persona persona = new Persona();
                persona.setCedula(rs.getString(1));
                persona.setTipoDocumento(rs.getString(2));
                persona.setNombre(rs.getString(3));
                persona.setTelefono(rs.getString(4));
                persona.setDireccion(rs.getString(5));
                persona.setSexo(rs.getString(6));
                persona.setFechaNacimiento(rs.getString(7));
                persona.setEmail(rs.getString(8));
                list.add(persona);
                System.out.println("no llego aca");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("llego aca");
            conec.closeConnection();
        }
        return list;     
    }
//    public ArrayList<String> cargarPersonas(ArrayList<Persona> persona) {
//        return (Database.getSQL("select numero_cedula, tipo_documento, nombre, telefono, direccion, sexo, fecha_nacimiento, email from persona where 1"));
//    }
//    public static ArrayList<String> cargarPersonas() {
//        return (Database.getSQL("select numero_cedula, tipo_documento, nombre, telefono, direccion, sexo, fecha_nacimiento, email from persona where 1"));
//    }
}
