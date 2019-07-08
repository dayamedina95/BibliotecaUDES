package MODELO;

import java.util.ArrayList;

public class Persona {

    private String cedula;
    private String tipoDocumento;
    private String nombre;
    private String telefono;
    private String direccion;
    private String sexo;
    private String fechaNacimiento;
    private String email;
//    private ArrayList<String> privilegios;

    public Persona(String cedula, String tipoDocumento, String nombre, String telefono, String direccion, String sexo, String fechaNacimiento, String email) {
        this.cedula = cedula;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + '}';
    }

}
