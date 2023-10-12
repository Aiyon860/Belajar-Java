package Exception;

import RecordClass.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Daniel", "d4pp3r");

        /* not using this code 
        ValidationUtil.validate(loginRequest); */

        // use this "try and catch" code instead
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data is valid");
        } catch (ValidationException exception) {
            System.out.println("Data is not valid: " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Data is null: " + exception.getMessage());
        } finally {
            System.out.println("Still executed, error or not");
        }

        /*
         * if the exception handling is same, we can merge the code like this instead.
         * can be more than 2 exception handling.
         * 
         * catch (ValidationException | NullPointerException exception) {
         *   System.out.println("Data is not valid: " + exception.getMessage());
         */

         // ------------------------------------------------------------------------------ //

         // Runtime Exception
         LoginRequest loginRequest2 = new LoginRequest("Tirza", "Ayu");
         ValidationUtil.validateRuntime(loginRequest2);
         System.out.println("Success Runtime");

         /* 
          * error will still occur when using runtime exception, for instance:
          * Exception in thread "main" Exception.BlankException: Password tidak boleh kosong
          * at Exception.ValidationUtil.validateRuntime(ValidationUtil.java:28)
          * at Exception.ValidationApp.main(ValidationApp.java:36)
          */
    }
}
