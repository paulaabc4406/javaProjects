public class Circle {
  private static final double pi =3.14;
  private double Radius;
  public Circle(double diameter) {
    System.out.println("creating the Circle with diameter:"+ diameter);
    this.Radius = diameter/2;
  }
  public double Perimeter(){
    return 2*pi*this.Radius;
  }
  public double Area(){
    return pi*this.Radius*this.Radius;
  }
  public static void main(String[] args) {
    Circle medium_pizza = new Circle(12);
    Circle teaching_table = new Circle(36);
    Circle round_room = new Circle(11400);
  System.out.println("the medium pizza perimeter is: "+ medium_pizza.Perimeter());
System.out.println("the teaching_table perimeter is:" + teaching_table.Perimeter());
    System.out.println("the round_room area is: " + round_room.Perimeter());
    System.out.println("the medium pizza area is: " + medium_pizza.Area());
      System.out.println("the teaching_table area is: " + teaching_table.Area());
      System.out.println("the round_room area is: "+ round_room.Area());
  }
}