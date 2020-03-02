
public class palindrome {

public static void main(String[] args) {
	
	isPalindrome("tacocat");
	System.out.println(	isPalindrome("taco"));
}

public static boolean isPalindrome(String word) {
    return word.equals(palindromeTest(word));
} 
public static String palindromeTest(String word) {
	  if(word.length() == 1) {
	    return word;
	  }
	  return palindromeTest(word.substring(1)) + word.charAt(0);
	} 

}
