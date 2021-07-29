package HackerRank;

public class JumpingOnTheClouds {

        public static void main(String[] args) {

            int clouds[] = {0 ,0 ,1 ,0 ,0 ,1 ,0};
            int jumpCloud = 0;
            int index = 0;


            for(int i=0;i<clouds.length-1;i++){
                for(int j=0;j<clouds.length-1;j++){
                    if(clouds[index] == 0 && clouds[j+2] == 0){
                        jumpCloud += 2;
                    }else {
                        jumpCloud++;
                    }
                }


            }

            System.out.println(jumpCloud);
        }
    }

