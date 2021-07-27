import java.io.*;

public class CorridaTartaruga {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maior = 0;
		int n;
		do {
			n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String s[] = str.split(" ");

      for(int i=0;i<s.length;i++){
        if(Integer.parseInt(s[i]) < 10 && maior <= 1){
            maior = 1;
        }
        if(Integer.parseInt(s[i]) >= 10 && Integer.parseInt(s[i]) < 20 && maior >= 0 && maior < 3){
          maior = 2;
        }
        if(Integer.parseInt(s[i]) >= 20 && maior == 2){
          maior = 3;
          break;
        } 
        
      }
      System.out.println(maior);
      maior = 0;
			}while (br.ready());
			
    }
}