package CONTROLADOR;

import DAO.RolDAO;
import DAO.UsuarioDAO;
import MODELO.Persona;
import java.util.ArrayList;

public class UsuarioControler {

    //inicio de sesion ***********************************************************
    public boolean login(String cedula, String clave, String rol) {
        return UsuarioDAO.login(cedula, clave, rol);
    }

    public ArrayList<String> listarRoles() {
        return RolDAO.cargarRoles();
    }

    public ArrayList<String> listarPrivilegios(String rol) {
        return UsuarioDAO.consultarPrivilegios(rol);
    }

    //Registro de un Usuario***************************************************
    public boolean registrarPersona(String cedula, String tipoDoc,
            String nombreUser, String cel, String direc, String sexo, String fecha, String correo) {
        Persona persona = new Persona(cedula, tipoDoc, nombreUser, cel, direc, sexo, fecha, correo);
        if (UsuarioDAO.existeRegistro(persona.getCedula())) {
            return false;
        }
        return UsuarioDAO.agregarRegistro(persona);
    }

    public ArrayList<String> cargarPersonas() {
        return UsuarioDAO.cargarPersonas();
    }

    public ArrayList<String> cargarUsuarios() {
        return UsuarioDAO.cargarUsuarios();
    }

    public boolean registrarUsuario(String cedula, String clave, int idRol) {
        if (UsuarioDAO.verificarUsuario(cedula)){
            return false;
        }
            return UsuarioDAO.asignarUsuario(cedula, clave, idRol);
        }

//    public ArrayList<String> registrarUsuario() {
//        ArrayList<Persona> usuarios = new ArrayList<>();
//        return UsuarioDAO.registrarUsuario(usuarios);
//    }
//    public static void main(String[] args) {
//        UsuarioControler facade = new UsuarioControler();
//        ArrayList<Object[]> usuario = {"1094785321", "CC", "elkin peñaranda", "3124568093", "calle 7 # 4-6", "masculno", "1997-11-07", "elikinP@gmail.com"};;
//        facade.registrarUsuario(usuario);
//        
//        facade.registrarUsuario(usuario).forEach((id) -> {
//            System.out.println(id.substring(0));
//        });
//    }
    }
