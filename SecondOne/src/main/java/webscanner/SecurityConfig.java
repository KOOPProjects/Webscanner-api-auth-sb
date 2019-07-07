/*
 * package com.example.demo;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager;
 */
/*
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * 
 * 
 * @Bean public UserDetailsService userDetailsService() { UserDetails guest =
 * User.withDefaultPasswordEncoder() .username("guest") .password("questPass")
 * .roles("GUEST") .build();
 * 
 * UserDetails user = User.withDefaultPasswordEncoder() .username("user")
 * .password("userPass") .roles("USER") .build();
 * 
 * UserDetails admin = User.withDefaultPasswordEncoder() .username("admin")
 * .password("adminPass") .roles("ADMIN") .build();
 * 
 * return new InMemoryUserDetailsManager(guest, user, admin); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception{
 * http.httpBasic().and().authorizeRequests() .antMatchers(HttpMethod.GET,
 * "/api/employees").permitAll() .antMatchers(HttpMethod.GET,
 * "/api/employees/all").hasRole("ADMIN") .antMatchers(HttpMethod.POST,
 * "/api/employees").hasAnyRole("USER", "ADMIN") .antMatchers(HttpMethod.DELETE,
 * "/api/employees").hasRole("ADMIN") .and() .formLogin().permitAll() .and()
 * .logout().permitAll() .and() .csrf().disable();
 * 
 * } }
 */