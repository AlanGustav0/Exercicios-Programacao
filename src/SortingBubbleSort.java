package HackerRank;

public class SortingBubbleSort {


    public static void main(String[] args) {
        int a[] = {1,2,3};
        countSwaps(a);
    }

    private static void countSwaps(int[] a) {
        int tamanho = a.length;
        int aux;
        int contaTrocas = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                    contaTrocas++;
                }
            }
        }
        System.out.println("Array is sorted in " + contaTrocas + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.print("Last Element: " + a[tamanho - 1]);
    }
}
