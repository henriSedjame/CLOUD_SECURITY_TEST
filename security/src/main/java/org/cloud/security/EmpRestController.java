package org.cloud.security;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@EnableOAuth2Sso
public class EmpRestController {

  Map<Integer, Employee> employeeMap = new HashMap<>();

  @GetMapping("/employees")
  public Collection<Employee> getEmployees(){
    if (ObjectUtils.isEmpty(employeeMap)){
      employeeMap.put(1, new Employee(1, "henri", 25));
      employeeMap.put(2, new Employee(2, "henri", 26));
      employeeMap.put(3, new Employee(3, "henri", 27));
    }
    return employeeMap.values();
  }
}
