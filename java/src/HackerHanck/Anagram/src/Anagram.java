package view;

public class Anagram {

	public void Anagrama(String a, String b) {

		String cA = "";
		String cB = "";

		String textA = "";
		String textB = "";

		String[] A = a.toLowerCase().split("");
		String[] copyA = a.toLowerCase().split("");
		int[] vectA = new int[A.length];

		String[] B = b.toLowerCase().split("");
		String[] copyB = b.toLowerCase().split("");
		int[] vectB = new int[B.length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < copyA.length; j++) {
				if (A[i].equals(copyA[j])) {
					vectA[i] = vectA[i] + 1;

				}

			}

		}
		order(vectA);

		for (int i = 0; i < A.length; i++) {
			textA += A[i];
		}

		for (int i = 0; i < vectA.length; i++) {
			cA += vectA[i];
		}

		// System.out.println(cA);
		// System.out.println(textA.getBytes().length * 8);

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < copyB.length; j++) {
				if (B[i].equals(copyB[j])) {
					vectB[i] = vectB[i] + 1;

				}

			}

		}

		order(vectB);
		for (int i = 0; i < vectB.length; i++) {
			cB += vectB[i];
		}

		for (int i = 0; i < B.length; i++) {
			textB += B[i];
		}

		// System.out.println(textB.getBytes().length * 8);

		if (cA.equals(cB) && textB.contains(A[0])) {
			if (textA.equals(textB) && cA.compareTo(cB) >= 0) {
				System.out.println("Anagrams");
			} else {
				if (!textA.equals(textB) && cA.compareTo(cB) != 0) {
					System.out.println("Not Anagrams");
				} else if ((cA.compareTo(cB) >= 0 && vectA.length == vectB.length && textB.contains(A[0]))) {
					System.out.println("Anagrams");
				} else if ((cA.compareTo(cB) >= 0 && vectA.length == vectB.length && !textB.contains(A[0]))) {
					System.out.println("Not Anagrams");
				}
			}

		} else {
			System.out.println("Not Anagrams");
		}

	}

// Método Bubblesort ordenando frequência
	public static void order(int[] vect) {

		int aux;

		for (int i = 0; i < vect.length; i++) {
			for (int j = 0; j < vect.length - 1; j++) {

				if (vect[j] > vect[j + 1]) {
					aux = vect[j];
					vect[j] = vect[j + 1];
					vect[j + 1] = aux;
				}

			}
		}

	}

}
