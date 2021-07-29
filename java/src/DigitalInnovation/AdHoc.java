/*
Neste desafio a tarefa será ler vários números e em seguida dizer
quantas vezes cada número aparece, ou seja, deve-se
escrever cada um dos valores distintos que aparecem na
entrada por ordem crescente de valor.
 */

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class AdHoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        SortedMap<Integer, Integer> map = new TreeMap<>();
        int N =sc.nextInt();
        while(N > 0){
            listaNumeros.add(sc.nextInt());
            N--;
        }

        listaNumeros.forEach(id -> map.compute(id, (k ,v ) -> ( v == null ? 1 : v + 1)));
        map.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });


        sc.close();
    }
}