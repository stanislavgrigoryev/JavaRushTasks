package com.javarush.task.jdk13.task38.task3802;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Ticket {
    enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }

    Priority priority() default Priority.MEDIUM;

    String[] tags() default {};

    String createdBy() default "Amigo";

}
