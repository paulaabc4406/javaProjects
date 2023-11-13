package add;

import javax.swing.JOptionPane;
public class Add {
    
    public static void main(String[] args) {
       String Value1;
       String Value2;
       int result,number1,number2;
       Value1 = JOptionPane.showInputDialog("Enter the firts number");
       Value2 = JOptionPane.showInputDialog("Enter the second number");
       number1 = Integer.parseInt(Value1);
       number2 = Integer.parseInt(Value2);
       result = number1 + number2;
       JOptionPane.showMessageDialog(null, "Result is" + result, "result", JOptionPane.PLAIN_MESSAGE);
       System.exit(0);
    }
    
}