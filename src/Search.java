import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Search {

	public static void main(String[] args) throws IOException {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("do your weather research from around the world in fahrenheit: ");
			String search = sc.next();
			Document doc = Jsoup
					.connect("https://www.google.com/search?q=what is the weather " + search + " in fahrenheit")
					.get();

			Elements elements = doc.getElementsByClass("wob_t TVtOme");

			for (Element obj : elements) {
				System.out.println("weather in fahrenheit: " + obj.text() + "°F");
			}

			System.out.println("Do you wanna repeat?[Y/N]");
			char rp = sc.next().charAt(0);
			rp = Character.toUpperCase(rp);
			if (rp == 'Y') {
				i = 0;
			} else {
				i = 1;
			}

		} while (i == 0);
		sc.close();
	}

}