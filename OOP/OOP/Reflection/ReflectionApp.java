package Reflection;

import Exception.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Aiyon");
        request.setPassword("awawa");
        request.setName("Daniel");

        ValidationUtil.validateReflection(request);
    }
}
