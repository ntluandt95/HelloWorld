public class ExerciseTwo {
	public static char[] getAlphabetArray() {
		char[] arr = new char[26];
		char c = 'a';
		int i = 0;
		do {
			arr[i++] = c++;
		}while(c <= 'z'); 
		return arr; 
	}
	public static void main(String[] args) {
		char[] arr = getAlphabetArray();
		System.out.println(arr);
	}
}