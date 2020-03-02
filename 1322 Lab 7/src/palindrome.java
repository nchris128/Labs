import java.util.Scanner;
public class palindrome {
	
	public static boolean isPalindrome(String word) {
	    return word.equals(palindromeTest(word));
	} 
	
	public static String palindromeTest(String word) {
		  if(word.length() == 1) {
		    return word;
		  }
		  return palindromeTest(word.substring(1)) + word.charAt(0);
		} 

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a word: ");
	String word = sc.nextLine();
	if (isPalindrome(word) == true) {
		System.out.println(word + " is indeed a palindrome");
	}
	else {
		System.out.println(word + " is not a palindrome");
	}
}


}
