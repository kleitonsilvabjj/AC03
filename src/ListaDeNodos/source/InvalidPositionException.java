package ListaDeNodos.source;

public class InvalidPositionException extends RuntimeException{
    public InvalidPositionException (String err) {
        super(err);
    }
}
