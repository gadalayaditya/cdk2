package comtwo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD) // comtwo.MyAnnotation Can be applied only for methods
@Retention(value = RetentionPolicy.RUNTIME) // comtwo.MyAnnotation will be retained until runtime
public @interface MyAnnotation {

}
@Target(value ={ ElementType.METHOD, ElementType.FIELD}) // comtwo.MyAnnotation Can be applied only for methods
@Retention(value = RetentionPolicy.RUNTIME) // comtwo.MyAnnotation will be retained until runtime
 @interface MyAnnotation2 {

}
