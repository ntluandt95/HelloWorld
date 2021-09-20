import java.util.Scanner;

public class ExerciseOne {
	static int low = 0;
	static int hight = 0;
	static int randomNum=0;
	static int randomNumber(int low, int hight) {
		return (int)(Math.random()*(hight-low+1))+low;
	}
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Low Number: ");
		low = sc.nextInt();
		System.out.println("Enter Hight Number: ");
		hight = sc.nextInt();
		randomNum = randomNumber(low, hight);
		return;
	}
	static void guess() {
		int guess=0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("Make a guess");
			while(!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Please enter a number: ");
			}
			guess = sc.nextInt();
			if(guess>randomNum) {
				System.out.println("Too Hight...");
			}else if(guess<randomNum) {
				System.out.println("Too Low...");
			}else{
				System.out.println("You Win!!!");
				break;
			}
		}
		return;
	}
	public static void main(String[] args) {
		
		input();
		guess();
		
		
	}
}