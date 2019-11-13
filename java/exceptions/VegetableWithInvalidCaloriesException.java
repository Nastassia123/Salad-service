package exceptions;

public class VegetableWithInvalidCaloriesException extends Exception {
    public VegetableWithInvalidCaloriesException(){
    }

    public VegetableWithInvalidCaloriesException(String message){
        super(message);
    }

    public VegetableWithInvalidCaloriesException(String message, Throwable exception){
        super(message, exception);
    }

    public VegetableWithInvalidCaloriesException(Throwable exception){
        super(exception);
    }
}


