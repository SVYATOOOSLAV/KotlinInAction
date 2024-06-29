@Retention(RetentionPolicy.CLASS) аннотация сохраняется в скомпилированный файл, но не доступна на этапе работы программы

@Retention(RetentionPolicy.SOURCE) аннотация не сохраняется в скомпилированный файл и не доступна на этапе работы программы (маркер)

@Retention(RetentionPolicy.RUNTIME) аннотация доступна во время работы программы

@Target - на что мы можем навешать аннотацию
@Target(ElementType.TYPE) - для компонентов, создающих свой тип данных (class, abstract class, interface, enum)
@Target(ElementType.ANNOTATION_TYPE)