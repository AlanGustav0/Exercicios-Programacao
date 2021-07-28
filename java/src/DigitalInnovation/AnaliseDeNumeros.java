import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros  {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int valor = 0;
        int valorPar = 0;
        int valorImpar = 0;
        int valorPositivo = 0;
        int valorNegativo = 0;


//continue a solução
        for (int i=0;i < 5;i++) {
            valor = leitor.nextInt();
            if(valor % 2 == 0 && valor > 0){
                valorPar++;
                valorPositivo++;
            }else if(valor % 2 != 0 && valor > 0){
                valorImpar++;
                valorPositivo++;
            }else if(valor % 2 != 0 && valor < 0){
                valorImpar++;
                valorNegativo++;
            }else if(valor % 2 == 0 && valor < 0){
                valorPar++;
                valorNegativo++;
            }else{
                valorPar++;
            }
        }
//insira suas variaveis corretamente
        System.out.println(valorPar + " valor(es) par(es)");
        System.out.println( valorImpar+ " valor(es) impar(es)");
        System.out.println(valorPositivo + " valor(es) positivo(s)");
        System.out.println(valorNegativo + " valor(es) negativo(s)");
    }

}