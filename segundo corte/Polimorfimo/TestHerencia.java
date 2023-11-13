package test;

import java.util.Date;

import person1.*;

public class TestHerencia {
    public static void main(String[] args){
        
        Person1 persona = new Person1("Alex", 'M', 25, "Cusco");

        //System.out.println(persona.ObtenerDetalle());

        imprimir(persona);
        Employee empleado1 = new Employee("Gutierrez", 3000);

        //System.out.println(empleado1.ObtenerDetalle());

        imprimir(empleado1);
        
        var fecha = new Date();
        Client cliente1 = new Client(fecha, true, "Juan", 'M', 25 ,"Santo Tomas");

        //System.out.println(cliente1.ObtenerDetalle());

        imprimir(cliente1);
    }
    public static void imprimir(Person1 personaje){
        System.out.println(personaje.ObtenerDetalle());
    }
}