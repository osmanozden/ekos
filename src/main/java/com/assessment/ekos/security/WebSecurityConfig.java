package com.assessment.ekos.security;import jakarta.servlet.http.HttpServletResponse;import lombok.NoArgsConstructor;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;import org.springframework.security.authentication.AuthenticationManager;import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;import org.springframework.security.config.annotation.web.builders.HttpSecurity;import org.springframework.security.config.annotation.web.builders.WebSecurity;import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;import org.springframework.security.config.http.SessionCreationPolicy;import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;import org.springframework.security.crypto.password.PasswordEncoder;@NoArgsConstructor@Configuration@EnableWebSecurity@EnableGlobalMethodSecurity(prePostEnabled = true)public class WebSecurityConfig extends WebSecurityConfigurerAdapter {    @Bean    public PasswordEncoder passwordEncoder() {        return new BCryptPasswordEncoder();    }    @Override    protected void configure(HttpSecurity http) throws Exception {        http.cors()                .and()                .authorizeRequests()                .antMatchers(                        "/api/auth/**",                        "/api/test/**",                        "/auth/**/*",                        "/auth/login",                        "/send",                        "/confirm-account",                        "/test/**")                .permitAll()                .anyRequest()                .authenticated()                .and()                .exceptionHandling()                .authenticationEntryPoint(                        (req, rsp, e) -> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED))                .and()                .sessionManagement()                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)                .and()                .csrf()                .disable();    }    @Override    public void configure(WebSecurity web) {        web.ignoring()                .antMatchers(                        "/v2/api-docs",                        "/configuration/ui",                        "/swagger-resources/**",                        "/configuration/security",                        "/swagger-ui.html",                        "/webjars/**",                        "/h2-console");    }    @Bean    @Override    public AuthenticationManager authenticationManagerBean() throws Exception {        return super.authenticationManagerBean();    }}