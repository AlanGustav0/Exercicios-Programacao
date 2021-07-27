import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SomaPositivos {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cont = 0;
        int somaPositivos = 0;


        while (cont < 6 ) {
            double x = Double.parseDouble(br.readLine());
        	if (x > 0) {
        		somaPositivos++;
        	}
        	cont++;
            
        }
        System.out.print(somaPositivos + " valores positivos");
    }
	
}