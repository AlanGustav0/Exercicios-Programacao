import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

	public static void main(String[] args) {
		
		
		String s1 = "aardvark";
		String s2 = "apple";
		
		Set<Character> listS1 = s1.chars()
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.toSet());
		
		Set<Character> listS2 = s2.chars()
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.toSet());

	
		listS1.retainAll(listS2);
		
		if(listS1.size() == 0){
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
		

	}

}
