package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.gateway"}, exclude = ReactiveUserDetailsServiceAutoConfiguration.class)
public class Application {

    public static void main(final String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration apiCorsConfiguration = new CorsConfiguration();
//        apiCorsConfiguration.setAllowCredentials(true);
//        apiCorsConfiguration.setAllowedOriginPatterns(Collections.singletonList("*"));
//        apiCorsConfiguration.setAllowedHeaders(Collections.singletonList("*"));
//        apiCorsConfiguration.setAllowedMethods(Collections.singletonList("*"));
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", apiCorsConfiguration);
//        return source;
//    }
}
