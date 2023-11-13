import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import jssc.SerialPortList;


public class TestArduino {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String puertos[] = SerialPortList.getPortNames();
        
        for (String n : puertos) {
         System.out.println(n);
        }
        
        SerialPort sp = new SerialPort("/dev/ttyACM0");
        try {
          sp.openPort();
          sp.setParams(SerialPort.BAUDRATE_115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
          sp.addEventListener(new LecturaSerial(sp),SerialPort.MASK_RXCHAR);      
          Thread.sleep(1500);
        
          while(true) {
             System.out.println("Enviando...");
             sp.writeString("Holaa");
             Thread.sleep(3000);            
             sp.writeString("Hola0");
             Thread.sleep(3000);            
          }
        } catch(SerialPortException e) {
            e.printStackTrace();
          }
    }    
}

class LecturaSerial implements SerialPortEventListener{
         
    SerialPort sp;
    public LecturaSerial(SerialPort sp) {
       this.sp = sp;
    }
    
    @Override
    public void serialEvent(SerialPortEvent spe) {
        try{ 
            String msg="";
            msg = sp.readString(5);
            System.out.println("Recibiendo...");
            System.out.println(msg);
        }catch(Exception e){
          e.printStackTrace();
        }
        
    }
}