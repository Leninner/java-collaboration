import javax.swing.JOptionPane;
public class suma2{
    public static void main(String[] args) {
     float num1 = Float.parseFloat((JOptionPane.showInputDialog("Ingresa el primer número")));
     float num2 = Float.parseFloat((JOptionPane.showInputDialog("Ingresa el segundo número")));
     float result = num1 + num2;
     JOptionPane.showMessageDialog(null, "La suma es igual a " + result);
    }
}