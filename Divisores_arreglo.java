//pedir un número al usuario y almacenar sus divisores en un arreglo
import java.util.Arrays;

import javax.swing.JOptionPane;
public class Divisores_arreglo {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número: "));
            for (int i =1; i<= numero; i++){
                if(numero%i==0){
                contador++;
                }
            }
        int[] divisores = new int[contador];
        int h = 0;
            for (int j =1; j<= numero; j++){ 
                if(numero%j==0){
                divisores[h] = j;
                h++;
                }
            }
        String div_print = Arrays.toString(divisores);
        JOptionPane.showMessageDialog(null, "Los divisores del número ingresado es: "+ div_print);        
    }
    
}
