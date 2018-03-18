package libreria;

public class ExcepcionTextoBlanco extends Exception{

    public ExcepcionTextoBlanco(){
        super("No se han cubierto todos los cuedros de texto.");
    }
    public ExcepcionTextoBlanco(String message) {
        super(message);
    }
    
}
