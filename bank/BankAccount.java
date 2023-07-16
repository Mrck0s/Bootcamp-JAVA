package bank;

import java.util.Random;
import java.util.Objects;

public class BankAccount {
  private String numAccount;
  private Double balanceCc;
  private Double balanceCa;
  private static Integer numAccounts = 0;
  private static Double totalMoney;

  public BankAccount() {
    numAccount = getNumAccount();
    balanceCc = 0.0;
    balanceCa = 0.0;
    numAccounts++;
    totalMoney = 0.0;
  }

  private String getNumAccount() {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      numAccount += random.nextInt(10);
    }
    return numAccount;
  }

  private Double deposit(Double amount, String account) {
    if (Objects.equals(account, "cc")) {
      balanceCc += amount;
      totalMoney += amount;
      System.out.println("Depositaste a tu cuenta corriente: $" + amount);
      return balanceCc;
    } else if (Objects.equals(account, "cc")) {
      balanceCa += amount;
      totalMoney += amount;
      System.out.println("Depositaste a tu cuenta ahorros: $" + amount);
      return balanceCa;
    } else {
      return 0.0;
    }
  }

  private Double getBalanceCc() {
    return balanceCc;
  }

  private Double getBalanceCa() {
    return balanceCa;
  }

  private Object checkOut(Double amount, String account) {
    if (Objects.equals(account, "cc") && amount <= balanceCc) {
      balanceCc -= amount;
      totalMoney -= amount;
      System.out.println("Retiraste de tu cuenta corriente: $" + amount);
      return balanceCc;
    } else if (Objects.equals(account, "ca") && amount <= balanceCa) {
      balanceCa -= amount;
      totalMoney -= amount;
      System.out.println("Retiraste de tu cuenta ahorros: $" + amount);
      return balanceCa;
    }
    return "Dinero insuficiente!";
  }

  private Double getBalances() {
    System.out.println("Cuenta corriente: " + balanceCc);
    System.out.println("Cuenta ahorros: " + balanceCa);
    return totalMoney;
  }

}
