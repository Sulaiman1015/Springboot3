package com.sm.springbootsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class MySecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((authorize) -> {
            authorize.requestMatchers("/").permitAll()
                     .anyRequest().authenticated();
        });
        http.formLogin(login -> login
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/success",true)
        );
        http.logout(out -> out.logoutSuccessUrl("/index"));
        return http.build();
    }

    @Bean
    UserDetailsService userDetailsService(PasswordEncoder pe){
        UserDetails tim = User.withUsername("Tim").password(pe.encode("123456")).roles("Hr", "employee").authorities("rd").build();
        UserDetails tom = User.withUsername("Tom").password(pe.encode("123456")).roles("Admin", "employee").authorities("rd", "wr").build();
        UserDetails tan = User.withUsername("Tan").password(pe.encode("123456")).roles("Manager", "employee").authorities("rd").build();

        return new InMemoryUserDetailsManager(tim,tom,tan);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
