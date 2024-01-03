package codSoftTasks;


import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int number = random.nextInt(0, 1000);

		String play;
		do {
			System.out.println("i have choosen the number between 0-1000, can you guess it ?");
			int chances = 2
					;

			int trial = 1;

			while (trial <= chances) {

				int guess = scanner.nextInt();
				if (guess == number) {
					System.out.println("Congratulations, your guess is correct");
					break;
				} else if (guess < number)
					System.out.println("your guess is too low,try again");
				else if (guess > number)
					System.out.println("your guess is too high,try again");
				trial++;
			}
			System.out.println("do you wanna play again?(yes/no)");

			play = scanner.next();
			play = play.toLowerCase();
			System.out.println(play);
		} while (play.equals("yes"));

		System.out.println("thanks for playing");

	}
}	      
