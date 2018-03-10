package libreria;

import javax.swing.JOptionPane;

public class Biblioteca {
    
    public static int comprobacion(String mensaje) {
        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "¿Estas seguro?", JOptionPane.YES_NO_OPTION);
        return opcion;
    }
}
