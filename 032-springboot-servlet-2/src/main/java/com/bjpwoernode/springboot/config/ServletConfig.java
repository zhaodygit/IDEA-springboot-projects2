package com.bjpwoernode.springboot.config;

import com.bjpwoernode.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //此类定义配置类（相对与xml配置类）
public class ServletConfig {

    @Bean
    public ServletRegistrationBean myServletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet");

        return servletRegistrationBean;
    }
}
