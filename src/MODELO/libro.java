package MODELO;

public class libro {

    private int codigo;
    private String titulo;
    private String fechaAdquisicion;
    private double precio;
    private int cantidad;
    private int codigoAutor; //idAutor BD
    private int codigoCategoria; //idAutor BD

    public libro(int codigo, String titulo, String fechaAdquisicion, double precio, int cantidad, int codigoAutor, int codigoCategoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigoAutor = codigoAutor;
        this.codigoCategoria = codigoCategoria;
    }

    public libro() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

}
