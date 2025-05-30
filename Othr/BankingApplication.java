//Develop a program for banking application with exception handling. Handle the exceptions in following cases: 
//-> Account balance <1000 
//-> Withdrawal amount is greater than balance amount 
//-> Transaction count exceeds 3 
//-> One day transaction exceeds 1 lakh. 

import java.util.*;
class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException(String message) {
    super(message);
  }
}
class ExceedTransactionLimitException extends Exception {
  public ExceedTransactionLimitException(String message) {
    super(message);
  }
}
class ExcessiveTransactionAmountException extends Exception {
  public ExcessiveTransactionAmmountException(String message)
    super(message);
  }
}

class bankAccount {
  private double balance;
  private int transactionCount;
  private double dailyTransactionAmount;
