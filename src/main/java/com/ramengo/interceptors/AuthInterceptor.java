package com.ramengo.interceptors;

import com.ramengo.exceptions.UnauthorizedKeyException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Value("${x-api-key}")
    String apiKey;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        var authHeader = request.getHeader("x-api-key");

        if (isHeaderValueNull(authHeader) || doesHeaderValueDiffers(authHeader)) {
            throw new UnauthorizedKeyException();
        }

        return true;
    }

    private Boolean isHeaderValueNull(String value) {
        return value == null;
    }

    private Boolean doesHeaderValueDiffers(String value) {
        return !apiKey.equals(value);
    }
}
