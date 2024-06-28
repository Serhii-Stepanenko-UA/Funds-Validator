package app;

// Кастомний виняток
public class FundsException extends RuntimeException {

    public FundsException(String str) {
        super(str);
    }
}