package org.bukkit.support.test;

import org.bukkit.support.provider.ClassReaderArgumentProvider;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(ClassReaderArgumentProvider.class)
@ParameterizedTest
public @interface ClassReaderTest {

    Class<?>[] excludedClasses() default {};

    String[] excludedPackages() default {};
}
