package com.ximo.seckillinaction.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Ximo
 * @date 2018/10/16 23:03
 */
@Documented
@Constraint(validatedBy = {IsMobileValidator.class})
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface IsMobile {

    boolean require() default true;

    String message() default "{请填写正确的手机号}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };


}
