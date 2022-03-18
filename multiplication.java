import javax.swing.JOptionPane;
public class multiplication {
    public static void main(String[] args) {
        int first_num = 0, last_num = 0, first_range = 0, last_range = 0, first_num_copy = 0, first_range_copy = 0;
        first_num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero desde el cual quieras generar la tabla de multiplicación: "));
        last_num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero hasta el cual quieras generar la tabla de multiplicación: "));
        first_range = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero desde el cual quieras multiplicar cada uno de los números del rango: "));
        last_range = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero hasta el cual quieras multiplicar cada uno de los números del rango: "));
        first_num_copy = first_num;
        first_range_copy = first_range;
        int table [][] = new int [(last_num-first_num)+1][(last_range-first_range)+1];
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j<table[i].length;j++){
                table[i][j] = first_num*first_range;
                first_range++;
            }
        first_range = first_range_copy;    
        first_num++;
        }
        String table_String = "";
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                table_String+= table[i][j] + " ";
            }
            table_String+= "\n";
        }
        JOptionPane.showMessageDialog(null, table_String);
    }
}
