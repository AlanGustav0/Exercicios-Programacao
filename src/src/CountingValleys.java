public class CountingValleys {

    public static void main(String[] args) {
        String path = "DDUUDDUDUUUD";
        int steps = path.length();

        char newPath[] = path.toCharArray();
        int level = 0;
        boolean start = false;
        int countValleys = 0;

        for(int i = 0 ; i < steps ; i++){
            if(newPath[i] == 'D' && level == 0){
                start = true;
            }

            if(newPath[i] == 'U'){
                level++;
            }else if(start == false){
                level--;
            }else{
                level--;
            }

            if(level == 0 && start == true){
                countValleys++;
                start = false;
            }
        }

        System.out.print(countValleys);
    }
}
