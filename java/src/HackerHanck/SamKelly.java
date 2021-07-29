package HackerRank;

public class SamKelly {

    public static void main(String[] args) {

        int sam = 3;
        int samB = sam;
        int kelly = 5;
        int difference = 5;

        sam += difference;

        while(sam < kelly){

            sam += samB;
            kelly += kelly;

            if(sam > kelly){
                System.out.print(sam - kelly);
                break;
            }


        }
    }
}
