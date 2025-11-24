package exception;

public class DataStructureEmptyException extends Exception
{
    //constructors
    public DataStructureEmptyException() {
        super();
    }
    
    public DataStructureEmptyException(String message) {
        super(message);
    }
}