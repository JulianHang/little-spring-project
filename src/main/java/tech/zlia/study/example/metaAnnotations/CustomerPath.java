package tech.zlia.study.example.metaAnnotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping
public @interface CustomerPath {

    @AliasFor("urls")
    String[] value() default {};

    @AliasFor("value")
    String[] urls() default {};
}
