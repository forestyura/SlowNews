package com.forest.slownews.controller.Filter;

import com.forest.slownews.service.WeatherProvider;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebFilter("/*")
public class FilterForRequest implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        System.out.println(new SimpleDateFormat("dd.MM.yyyy hh:mm").format(new Date()) + " " +
                "New Request from: " + req.getRemoteAddr() +
                ", request to: " + req.getRequestURI() +
                ", with method: " + req.getMethod());
        req.setAttribute("Weather", new WeatherProvider().getWeather());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
