package com.stackroute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.stackroute"})
public class Myconfig {

    @Bean
    public InternalResourceViewResolver method() {
        InternalResourceViewResolver ir = new InternalResourceViewResolver();
        ir.setPrefix("/WEB-INF/");
        ir.setSuffix(".jsp");
        return ir;
    }
}
