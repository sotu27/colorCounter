package org.springTest.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
//@EnableWebMvc // 『注意：Spring Bootの場合は、@EnableWebMvcはつけちゃダメ！！』らしいです
public class WebMvcConfig extends WebMvcConfigurerAdapter {
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
configurer.enable();
}

@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/js/**")
	.addResourceLocations("classpath:/static/js/")
	.addResourceLocations("classpath:/resources/static/js")
	.addResourceLocations("classpath:/webapp/resources/static/")
	.addResourceLocations("src/main/resources/static/")
	.addResourceLocations("WebContent/static/js/");
}


}
