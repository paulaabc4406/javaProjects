package person1;

public class Employee extends Person1{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Employee(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Employee.contadorEmpleado;
        this.sueldo = sueldo;
    }

   

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Employee.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String ObtenerDetalle() {
        return super.ObtenerDetalle() + "Sueldo" + this.sueldo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("idEmpleado= ").append(idEmpleado);
        sb.append(", sueldo= ").append(sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}