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
  
