package CONTROLADOR;

import DAO.RolDAO;
import DAO.UsuarioDAO;
import MODELO.Persona;
import java.util.ArrayList;

public class UsuarioControler {

    public UsuarioDAO usuarioDao = new UsuarioDAO();

    //inicio de sesion ***********************************************************
    public boolean login(String cedula, String clave, String rol) {
        return usuarioDao.login(cedula, clave, rol);
    }

    public ArrayList<String> listarRoles() {
        return RolDAO.cargarRoles();
    }

    public ArrayList<String> listarPrivilegios(String rol) {
        return usuarioDao.consultarPrivilegios(rol);
    }

    //Registro *****************************************************************
    public boolean registrarPersona(String cedula, String tipoDoc,
            String nombreUser, String cel, String direc, String sexo, String fecha, String correo) {
        Persona persona = new Persona(cedula, tipoDoc, nombreUser, cel, direc, sexo, fecha, correo);
        if (usuarioDao.existeRegistro(persona.getCedula())) {
            return false;
        }
        return usuarioDao.registrarPersona(persona);
    }

    public boolean registrarUsuario(String cedula, String clave, int idRol) {
        if (usuarioDao.verificarUsuario(cedula)) {
            return false;
        }
        return usuarioDao.registrarUsuario(cedula, clave, idRol);
    }

    //Actualizaciones**********************************************************
    public boolean actualizarPersona(String cedula, String tipoDoc,
            String nombreUser, String cel, String direc, String sexo, String fecha, String correo) {
        Persona persona = new Persona(cedula, tipoDoc, nombreUser, cel, direc, sexo, fecha, correo);
        return usuarioDao.actualizarPersona(persona);
    }

    //Listar********************************************************************
    public ArrayList<String> cargarUsuarios() {
        return usuarioDao.cargarUsuarios();
    }

//// este el controlador, segun yo
    public ArrayList<Persona> listarPersonas() {
        ArrayList<Persona> persona = usuarioDao.listarPersonas();
       System.out.println(persona);
        return persona;
         
    }
    
    
//    public ArrayList<String> cargarPersonas() {
//        return usuarioDao.cargarPersonas();
//    }
//
//    public ArrayList<String> filtroPersona(Persona persona) {
//        return usuarioDao.filtroPersona(persona);
//    }

//    public ArrayList<String> cargarPersonas(){
//        ArrayList<Persona> persona = new ArrayList<>();
//        return usuarioDao.cargarPersonas(persona);
//    }
//    public ArrayList<String> cargarPersonas() {
//        return UsuarioDAO.cargarPersonas();
//    }
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
