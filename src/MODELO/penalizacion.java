package MODELO;

public class penalizacion {

    private int codigo;
    private int diasPenalizacion;
    private double precio;

    public penalizacion(int codigo, int diasPenalizacion, double precio) {
        this.codigo = codigo;
        this.diasPenalizacion = diasPenalizacion;
        this.precio = precio;
    }

    public penalizacion() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDiasPenalizacion() {
        return diasPenalizacion;
    }

    public void setDiasPenalizacion(int diasPenalizacion) {
        this.diasPenalizacion = diasPenalizacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
