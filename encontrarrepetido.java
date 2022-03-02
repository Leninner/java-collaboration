import javax.swing.JOptionPane;

import java.util.ArrayList;
public class encontrarrepetido {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(8);
        numeros.add(4);
        numeros.add(5);
        numeros.add(1);
        numeros.add(2);


        ArrayList<Integer> index = new ArrayList<>();
        int aux = 0;

        for(int k = 0; k < numeros.size(); k++)
        {
            aux = numeros.lastIndexOf(numeros.get(k))- numeros.indexOf(numeros.get(k));
            index.add(aux); 
        }


        for (int i = 0; i < index.size() - 1; i++) {
            for (int j = 0; j < index.size() - 1; j++) {
              if (index.get(j) > index.get(j + 1)) {
                aux = index.get(j);
                index.set(j,index.get(j + 1));
                index.set(j + 1,aux);
              }
            }
          }



        for(int y : index)
        {
            if (y > 0)
            {
                JOptionPane.showMessageDialog(null, numeros.get(y));
                break;
            }
        }

        }
    }



