package com.ximo.seckillinaction.config;

import com.ximo.seckillinaction.domain.SeckillUser;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @author Ximo
 * @date 2018/10/16 23:49
 */
@Component
public class UserArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        // 如果参数是需要的参数类型那我们就加入
        Class<?> parameterType = methodParameter.getParameterType();
        return parameterType == SeckillUser.class;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        // nativeWebRequest
        // 拿到request 和 response
        // 从cookie中取的sessionId
        // 然后再从数据库中进行查询
        return null;
    }
}
