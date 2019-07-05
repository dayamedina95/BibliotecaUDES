package MODELO;

public class reservaLibro {

    private int codigo;
    private int codigoLibro; //idLibro BD
    private String fechaReserva;
    private int diasVigentes;

    public reservaLibro(int codigo, int codigoLibro, String fechaReserva, int diasVigentes) {
        this.codigo = codigo;
        this.codigoLibro = codigoLibro;
        this.fechaReserva = fechaReserva;
        this.diasVigentes = diasVigentes;
    }

    public reservaLibro() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getDiasVigentes() {
        return diasVigentes;
    }

    public void setDiasVigentes(int diasVigentes) {
        this.diasVigentes = diasVigentes;
    }

}
