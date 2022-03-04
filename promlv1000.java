import javax.swing.JOptionPane;
public class promlv1000 {
    public static void main(String[] args) {
//Realizar el promedio de los números de un arreglo sin los dos números más grandes y los dos números más pequeños.
//Notas:
//- El arreglo siempre va a tener  más de 6 elementos
 //- Los elementos del arreglo siempre van a ser únicos (no se van a repetir)
 int averagedata []  = {8, 10 ,6, 12, 18, 5, 3 ,85};  
 int bubble = 0;
 int average = 0;

    for (int i = 0; i < averagedata.length - 1; i++) {
        for (int j = 0; j < averagedata.length - 1; j++) {
         if (averagedata[j] > averagedata[j + 1]) {
            bubble = averagedata[j];
            averagedata[j] = averagedata[j + 1];
            averagedata[j + 1] = bubble;
            }
        }
    }

    for (int k = 2; k < averagedata.length - 2; k++)
    {
        average += averagedata[k] ; 
    }

    average /= (averagedata.length - 4);
    JOptionPane.showMessageDialog(null, "El promedio es: " + average);  
}
}
