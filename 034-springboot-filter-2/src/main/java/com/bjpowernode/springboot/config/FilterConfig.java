package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean myFilterRegistrationBean() {
        //注册过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());

        //添加过滤路径
        filterRegistrationBean.addUrlPatterns("/user/*");

        return filterRegistrationBean;
    }
}
