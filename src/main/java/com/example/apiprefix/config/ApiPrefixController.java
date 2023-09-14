package com.example.apiprefix.config;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@RequestMapping("${api_prefix}")
public @interface ApiPrefixController {
    @AliasFor(annotation = Component.class)
    String value() default "";
}
