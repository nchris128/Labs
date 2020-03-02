
public class Recursion {
	public static void vowels(String x) {
		int vowelcount = 0;
		for(int i = 0 ;i < x.length() ;i++) {
			switch (x.charAt(i)){
			case 'a': vowelcount++; break;
			case 'e': vowelcount++; break;
			case 'i': vowelcount++; break;
			case 'o': vowelcount++; break;
			case 'u': vowelcount++; break;
			case 'A': vowelcount++; break;
			case 'E': vowelcount++; break;
			case 'I': vowelcount++; break;
			case 'O': vowelcount++; break;
			case 'U': vowelcount++; break;
			case 's': System.out.println("heyo"); break;
			}
		}
		System.out.println("Checking the number of vowels in \"" + x +"\" which is: " + vowelcount);
	}
public static void main(String[] args) {
	vowels("Hewo world");
}
}
