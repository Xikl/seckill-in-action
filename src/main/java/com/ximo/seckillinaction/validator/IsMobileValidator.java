package com.ximo.seckillinaction.validator;

import com.ximo.seckillinaction.util.ValidatorUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Ximo
 * @date 2018/10/16 23:02
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean required = false;

    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.require();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 参数校验
        return ValidatorUtil.isMobile(value, required);
    }

}
