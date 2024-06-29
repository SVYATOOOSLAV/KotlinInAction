package annnotationExample.myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Retention(RetentionPolicy.CLASS) аннотация сохраняется в скомпилированный файл, но не доступна на этапе работы программы
// @Retention(RetentionPolicy.SOURCE) аннотация не сохраняется в скомпилированный файл и не доступна на этапе работы программы (маркер)
// @Retention(RetentionPolicy.RUNTIME) аннотация доступна во время работы программы

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {

}
