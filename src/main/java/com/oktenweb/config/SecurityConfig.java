package com.oktenweb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//https://github.com/sergeylogos/TemplateWebProjectMySQLSpringJSP.git
@Configuration
@EnableWebSecurity
@ComponentScan("com.oktenweb.*")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("asd").password("asd").roles("ADMIN");
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        CharacterEncodingFilter filter = new CharacterEncodingFilter();
//        filter.setEncoding("UTF-8");
//        filter.setForceEncoding(true);
//        http.addFilterBefore(filter, CsrfFilter.class);
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/admin/**").access("hasRole('ADMIN')")
//                .and()
//                .formLogin()
//                /*without this is use of spring loginpage*/
//                .loginPage("/login")
//                // .loginProcessingUrl("/logMe")
//                //.successForwardUrl("/asd")
//                .passwordParameter("password")
//                .usernameParameter("username")
//                /*---------------------------------------*/
//                .and()
//                .csrf();
//        //.and()
//        //.exceptionHandling().accessDeniedPage("/accessDeniedPage");
////         .formLogin()
////                 .loginPage("/toLoginPage")
////                 .loginProcessingUrl("/logMe")
////                 .successForwardUrl("/asd")
////                 .passwordParameter("password")
////                 .usernameParameter("username")
//
//    }
}
