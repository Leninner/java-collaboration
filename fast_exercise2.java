public class fast_exercise2 {
    public static void main(String[] args) {
        int arraynum [] = {4,5,6,8,10};
        int numberop = 14;
        int aux = 0;
        Boolean option = true;
        for(int i = 0; i<arraynum.length;i++){
            for (int j = i; j<arraynum.length;j++){
              aux = arraynum[i] + arraynum[j];
              if(aux==numberop){
                  System.out.println(numberop+"  es igual a la suma de " + arraynum[i] + " en la posición "+ i + " y" + arraynum[j]+ "en la posición  " + j);
                  option = false;
                  break;
              }  
            }
        }
        if(option == true){
            System.out.println("Ningún número suma "+ numberop);
        }
    }
}


