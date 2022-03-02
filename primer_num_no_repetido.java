import java.util.ArrayList;

public class primer_num_no_repetido {
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        boolean number = true;
        for(int i =0; i< array.size(); i++){
            if(array.indexOf(array.get(i)) == array.lastIndexOf(array.get(i)) ){
                System.out.println("El primer número que no se repite es: "+ array.get(i) );
                break;
            } number = false;
        } 
        if(number == false){
        System.out.println("No hay números que no se repitan ^v^");
        }
    }
}
