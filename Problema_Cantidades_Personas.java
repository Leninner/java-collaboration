import java.util.Scanner;

public class Problema_Cantidades_Personas {
    public static void main(String[] args) {
        float primero = 0;
        float segundo = 0;
        float tercero = 0;
        float resultado = 0;

        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        primero = scann.nextFloat();
        segundo = primero / 2 ;
        tercero = primero + segundo ;
        resultado = primero + segundo + tercero;

        System.out.println(" La cantidad de su resultado es :"+ resultado);




  


        
    }
}
