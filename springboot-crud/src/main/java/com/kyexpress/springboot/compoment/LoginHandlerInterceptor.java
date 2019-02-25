package com.kyexpress.springboot.compoment;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：mmzs
 * @date ：Created in 2019/2/16 0016 17:48
 * @description：登录拦截器
 * @modified By：
 * @version: 1.0.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object loginUser = httpServletRequest.getSession().getAttribute("loginUser");
        if (loginUser == null) {
            /*httpServletRequest.setAttribute("msg", "请先登录");
            httpServletRequest.getRequestDispatcher("/login.html").forward(httpServletRequest, httpServletResponse);*/
            httpServletResponse.sendRedirect("/login.html");
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
