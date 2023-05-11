package Classes;

import java.util.ArrayList;
import java.util.List;

public class CityNews {
	public static List<String> getCityNews() {
		List<String> city = new ArrayList<String>();
		city.add("Today's Weather is Sunny day and temperature is 26 degree celcius");
		city.add("Mysore Dasara is the Nadahabba (state festival) of the state of Karnataka in India. "
				+ "It is a 10-day festival, starting with nine nights called Navaratri and the last day being Vijayadashami");
		city.add("Sri Chamundeshwari Temple is about 13 kms from Mysuru, which is a prominent city in Karnataka State, India. "
				+ "Sri Chamundeshwari Temples is famous not only in India but also abroad.");
		city.add("The dam built across the river Kaveri at Kannambadi, initially called as 'Kannambadi Katte', was later named as Krishnaraja Sagara in 1917 after the king Krishnaraja Odeya IV."
				+ " The Brindavan Gardens located at the bottom of the dam site has made this place world famous");
		return city;
	}
	
	public static void printCityNews(List<String> city) {
		for (int i = 0; i < city.size(); i++) {
			System.out.println(i + 1 + " " + city.get(i));
		}
	}
}
