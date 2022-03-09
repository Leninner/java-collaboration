import java.util.Scanner;
public class matrix_add{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Ingresa el tamañoo de la priemra dimensión de tu matriz: ");
        int matrix_long = scan.nextInt();
            System.out.println("Ingresa el tamaño de la segunda dimensión de tu matriz: ");
        int matrix_large = scan.nextInt();
        int matrix [][] = new int [matrix_long][matrix_large];
            System.out.println("Ingresa el tamañoo de la priemra dimensión de tu matriz 2: ");
        int matrix2_long = scan.nextInt();
            System.out.println("Ingresa el tamaño de la segunda dimensión de tu matriz 2: ");
        int matrix2_large = scan.nextInt();
        int matrix2 [][] = new int [matrix_long][matrix_large];
            System.out.println("Muy bien ahora vamos a llenar los elementos de tu primera matriz");
            System.out.println();
            for(int i = 0; i < matrix_long; i ++){
                for(int j = 0; j < matrix_large; j ++){
                    System.out.println("Ingresa el valor de la posicisión :"+ i + ", "+ j);
                    matrix[i][j] = scan.nextInt();
                }
            }
            System.out.println("Tu primera matriz se ve así: ");
            for(int i = 0; i <matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("Ahora llenaremos los valores de tu segunda matriz");
            System.out.println();
            for(int i = 0; i < matrix2_long; i++){
                for(int j =0; j< matrix2_large; j++){
                    System.out.println("Ingresa el valor de la posición: " + i + ", " + j);
                    matrix2[i][j]= scan.nextInt();
                }
            }
            System.out.println("Tu segunda matriz se ve así: ");
            for(int i = 0;i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j ++){
                    System.out.print(matrix2[i][j]+ " ");
                }
                System.out.println();
            }
            int matrix_add [][] = new int [matrix2_long][matrix2_large];
            for(int i = 0; i< matrix_long; i++){
                for(int j = 0; j<matrix_large; j++){
                    matrix_add[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }
            scan.close();
            System.out.println("La suma de tus matrices es :");
            for(int i = 0;i < matrix_add.length; i++){
                for(int j = 0; j < matrix_add[i].length; j ++){
                    System.out.print(matrix_add[i][j]+ " ");
                }
                System.out.println();
            }
    }    
}