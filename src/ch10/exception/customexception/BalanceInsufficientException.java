package ch10.exception.customexception;

public class BalanceInsufficientException extends Exception{

    BalanceInsufficientException(){}
    BalanceInsufficientException(String message){
        super(message);
    }
    
}
