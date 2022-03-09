import java.util.Scanner;

//ingresan un numero y retornan el opuesto
public class fast_ejercicio {
    public static void main(String[] args) {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu número");
        number = scan.nextInt();
        number = number-(number*2);
        scan.close();
        System.out.println("Tu número opuesto es: "+ number );
    }
}