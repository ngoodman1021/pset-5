/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {
    
    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();
		
		String in;
		String out;
		String text;
		int n;
		String target;
		char suffix;
		int count = 0;
	    
       System.out.println("\nExercise 1: " + ps.surroundMe());
       System.out.println("\nExercise 2: " + ps.endsMeet());
       System.out.println("\nExercise 3: " + ps.middleMan());
       System.out.println("\nExercise 4: " + ps.isCentered());
       System.out.println("\nExercise 5: " + ps.countMe());
       System.out.println("\nExercise 6: " + ps.triplets());
       System.out.println("\nExercise 7: " + ps.addMe());
       System.out.println("\nExercise 8: " + ps.sequence());
       System.out.println("\nExercise 9: " + ps.intertwine());
       System.out.println("\nExercise 10: " + ps.isPalindrome());
	    
	// fill in what is needed for each exercise :)
	   
    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {
		
		String firstHalf;
		String secondHalf;
		String newString;
		// iniliazing values
		
		if(in == null || out == null || out.length() !=4){
			return in;
		}else{
			firstHalf = out.substring(0,2);
			secondHalf = out.substring(2,4);
			newString = firstHalf + in + secondHalf;
			return newString;
		}
    
	}
    
    /*
     * Exercise 2.
     * 
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */
    
    public String endsMeet(String text, int n) {
	
	if(text == null || text.length() > 10 || text.length() < 1 || n < 1 || n > text.length()){
        	return text;
      	}else{
        	String first = text.substring(0, n);
        	String last = text.substring(text.length()-n, text.length());
        	String newString = first + last;
        	
			return newString;
		}
    
	}
	
	/*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
     */
    
    public String middleMan(String text) {
		
		if(text == null || text.length() > 3 || text.length() % 2 == 0){
			return text;
		
		}else{
			int midNumber = text.length() / 2;
			char first = text.charAt(midNumber - 1);
			char second = text.charAt(midNumber);
			char third = text.charAt(midNumber + 1);
			String threeChar = String.valueOf(first) + String.valueOf(second) + String.valueOf(third);
			
			return threeChar;
		}
    
	}
	
	/*
     * Exercise 4.
     * 
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    
    public boolean isCentered(String text, String target) {
		
		if(text == null || text.length() < 3 || text.length() % 2 == 0 || target == null || target.length() < 3 || target.length() > 3){
			return false;
		
		}else{
			
			int midNumber = text.length() / 2;
			char first = text.charAt(midNumber - 1);
			char second = text.charAt(midNumber);
			char third = text.charAt(midNumber + 1);
			String threeChar = String.valueOf(first) + String.valueOf(second) + String.valueOf(third);
			
			if(threeChar.equals(threeChar)){
				return true;
			
			}else{
				return false;
			}
		}
    
	}
    
	/*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     */
    
    public int countMe(String text, char suffix) {
		
		text = text.toLowerCase();
		suffix = Character.toLowerCase(suffix);
		String sufString = String.valueOf(suffix);
		int count = 0;
		
		String word[] = text.split("");
		
		if(suffix <= 'a' || suffix >= 'z' || text == null){
			return -1;
		
			}else{
				for(int i = 0; i < word.length; i++){
				
					if(word[i].endsWith(sufString)){
						count++;
					}
				}
			return count;
		}
	}
	
	/*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     */
    
    public int triplets(String text) {
		if(text == null){
			return -1;
		}else{
			int count = 0;
			
			for(int i = 0; i <= text.length() - 3; i++){
				if(text.charAt(i) == text.charAt(i +1) && text.charAt(i) == text.charAt(i +2)){
					count ++;
					i += 2;
				}
			}
			return count;
		}
    }
    
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {
	if (text != null) {
            long sum = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 48 && text.charAt(i) <= 57) {
                    sum += Character.getNumericValue(text.charAt(i));
                }
            }
            return sum;
        }
        return -1;
    }
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */
    
    public long sequence(String text) {
	if (text != null) {
            long longSeq = 0;
            int seqLen = 0;
            for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) == text.charAt(i + 1)) {
                    seqLen += 1;
                }
                if (seqLen > longSeq) {
                    longSeq = seqLen;
                }
            }
            return longSeq;
        }
        return -1;
    }
    
    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    
    public String intertwine(String a, String b) {
		return newString;
    }
    
    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     */
    
    public boolean isPalindrome(String text) {
		return newString;
    }
}
