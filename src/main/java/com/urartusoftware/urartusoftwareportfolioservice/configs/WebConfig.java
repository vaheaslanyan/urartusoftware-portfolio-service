package com.urartusoftware.urartusoftwareportfolioservice.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Value("${deployment.ip.ui.local")
    private String ipLocal;

    @Value("${deployment.ip.ui.deployed}")
    private String ipDeployed;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*").allowedOrigins(ipLocal, ipDeployed);
    }
}
