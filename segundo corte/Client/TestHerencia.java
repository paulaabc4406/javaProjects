package test;
import java.util.Date;
import person1.*;
public class TestHerencia {
    public static void main(String[] args){
        
        Employee empleado1= new Employee("Alex", 3000);
        System.out.println(empleado1);
        Employee empleado2= new Employee("Raul", 4000);
        System.out.println(empleado2);
        var fecha = new Date();
        Client cliente1 = new Client(fecha, true, "suny", 'F', 18 ,"Santo Tomas");
        System.out.println(cliente1);
    }
}