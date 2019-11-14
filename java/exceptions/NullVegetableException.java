package exceptions;

public class NullVegetableException extends Exception {
    public NullVegetableException(){
    }

    public NullVegetableException(String message){
        super(message);
    }

    public NullVegetableException(String message, Throwable exception){
        super(message, exception);
    }

    public NullVegetableException(Throwable exception){
        super(exception);
    }
}

