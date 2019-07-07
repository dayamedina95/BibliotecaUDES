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
    public ArrayList<String> registrarUsuarios(ArrayList<Object[]> persona) {
        ArrayList<Persona> usuario = new ArrayList<>();
        for (int i = 0; i < persona.size(); i++) {
            Persona prueba = new Persona(persona.get(i)[0].toString(), persona.get(i)[1].toString(), persona.get(i)[2].toString(), persona.get(i)[3].toString(), persona.get(i)[4].toString(), persona.get(i)[5].toString(), persona.get(i)[6].toString(), persona.get(i)[7].toString());
            usuario.add(prueba);
            System.out.println(i);
        }
        return UsuarioDAO.registrarUsuario(usuario);
    }

    public boolean asignarUsuario(String cedula, String clave, int idRol) {
        return UsuarioDAO.asignarUsuario(cedula, clave, idRol);
    }

    public ArrayList<String> cargarPersonas() {
        return UsuarioDAO.cargarPersonas();
    }
    
     public ArrayList<String> cargarUsuarios() {
        return UsuarioDAO.cargarUsuarios();
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
