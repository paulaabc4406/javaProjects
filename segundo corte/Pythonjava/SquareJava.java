package square.java;
public class SquareJava {

    private final double a;
    public SquareJava(double side)
    {
        System.out.println("creating the square with side:" + side);
        this.a = side;
    }
    public double Perimeter()
    {
        return this.a+this.a+this.a+this.a;
    }
    public double area()
    {
        return this.a*this.a;
    }
    public static void main(String[] args) {
        SquareJava Square_1 = new SquareJava(4);
        SquareJava Square_2 = new SquareJava( 20);
        SquareJava Square_3 = new SquareJava(100);
        System.out.println("the square_1 perimeter is:" + Square_1.Perimeter());
        System.out.println("the square_2 perimeter is:" + Square_2.Perimeter());
        System.out.println("the square_3 perimeter is:" + Square_3.Perimeter());
        System.out.println("the square_1 area is:" + Square_1.area());
        System.out.println("the square_2 area is:" + Square_2.area());
        System.out.println("the square_3 area is:" + Square_3.area());
   }
}