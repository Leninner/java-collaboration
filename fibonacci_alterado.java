import java.util.ArrayList;
import java.util.Scanner;
public class fibonacci_alterado {
    public static void main(String[] args) {
        int amplitude = 0;
        Scanner scan = new Scanner(System.in);
            ArrayList <Integer> first_positions = new ArrayList<>();
            System.out.println("Ingresa el primer número para tu serie :");
                first_positions.add(scan.nextInt());
            System.out.println("Ingresa el segundo número para tu serie :");
                first_positions.add(scan.nextInt());
            System.out.println("Ingresa el tercer número para tu serie :");
                first_positions.add(scan.nextInt());
            System.out.println("Ingresa la amplitud de tu serie (de 4 a 100) :");
                amplitude = scan.nextInt();
                if(amplitude > 100 || amplitude < 0){
                    System.out.println("Tas pendejo, solo es del 0 hasta el 100");
                } else if (amplitude == 0){
                    System.out.println("[ ]");
                    }   else if (amplitude == 1) {
                            System.out.println("["+ first_positions.get(0)+"]");
                        }  else if (amplitude == 2) {
                                System.out.println("["+ first_positions.get(0)+","+ first_positions.get(1)+"]");
                            }   else if (amplitude == 3) {
                                    System.out.println("["+ first_positions.get(0)+","+ first_positions.get(1)+","+ first_positions.get(2)+"]");
                            }   else{
                                    for(int i = 0; i < amplitude-3; i++){
                                    first_positions.add(first_positions.get(i)+first_positions.get(i+1)+first_positions.get(i+2));
                                    }System.out.println("El resultado de tu serie es : "+ first_positions.toString());
                                }
                scan.close(); 
    }                 

}

