package MODELO;

public class inventario {

    private int codigo;
    private String fecha;
    private int cantidadFisica;
    private int librosPrestados;
    private int librosPerdidos;
    private int totalLibros;

    public inventario(int codigo, String fecha, int cantidadFisica, int librosPrestados, int librosPerdidos, int totalLibros) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cantidadFisica = cantidadFisica;
        this.librosPrestados = librosPrestados;
        this.librosPerdidos = librosPerdidos;
        this.totalLibros = totalLibros;
    }

    public inventario() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadFisica() {
        return cantidadFisica;
    }

    public void setCantidadFisica(int cantidadFisica) {
        this.cantidadFisica = cantidadFisica;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public int getLibrosPerdidos() {
        return librosPerdidos;
    }

    public void setLibrosPerdidos(int librosPerdidos) {
        this.librosPerdidos = librosPerdidos;
    }

    public int getTotalLibros() {
        return totalLibros;
    }

    public void setTotalLibros(int totalLibros) {
        this.totalLibros = totalLibros;
    }

}
