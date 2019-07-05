
package MODELO;

public class Modulo {
 
    private int idModulo;
    private String descripcion;

    public Modulo(int idModulo, String descripcion) {
        this.idModulo = idModulo;
        this.descripcion = descripcion;
    }
    
    public int getIdModulo() {
    return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
