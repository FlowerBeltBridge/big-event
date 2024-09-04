package org.example.anno;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.example.validation.StateValidation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD})
//标识State注解将来会在哪个阶段被保留，保留在运行时阶段
@Retention(RetentionPolicy.RUNTIME)
//指定谁给State这个注解提供校验规则,指定校验规则的类
@Constraint(
        validatedBy = {StateValidation.class}
)

public @interface State {
    //提供校验失败后的提示信息
    String message() default "State只能是已发布或者草稿";

    //分组
    Class<?>[] groups() default {};

    //负载 @State的附加信息
    Class<? extends Payload>[] payload() default {};
}
