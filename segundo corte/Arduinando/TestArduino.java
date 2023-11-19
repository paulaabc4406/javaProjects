import jssc.SerialPort;
import jssc.SerialPortList;


public class TestArduino {

    public static void main(String[] args) {
        // TODO code application logic here
        String puertos[] = SerialPortList.getPortNames();
        
        for (String n : puertos) {
         System.out.println(n);
        }
    }    
}