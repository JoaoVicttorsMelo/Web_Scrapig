package program;

import java.io.IOException;
import java.util.Scanner;

import entities.SearchGoogle;

public class Search {

	public static void main(String[] args) throws IOException {
		int y = 0;
		Scanner sc = new Scanner(System.in);
		SearchGoogle sci = new SearchGoogle();

		do {

			System.out.print("Do your weather research from around the world in fahrenheit: ");
			String weather = sc.next();
			System.out.print("\nDo your time research from around the world: ");
			String time = sc.next();
			System.out.print("\nHow old is: ");
			sc.nextLine();
			String age = sc.nextLine();
			

			sci = new SearchGoogle(weather, time,age);

			sci.searchWeather();
			sci.searchTime();
			sci.searchAge();

			System.out.print("\nDo you wanna repeat?[Y/N]: ");
			char rp = sc.next().charAt(0);
			rp = Character.toUpperCase(rp);
			if (rp == 'Y') {
				y = 0;
			} else {
				y = 1;
			}
		} while (y == 0);
		sc.close();
	}

}