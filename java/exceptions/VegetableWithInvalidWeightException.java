package exceptions;


public class VegetableWithInvalidWeightException extends Exception {
    public VegetableWithInvalidWeightException(){
    }

    public VegetableWithInvalidWeightException(String message){
        super(message);
    }

    public VegetableWithInvalidWeightException(String message, Throwable exception){
        super(message, exception);
    }

    public VegetableWithInvalidWeightException(Throwable exception){
        super(exception);
    }

}

