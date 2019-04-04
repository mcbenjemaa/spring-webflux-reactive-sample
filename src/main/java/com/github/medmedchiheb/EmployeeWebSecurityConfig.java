package com.github.medmedchiheb;

import org.springframework.context.annotation.Bean;

//@EnableWebFluxSecurity
public class EmployeeWebSecurityConfig {
 
    // ...
 
    /*@Bean
    public SecurityWebFilterChain springSecurityFilterChain(
      ServerHttpSecurity http) {
        http.csrf().disable()
          .authorizeExchange()
          .pathMatchers(HttpMethod.POST, "/employees/update").hasRole("ADMIN")
          .pathMatchers("/**").permitAll()
          .and()
          .httpBasic();
        return http.build();
    }*/
}