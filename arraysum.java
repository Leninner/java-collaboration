import javax.swing.JOptionPane;
public class arraysum {
    public static void main(String[] args) {

        int [] num = new int[10];
        int arraysum = 0;

        for(int i = 0; i < 10; i++)
        {
            num [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número positivo"));
            arraysum += num [i];
        }
        JOptionPane.showMessageDialog(null, "La suma de los valores de tu array es: " + arraysum);
    }
}
