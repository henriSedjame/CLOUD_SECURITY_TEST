package org.cloud.securityresourceserver;

public class Account {

  private int accountNumber;
  private String accountType;

  public Account(int accountNumber, String accountType) {
    this.accountNumber = accountNumber;
    this.accountType = accountType;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }
}
