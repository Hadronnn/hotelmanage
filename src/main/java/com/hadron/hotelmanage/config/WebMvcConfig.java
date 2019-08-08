package com.hadron.hotelmanage.config;

import com.hadron.hotelmanage.interceptors.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Hadron
 * @date 2019/8/8 10:36
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/dologin","/login","/**/images/**","/**/fonts/**","/**/*.css","/**/*.js");
    }
}
