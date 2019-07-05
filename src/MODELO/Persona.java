package MODELO;

import java.util.ArrayList;

public class Persona {

    private int cedula;
    private String tipoDocumento;
    private String nombre;
    private String fechaNacimiento;
    private String sexo;
    private String direccion;
    private String teleono;
    private String email;
    private ArrayList<String> privilegios;

    public Persona(int cedula, String tipoDocumento, String nombre, String fechaNacimiento, String sexo, String direccion, String teleono, String email, ArrayList<String> privilegios) {
        this.cedula = cedula;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.teleono = teleono;
        this.email = email;
        this.privilegios = privilegios;
    }
    
    public Persona() {
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTeleono() {
        return teleono;
    }

    public void setTeleono(String teleono) {
        this.teleono = teleono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(ArrayList<String> privilegios) {
        this.privilegios = privilegios;
    }
    
}
