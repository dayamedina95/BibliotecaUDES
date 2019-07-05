package MODELO;

import java.util.ArrayList;

public class Usuario {

    private String codigoPersona;
    private String password;
    private String rol;
    private ArrayList<String> privilegios;

    public Usuario() {
    }

    public Usuario(String codigoDocente, String password, String rol) {
        this.codigoPersona = codigoDocente;
        this.password = password;
        this.rol = rol;
    }

    public String getCodigoDocente() {
        return codigoPersona;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoPersona = codigoDocente;
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

}
