package entities;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SearchGoogle {
	private String weather;
	private String time;
	private String age;
	private Document doc;
	private Elements elements;

	public SearchGoogle() {
	}

	public SearchGoogle(String weather, String time, String age) {
		this.weather = weather;
		this.time = time;
		this.age = age;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void searchWeather() throws IOException {
		doc = Jsoup.connect("https://www.google.com/search?q=what is the weather " + weather + " in fahrenheit").get();

		elements = doc.getElementsByClass("wob_t TVtOme");

		for (Element obj : elements) {
			System.out.println("\nweather in fahrenheit is: " + obj.text() + "°F");
		}
	}

	public void searchTime() throws IOException {
		doc = Jsoup.connect("https://www.google.com/search?q=what time is it in " + time).get();
		elements = doc.getElementsByClass("gsrt vk_bk dDoNo FzvWSb XcVN5d");
		for (Element obj : elements) {
			System.out.println("\nthe time in " + time + " is: " + obj.text() + "\n");
		}
	}
		
		public void searchAge() throws IOException {
			doc = Jsoup.connect("https://www.google.com/search?q=how old is " + age).get();
			elements = doc.getElementsByClass("Z0LcW XcVN5d");
			for (Element obj : elements) {
				System.out.println("\n"+age+"'s age is: " +obj.text().substring(0,2) + " years old\n");
			}

	}

}
