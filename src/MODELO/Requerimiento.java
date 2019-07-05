
package MODELO;

public class Requerimiento {
   private int idRequerimiento;
   private String descripcion; 
   private int idModulo;

    public Requerimiento(int idRequerimiento, String descripcion, int idModulo) {
        this.idRequerimiento = idRequerimiento;
        this.descripcion = descripcion;
        this.idModulo = idModulo;
    }

    public int getIdRequerimiento() {
    return idRequerimiento;
    }

    public void setIdRequerimiento(int idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }
   
}
