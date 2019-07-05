
package MODELO;


public class Privilegio {
  
   private int idRol;
   private int idRequerimiento; 

    public Privilegio(int idRol, int idRequerimiento) {
        this.idRol = idRol;
        this.idRequerimiento = idRequerimiento;
    }
      
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(int idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }
       
}
