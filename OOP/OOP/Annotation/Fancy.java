package Annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// Making Annotation
@Target({ElementType.TYPE, ElementType.METHOD}) // criteria? just look at the definition
@Retention(RetentionPolicy.RUNTIME) // criteria? just look at the definition
public @interface Fancy {
    
    String name();

    String[] tags() default {}; // if there is default value, if don't have to put the value in it.
}
