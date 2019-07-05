package MODELO;

public class prestamo {

    private int codigo;
    private String titulo; //idLibro BD
    private int cantidad;
    private String fechaPrestamo;
    private int cantDiasPrestamo;

    public prestamo(int codigo, int cantidad, String fechaPrestamo, int cantDiasPrestamo) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.fechaPrestamo = fechaPrestamo;
        this.cantDiasPrestamo = cantDiasPrestamo;
    }
    
    public prestamo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getCantDiasPrestamo() {
        return cantDiasPrestamo;
    }

    public void setCantDiasPrestamo(int cantDiasPrestamo) {
        this.cantDiasPrestamo = cantDiasPrestamo;
    }


}
