public class Bank2{
  private CheckingAccount2 accountOne;
  private CheckingAccount2 accountTwo;

  public Bank2(){
    accountOne = new CheckingAccount2("Zeus", 100, "1");
    accountTwo = new CheckingAccount2("Hades", 200, "2");

  }

  public static void main(String[] args){

    Bank2 bank2OfGods = new Bank2();
    System.out.println(bank2OfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bank2OfGods.accountOne.getBalance());
    System.out.println(bank2OfGods.accountOne.getMonthlyInterest());

  }
}