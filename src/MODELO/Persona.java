package MODELO;

import java.util.ArrayList;

public class Persona {

    private String cedula;
    private String tipoDocumento;
    private String nombre;
    private String fechaNacimiento;
    private String sexo;
    private String direccion;
    private String telefono;
    private String email;
//    private ArrayList<String> privilegios;

    public Persona(String cedula, String tipoDocumento, String nombre, String fechaNacimiento, String sexo, String direccion, String telefono, String email) {
        this.cedula = cedula;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
//        this.privilegios = privilegios;
    }

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public ArrayList<String> getPrivilegios() {
//        return privilegios;
//    }
//
//    public void setPrivilegios(ArrayList<String> privilegios) {
//        this.privilegios = privilegios;
//    }

//    @Override
//    public String toString() {
//        return "Persona{" + "cedula=" + cedula + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + ", privilegios=" + privilegios + '}';
//    }

}
