
public class StringMethods {
	
	public static String capitalize(String word) {
		
		word = word.toLowerCase();
		word = word.substring(0, 1).toUpperCase() + word.substring(1);
		
		return word;
		
	}
	
	public static int wheresWaldo(String phrase) {
		
		int waldoIndex = phrase.indexOf("Waldo");
		
		return waldoIndex;
	}
	
	public static String firstThingsFirst(String a, String b) {
		
		String answer;
		
		if(a.compareToIgnoreCase(b) > 0) {
			answer = "your second word comes before your first alphabetically";	 
		} else {
			answer = "your first word comes before your second alphabetically";
		}
		
		return answer;
	}
	
	public static String reverse(String s) {
		
		String returnString = "";
		char c; 
		
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			returnString = c + returnString;
		}
		return returnString;
	}
	
	public static void soLong(String a, String b) {
		
		if(a.length() > b.length()) {
			System.out.println(a);
		} else if (a.length() < b.length()) {
			System.out.println(b);
		} else if (a.length() == b.length()) {
			System.out.println(a + " " + b);
		}
		
	}
	
	public static String afterMath (String phrase2) {
		
		String newString;
		int index;
		
		if (phrase2.contains("math")) {
			index = phrase2.indexOf("math");
			newString = phrase2.substring(index);
		} else {
			newString = "dud! Were you even listening?";
		}
		return newString;
	}
	
	public static void letterize(String word) {
		
		for(int i = 0; i < word.toCharArray().length; i++) {
			System.out.println(word.charAt(i));
		}
		
	}
	
	public static String camelCase(String phrase) {
		
		StringBuilder builder = new StringBuilder();
		boolean shouldConvertNextCharToLower = true;
			
		for (int i = 0; i < phrase.length(); i++) {
			char currentChar = phrase.charAt(i);
			if(currentChar == ' ') {
				shouldConvertNextCharToLower = false;
			} else if (shouldConvertNextCharToLower){
				builder.append(Character.toLowerCase(currentChar));
			} else {
			builder.append(Character.toUpperCase(currentChar));
			shouldConvertNextCharToLower = true;
		}
		}
		return builder.toString();
	}

}
