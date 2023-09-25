public class Bank1{

  private CheckingAccount1 accountOne;
  private CheckingAccount1 accountTwo;

  public Bank1(){

    accountOne = new CheckingAccount1("Zeus", 100, "1");
    accountTwo = new CheckingAccount1("Hades", 200, "2");

  }

  public static void main(String[] args){

    Bank1 bank1OfGods = new Bank1();
    System.out.println(bank1OfGods.accountOne.getBalance());
    bank1OfGods.accountOne.setBalance(5000);
    System.out.println(bank1OfGods.accountOne.getBalance());

  }
}