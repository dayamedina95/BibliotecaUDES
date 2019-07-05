package CONTROLADOR;

import MODELO.Usuario;
import SERVICE.RolDAO;
import SERVICE.UsuarioDAO;
import SERVICE.conexionBD;
import java.util.ArrayList;

public class iniciarSesion {
    
    public static String login (String codigo,String clave,String rol){
        Usuario usuario = new Usuario(codigo,clave,rol);
        return UsuarioDAO.login(usuario);
    }
    
    public static ArrayList<String> listarRoles() {
        return RolDAO.cargarRoles();
    }
    
    public static ArrayList<String> listarPrivilegios(String rol) {
        return UsuarioDAO.consultarPrivilegios(rol);
    }
}
