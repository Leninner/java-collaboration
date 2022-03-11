import javax.swing.JOptionPane;
public class potencias {
    public static void main(String[] args) {
        
        double base = Integer.parseInt((JOptionPane.showInputDialog("Ingresa el valor de la base")));
        double exponente = Integer.parseInt((JOptionPane.showInputDialog("Ingresa el valor del exponente")));
        double resultado = Math.pow(base, exponente);
        double base2 = resultado;
        double exponente2 = resultado/base;
        double resultado2 = Math.pow(base2, exponente2);
        
        JOptionPane.showMessageDialog(null, resultado2);
    }
}
