package edu.sabana.poob.sabanapayroll;

public class BankAccountException extends Exception
{

    public static final String DINERO_INSUFICIENTE ="tHE AMOUNT OF MONEY ISNT ENOUGH";

    public BankAccountException(String message) {
        super(message);
    }
}
