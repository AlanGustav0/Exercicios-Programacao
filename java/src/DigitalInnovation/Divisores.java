import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        br.close();

        int menor = -1;
        int n = 1;

        if (C % A == 0) {
            while (true) {
                if (n % A == 0 && n % B != 0 && D % n != 0 && C % n == 0) {
                    menor = n;
                    break;
                }
                n++;
            }
        }
        System.out.println(menor);
    }
}