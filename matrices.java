import javax.swing.JOptionPane;


public class matrices {
    public static void main(String[] args) {
    
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de elementos de la primera dimensión de tu matrix mi estimado señor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de elementos de la segunda dimensión de tu matrix mi estimado señor"));
        String result = "";
        // 2 3
        int matrix [] [] = new int [a] [b];

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i] [j] = Integer.parseInt((JOptionPane.showInputDialog("Ingresa el valor de la segundo dimensión en la posición " + j + "en el array" + i))); 
            }
        }

        for(int k = 0; k < matrix.length; k++)
        {
            for(int h = 0; h < matrix[k].length; h++)
            {
                result += matrix[k][h] + " ";
            }
            result += "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}

//comprobrar que una matriz sea simetrica o no 