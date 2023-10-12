package Exception;

import java.lang.reflect.Field;

import RecordClass.LoginRequest;
import Reflection.NotBlank;

public class ValidationUtil {
    // Making Exception
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleh kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh kosong");
        }
    }

    // Runtime Exception
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username tidak boleh kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password tidak boleh kosong");
        }
    }

    // Validation Reflection
    public static void validateReflection(Object object) { // choosing "object" class so we can validate all classes.
        Class<?> aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                // validate
                try {
                    String value = (String) field.get(object);
                    
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } 
                
                catch (IllegalAccessException exception) {
                    System.out.println("Cannot access the field " + field.getName());
                }
            }
        }
    }
}
