package rectangle1;


public class Rectangle1 {

    private final double a;
    private final double b;
    public Rectangle1(double side, double base)
    {
        System.out.println("creating the square with side:" + side);
        System.out.println("And with base" + base);
        this.a = side;
        this.b = base;
    }
    public double Perimeter()
    {
        return (2*this.b)+(2*this.a);
    }
    public double area()
    {
        return this.a*this.b;
    }


    public static void main(String[] args) {
        Rectangle1 Rectangle_1 = new Rectangle1(6,3);
        Rectangle1 Rectangle_2 = new Rectangle1( 4,6);
        Rectangle1 Rectangle_3 = new Rectangle1(30,10);
        System.out.println("the Rectangle_1 perimeter is:" + Rectangle_1.Perimeter());
        System.out.println("the Rectangle_2 perimeter is:" + Rectangle_2.Perimeter());
        System.out.println("the Rectangle_3 perimeter is:" + Rectangle_3.Perimeter());
        System.out.println("the Rectangle_1 area is:" + Rectangle_1.area());
        System.out.println("the Rectangle_2 area is:" + Rectangle_2.area());
        System.out.println("the Rectangle_3 area is:" + Rectangle_3.area());
   }
}