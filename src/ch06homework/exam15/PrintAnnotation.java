package ch06homework.exam15;

//@Target({ElementType.METHOD})
//@Retention(RetectionPolicy.RUNTIME)

public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
	

}
