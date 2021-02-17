package com.bjpowernode.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("----------进入过滤器2------------");
        chain.doFilter(request, response);
    }
}
