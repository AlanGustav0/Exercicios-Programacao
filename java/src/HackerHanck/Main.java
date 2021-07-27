public class Main {

    public static void main(String[] args){

        int n = 5;
        int m = 2;
        int d = 3;
        int contador = 0;
        int number = 1;
        while(contador < 5){

            while(true){
                if(number >= m && String.valueOf(number).contains(String.valueOf(d))){
                    System.out.print(number);
                    break;
                }
            }
            number++;
            contador++;
        }

        
    }


}