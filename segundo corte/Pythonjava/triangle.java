package triangle;

import static java.lang.Math.sqrt;

public class triangle {
    private final double a;
    private final double b;
    private final double hypotenuse;
    public triangle(double high, double base)
    {
        System.out.println("creating the triangle with high:" + high);
        System.out.println("And with base" + base);
        this.a = high;
        this.b = base;
        this.hypotenuse = sqrt((high*high)+(base*base));
    }
    public double Perimeter()
    {
        return this.b+this.a+this.hypotenuse;
    }
    public double area()
    {
        return (this.a*this.b)/2;
    }
    public static void main(String[] args) {
        triangle triangle_1 = new triangle(10,5);
        triangle triangle_2 = new triangle( 20,7);
        triangle triangle_3 = new triangle(70,60);
        System.out.println("the triangle_1 perimeter is:" + triangle_1.Perimeter());
        System.out.println("the triangle_2 perimeter is:" + triangle_2.Perimeter());
        System.out.println("the triangle_3 perimeter is:" + triangle_3.Perimeter());
        System.out.println("the triangle_1 area is:" + triangle_1.area());
        System.out.println("the triangle_2 area is:" + triangle_2.area());
        System.out.println("the triangle_3 area is:" + triangle_3.area());
    }
    
}