package com.erce.paramtype.wrongparamtype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
public class WrongparamtypeApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(WrongparamtypeApplication.class, args);
    }
    
    
    @EnableWebMvc
    public class WebMvcConfigurerAdapterCustom implements WebMvcConfigurer {
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");
            
            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
    }
}
