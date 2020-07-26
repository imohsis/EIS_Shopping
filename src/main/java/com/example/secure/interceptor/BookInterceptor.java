package com.example.secure.interceptor;

import com.example.secure.controller.BookController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class BookInterceptor implements HandlerInterceptor {
    private static Logger log = LoggerFactory.getLogger(BookInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("BookInterceptor - pre");
        boolean flag = true;
        String method = request.getMethod();
        if (method.equalsIgnoreCase("post") || method.equalsIgnoreCase("put")){
            String contentType = request.getContentType();
            if (contentType != null && !contentType.equalsIgnoreCase("application/json")) {
             flag = false;
            }
        }
        if(!flag){
//            redirect anywhere of your choice
            response.sendRedirect("");
        }



        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("BookInterceptor - post");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("BookInterceptor - after");

    }
}
