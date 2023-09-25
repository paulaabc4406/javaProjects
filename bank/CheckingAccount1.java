public class CheckingAccount1{ 

  private String name;
  private int balance;
  private String id;

  public CheckingAccount1(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;

  }

  public int getBalance() {
    return balance;

  }

  public void setBalance(int newBalance) {
    balance = newBalance;

  }
  
}