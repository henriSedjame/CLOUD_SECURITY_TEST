package org.cloud.securityauthorizationserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class securityConfig extends GlobalAuthenticationConfigurerAdapter {

  @Override
  public void init(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
            .withUser("hsedjame").password("1234").roles("USER")
            .and()
            .withUser("lnClhoe").password("4659").roles("USER");

  }
}
