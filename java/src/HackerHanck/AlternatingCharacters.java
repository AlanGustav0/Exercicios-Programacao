package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AlternatingCharacters {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int deletion = 0;

            for (int i=0; i<st.length() - 1; i++) {
                char a = st.charAt(i);
                char b = st.charAt(i+1);
                if(a == b){
                    deletion++;
                }
            }
            System.out.println(deletion);
    }
}
