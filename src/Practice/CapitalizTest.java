package Practice;

public class CapitalizTest {
	
	public static String capitalizeWord(String str) {
		
		String word[] = str.split(" ");
		String result = "";
		
		for (String w:word) {
			String first = w.substring(0, 1).toUpperCase();
			String last = w.substring(1);
			result = result+first+last+" ";
			
		}
		return result.trim();
		
		//System.out.println(result);
	}

	public static void main(String[] args) {
		
		String cap = CapitalizTest.capitalizeWord("gaurav ankush rodge");
		System.out.println(cap);
	}

}
