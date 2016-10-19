package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.service.security.RestAuthenticationFailureHandler;
import com.service.security.RestAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private RestAuthenticationFailureHandler authenticationFailureHandler;
	@Autowired
	private RestAuthenticationSuccessHandler successHandler;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();// csrf:Cross-site request forgery跨站请求伪造
		// http.sessionManagement().maximumSessions(1); 最多在同一个地方登陆？

		
		http.formLogin() // 登陆表单
				.failureHandler(authenticationFailureHandler) // failure handler
				.successHandler(successHandler) // success handler
				.loginProcessingUrl("/login")// default is /login with an HTTP
												// post
				.permitAll(); // premit all authority
		http.authorizeRequests().antMatchers("/user/*").hasAnyAuthority("USER");

		http.authorizeRequests().antMatchers("/drug/*").hasAnyAuthority("USER");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
		// auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
	}
}
