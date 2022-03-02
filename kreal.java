import javax.swing.JOptionPane;
import java.util.ArrayList;

public class kreal {
    public static void main(String[] args) {
       
        int k = 7;
        int aux = 0;
        boolean  aux2 = true;

        ArrayList<Integer> parak = new ArrayList<>();
        parak.add(1);
        parak.add(6);
        parak.add(4);
        parak.add(3);
        parak.add(7);
        parak.add(2);
        parak.add(5);


        for(int i = 0; i < parak.size(); i++)
        {
            for(int j = i; j < parak.size(); j++)
            {
                aux = (parak.get(i)) + (parak.get(j));
                if (aux == k)
                {
                    JOptionPane.showMessageDialog(null, "k es igual a la suma de " + parak.get(i) + " y " + parak.get(j));
                    aux2 = false;
                    break;
                } 
            }
        }   
        if (aux2 == true)
            {
                JOptionPane.showMessageDialog(null, "Ningun número suma k ");
                
            } 
    }
}