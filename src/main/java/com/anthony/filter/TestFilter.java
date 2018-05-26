package com.anthony.filter;

import com.anthony.demo.TestComponent;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "testFilter", urlPatterns = "/*")
public class TestFilter implements Filter {
    @Resource
    private TestComponent testComponent;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        testComponent.println();
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
