package CONTROLADOR;

import DAO.RolDAO;
import DAO.UsuarioDAO;
import java.util.ArrayList;

public class UsuarioControler {
    
    public boolean login (String cedula,String clave,String rol){
        return UsuarioDAO.login(cedula, clave, rol);
    }
    
    public static ArrayList<String> listarRoles() {
        return RolDAO.cargarRoles();
    }
    
    public static ArrayList<String> listarPrivilegios(String rol) {
        return UsuarioDAO.consultarPrivilegios(rol);
    }
}
