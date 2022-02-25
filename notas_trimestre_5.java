import javax.swing.JOptionPane;

//Gestionar las notas de un centro educativo, la clase tiene 5 alumnos, se pide leer las notas del primer segundo y tercer trimestre de un grupo o clase, mostrar las notas promediadas de cada trimestre.
public class notas_trimestre_5 {
    public static void main(String[] args) {
        double[] al_1 = new double [3], al_2 = new double[3], al_3 = new double[3], al_4 =new double[3], al_5 = new double[3];
        String [] nom_alumnos = new String[5];
        int base = 0, num_al = 0, num_trimestre = 0;
        double med_al_1= 0, med_al_2=0, med_al_3=0, med_al_4=0, med_al_5=0;
        for(int i = 1; i <= 5; i++){
            switch (i) {
                case 1:
                nom_alumnos [base] = JOptionPane.showInputDialog(null, "Ingresa el nombre del alumno # " + i + ":");
                al_1[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del primer trimestre del alumno # " + i + ":"));
                al_1[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del segundo trimestre del alumno # " + i + ":"));
                al_1[2] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del tercer trimestre del alumno # " + i + ":"));
                base++; 
                    break;
                case 2:
                nom_alumnos [base] = JOptionPane.showInputDialog("Ingresa el nombre del alumno # " + i + ":");
                al_2[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del primer trimestre del alumno # " + i + ":"));
                al_2[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del segundo trimestre del alumno # " + i + ":"));
                al_2[2] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del tercer trimestre del alumno # " + i + ":"));
                base++;
                    break;
                case 3:
                nom_alumnos [base] = JOptionPane.showInputDialog(null, "Ingresa el nombre del alumno # " + i + ":");
                al_3[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del primer trimestre del alumno # " + i + ":"));
                al_3[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del segundo trimestre del alumno # " + i + ":"));
                al_3[2] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del tercer trimestre del alumno # " + i + ":"));
                base++;
                    break;
                case 4:
                nom_alumnos [base] = JOptionPane.showInputDialog(null, "Ingresa el nombre del alumno # " + i + ":");
                al_4[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del primer trimestre del alumno # " + i + ":"));
                al_4[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del segundo trimestre del alumno # " + i + ":"));
                al_4[2] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del tercer trimestre del alumno # " + i + ":"));
                base++;
                    break;
                case 5:
                nom_alumnos [base] = JOptionPane.showInputDialog(null, "Ingresa el nombre del alumno # " + i + ":");
                al_5[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del primer trimestre del alumno # " + i + ":"));
                al_5[1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del segundo trimestre del alumno # " + i + ":"));
                al_5[2] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del tercer trimestre del alumno # " + i + ":"));
                base++;
                    break;
             
            }
            
        }
        med_al_1 = (al_1[0] + al_1[1] + al_1[2])/3;
        med_al_2 = (al_2[0] + al_2[1] + al_2[2])/3;
        med_al_3 = (al_3[0] + al_3[1] + al_3[2])/3;
        med_al_4 = (al_4[0] + al_4[1] + al_4[2])/3;
        med_al_5 = (al_5[0] + al_5[1] + al_5[2])/3;
        
        num_al = Integer.parseInt(JOptionPane.showInputDialog("Escoge el nombre del alunmo de quien quieres ver las notas: 1."+nom_alumnos[0]+" ; 2."+nom_alumnos[1] + " ; 3."+ nom_alumnos[2] + " ; 4."+nom_alumnos[3] + " ; 4."+ nom_alumnos[4]));
        switch(num_al){
            case 1:
            num_trimestre = Integer.parseInt(JOptionPane.showInputDialog("Escoge el trimestre del cualquieres ver la nota: 1. Primer Trimestre, 2. Segundo trimestre, 3. Tercer Trimestre" ));
            switch (num_trimestre){
                case 1:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[0] + " es: " + al_1[0] + ", el promedio de sus notas de trimestre es : " + med_al_1);
                    break;
                case 2:
                JOptionPane.showMessageDialog(null, "La nota del segundo trimestre de " + nom_alumnos[0] + " es: " + al_1[1] + ", el promedio de sus notas de trimestre es : " + med_al_1);
                    break;
                case 3:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[0] + " es: " + al_1[2] + ", el promedio de sus notas de trimestre es : " + med_al_1);
                    break;
            }
            case 2:
            num_trimestre = Integer.parseInt(JOptionPane.showInputDialog("Escoge el trimestre del cualquieres ver la nota: 1. Primer Trimestre, 2. Segundo trimestre, 3. Tercer Trimestre" ));
            switch (num_trimestre){
                case 1:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[1] + " es: " + al_2[0] + ", el promedio de sus notas de trimestre es : " + med_al_2);
                    break;
                case 2:
                JOptionPane.showMessageDialog(null, "La nota del segundo trimestre de " + nom_alumnos[1] + " es: " + al_2[1] + ", el promedio de sus notas de trimestre es : " + med_al_2);
                    break;
                case 3:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[1] + " es: " + al_2[2] + ", el promedio de sus notas de trimestre es : " + med_al_2);
                    break;
            }
            case 3:
            num_trimestre = Integer.parseInt(JOptionPane.showInputDialog("Escoge el trimestre del cualquieres ver la nota: 1. Primer Trimestre, 2. Segundo trimestre, 3. Tercer Trimestre" ));
            switch (num_trimestre){
                case 1:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[2] + " es: " + al_3[0] + ", el promedio de sus notas de trimestre es : " + med_al_3);
                    break;
                case 2:
                JOptionPane.showMessageDialog(null, "La nota del segundo trimestre de " + nom_alumnos[2] + " es: " + al_3[1] + ", el promedio de sus notas de trimestre es : " + med_al_3);
                    break;
                case 3:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[2] + " es: " + al_3[2] + ", el promedio de sus notas de trimestre es : " + med_al_3);
                    break;
            }
            case 4:
            num_trimestre = Integer.parseInt(JOptionPane.showInputDialog("Escoge el trimestre del cualquieres ver la nota: 1. Primer Trimestre, 2. Segundo trimestre, 3. Tercer Trimestre" ));
            switch (num_trimestre){
                case 1:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[3] + " es: " + al_4[0] + ", el promedio de sus notas de trimestre es : " + med_al_4);
                    break;
                case 2:
                JOptionPane.showMessageDialog(null, "La nota del segundo trimestre de " + nom_alumnos[3] + " es: " + al_4[1] + ", el promedio de sus notas de trimestre es : " + med_al_4);
                    break;
                case 3:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[3] + " es: " + al_4[2] + ", el promedio de sus notas de trimestre es : " + med_al_4);
                    break;
            }
            case 5:
            num_trimestre = Integer.parseInt(JOptionPane.showInputDialog("Escoge el trimestre del cualquieres ver la nota: 1. Primer Trimestre, 2. Segundo trimestre, 3. Tercer Trimestre" ));
            switch (num_trimestre){
                case 1:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[4] + " es: " + al_5[0] + ", el promedio de sus notas de trimestre es : " + med_al_5);
                    break;
                case 2:
                JOptionPane.showMessageDialog(null, "La nota del segundo trimestre de " + nom_alumnos[4] + " es: " + al_5[1] + ", el promedio de sus notas de trimestre es : " + med_al_5);
                    break;
                case 3:
                JOptionPane.showMessageDialog(null, "La nota del primer trimestre de " + nom_alumnos[4] + " es: " + al_5[2] + ", el promedio de sus notas de trimestre es : " + med_al_5);
                    break;
            }
        }
    }
}
