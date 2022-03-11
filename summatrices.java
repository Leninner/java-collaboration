import javax.swing.JOptionPane;

public class summatrices {
    public static void main(String[] args) {
// crear una matrix 3*3 trasponerla y mostrarla 
    int matrix [] [] = new int [3] [3];
    matrix [0][0] = 1;
    matrix [0][1] = 2;
    matrix [0][2] = 3;
    matrix [1][0] = 4;
    matrix [1][1] = 5;
    matrix [1][2] = 6;
    matrix [2][0] = 7;
    matrix [2][1] = 8;
    matrix [2][2] = 9;
    int aux ;
   String result = "";
    
    

    for (int i = 0; i < matrix.length; i ++)
    {
        for (int j = 0; j < i; j++)
        {
            aux = matrix[i][j];
            matrix[i][j] = matrix [j] [i];
            matrix [j] [i] = aux;
        }
    }
    
    for (int k = 0; k < matrix.length; k++)
    {
        for (int l = 0; l < matrix[k].length; l++)
        {
            result += matrix[k][l] + " ";
        }
        result += "\n";
    }
    JOptionPane.showMessageDialog(null, result);
}
}
