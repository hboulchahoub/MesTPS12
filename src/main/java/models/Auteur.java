package models;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PACKAGE,ElementType.TYPE})
public @interface Auteur {
    String name();
    int exp() default 2;
    int age();
}
