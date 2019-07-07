package MODELO;

import java.util.ArrayList;

public class Usuario {

    private String codigoPersona;
    private String password;
    private String rol;
    private ArrayList<String> privilegios;

    public Usuario(String codigoPersona, String password, String rol, ArrayList<String> privilegios) {
        this.codigoPersona = codigoPersona;
        this.password = password;
        this.rol = rol;
        this.privilegios = privilegios;
    }

    public Usuario() {
    }

    public String getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ArrayList<String> getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(ArrayList<String> privilegios) {
        this.privilegios = privilegios;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigoPersona=" + codigoPersona + ", password=" + password + ", rol=" + rol + ", privilegios=" + privilegios + '}';
    }

}
