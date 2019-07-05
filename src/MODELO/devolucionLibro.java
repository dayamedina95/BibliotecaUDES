package MODELO;

public class devolucionLibro {

    private int codigo;
    private int codigoPrestamo; //idPrestamo BD
    private String fechaDevolucion;
    private int cantidad;

    public devolucionLibro(int codigo, int codigoPrestamo, String fechaDevolucion, int cantidad) {
        this.codigo = codigo;
        this.codigoPrestamo = codigoPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.cantidad = cantidad;
    }

    public devolucionLibro() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(int codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
