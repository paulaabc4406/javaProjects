public class Main{

  public static void main(String[] args) {

    Car car = new Car();
    car.setCompany_name("Chevrolet");
    car.setModel_name("Cruze");
    car.setYear(2009);

    String company_name = car.getCompany_name();
    String model_name = car.getModel_name();

    int year = car.getYear();

    double mileage = car.getMileage();

    System.out.println("Company Name: " + company_name);
    System.out.println("Model Name: " + model_name);
    System.out.println("Year: " + year);
    System.out.println("Mileage: " + mileage);

  }
}