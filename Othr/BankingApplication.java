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
  private static final int MAX_TRANSACTIONS = 3;
  private static final double MAX_DAILY_AMOUNT = 100000;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
    this.transactionCount = 0;
    this.dailyTransactionAmount = 0;
  }
  public void withdraw(double amount) throwsInsufficientBalanceException,ExceedTransactionLimitException,ExcessiveTransactionAmountException {
    if (transactionCount >= MAX_TRANSACTIONS) {
        throw new ExceedTransactionLimitException("Transaction count exceeded the daily limit.");
    }

    if (dailyTransactionAmount + amount > MAX_DAILY_AMOUNT) {
      throw new ExceesiveTransactionAmmountException("One day transaction exceeds 1 lakh.");
    }
    if (balance - amount < 1000) {
      throw new InsufficientBalanceException("Insufficient balance: Minimum balance must be 1000.");
    }  
    if (amount > balance) {throw new InsufficientBalanceException("Withdrawal amount is greater than balance amount.");
    }

    balance -= amount;
    dailyTransactionAmount += amount;
    transactionCount++;
    System.out.println("Withdrawl successful. New balance: " + balance);
  }
}
public class BankingApplication {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      BankAccount account = new BankAccount(5000);

      try{
        System.out.println("Enter withdrawl amount:  ");
         double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientBalanceException | ExceedTransactionLimitException | ExcessiveTransactionAmountException e) {
        System.out.println("Transaction failed: "+e.getMessage());
      }
      

        scanner.close();
    }
}
