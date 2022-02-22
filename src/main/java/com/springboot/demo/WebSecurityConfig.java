package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.security.reactive.EndpointRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestMatcher;

@EnableWebSecurity
@Configuration(proxyBeanMethods = false)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	public WebSecurityConfig() {super();}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
	}
	
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    	http.requestMatcher(EndpointRequest.toAnyEndpoint())
//                .authorizeRequests((requests) -> requests.anyRequest().permitAll());
//        return http.build();
//    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
//		http.antMatcher("/courses").authorizeRequests().anyRequest().permitAll();
	//	http.antMatcher("/blogs").authorizeRequests().anyRequest().permitAll();
        http.csrf().disable();
	}
}
