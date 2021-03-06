import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String continuePlaying;
		
		do {
		System.out.print("Hello there! Please input your favorite word!: ");
		String word = scnr.next();
		System.out.println("Look at this! I've perfected the capitalization of your word!: " + StringMethods.capitalize(word));
		System.out.println("Don't worry! The fun is just beginning!");
		
		scnr.nextLine();
		
		System.out.print("Ok, now enter a sentence with the word Waldo in it: ");
		String phrase = scnr.nextLine();
		System.out.println("Guess what I know? The index where Waldo first appeared is " + StringMethods.wheresWaldo(phrase) + "!");
			
		System.out.print("This is where things get really good. Enter a word please: ");
		String word1 = scnr.next();
		System.out.print("Great word! Now enter another word please: ");
		String word2 = scnr.next();
		System.out.println("If you're wondering which word comes aplhabetically before the other: " + StringMethods.firstThingsFirst(word1, word2) + "!" );
		System.out.print("Prepare to have your mind blown! Enter a word: ");
		String reverseWord = scnr.next();
		System.out.println("Buckle up. The word you entered spelled backwards is: " + StringMethods.reverse(reverseWord) + "!");
		
		scnr.nextLine();
		System.out.print("Enter a sentence please: ");
		String sentence1 = scnr.nextLine();
		
		System.out.print("Enter another sentence please: ");
		String sentence2 = scnr.nextLine();
		System.out.print("Ok. Get ready, because the longer of the two sentences you just entered is: ");
	    StringMethods.soLong(sentence1, sentence2);
	    
		System.out.print("I'm going to give you one chance to enter a phrase with the word math somewhere in it: ");
		String mathPhrase = scnr.nextLine();
		System.out.println("Here's where your phrase used the word math: " + StringMethods.afterMath(mathPhrase));
		
		System.out.print("Okay, now enter a word you want to see taken apart, letter by letter: ");
		String letterWord = scnr.next();
		StringMethods.letterize(letterWord);
		
		scnr.nextLine();
		System.out.print("And for my last trick, enter a phrase you want camelCased!: ");
		String camelPhrase = scnr.nextLine();
	
		System.out.println("Your camelCased phrase is: " + StringMethods.camelCase(camelPhrase));
		System.out.print("Amazing right??? Do you want to continue playing? (y/n): ");
		continuePlaying = scnr.next().toLowerCase();
				
		} while (continuePlaying.equals("y"));
		
		System.out.println("Have a nice day!");
		scnr.close();
		System.exit(0);
	}
	

}


