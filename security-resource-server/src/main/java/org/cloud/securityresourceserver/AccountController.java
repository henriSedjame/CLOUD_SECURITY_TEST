package org.cloud.securityresourceserver;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@EnableResourceServer
public class AccountController {

  Map<Integer, Account> accountMap = new HashMap<>();

  @GetMapping("/accounts")
  public Collection<Account> getAccounts(){
    if (ObjectUtils.isEmpty(accountMap)){
      accountMap.put(1, new Account(1, "custom"));
      accountMap.put(2, new Account(2, "expert"));
    }
    return accountMap.values();
  }
}
