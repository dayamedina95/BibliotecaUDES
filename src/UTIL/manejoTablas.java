
package UTIL;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class manejoTablas {
    public static DefaultTableModel llenarTabla(DefaultTableModel modelo, ArrayList datos) {
        if(datos != null) {
            for (int i = 0; i< datos.size(); i++){
                String split[] = datos.get(i).toString().split("/");
                modelo.addRow(split);
            }
        }
        return modelo;
    }
}
