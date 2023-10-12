package Exception;

public class ValidationException extends Throwable {
    /* private String message;

    public ValidationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    } 

    don't have to make this thing above because there is a constructor 
    with parameter "message" in class "Throwable" --> parent class
    */

    // make this code instead
    public ValidationException(String message) {
        super(message);
    }
    


}
