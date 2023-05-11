package Classes;

import java.util.*;

public class Hotels {
	public static List<List<String>> getHotels() {
		List<String> hotels = new ArrayList<String>();
		List<String> hotelCost = Arrays.asList("1000", "1050", "2000", "9000", "4500", "3000", "3000", "4000", "2000",
				"1000");
		hotels.add("Hotel Mayura");
		hotels.add("Radisson Blu Plazza");
		hotels.add("Neelanjana Mahesh Prasad");
		hotels.add("Radisson Blu Plaza");
		hotels.add("Southern Star Mysore");
		hotels.add("Hotel Sandesh The Prince");
		hotels.add("Emerald Clarks Inn Suits");
		hotels.add("Jade Garden");
		hotels.add("The Green Hotel");
		hotels.add("Silent Shores");
		List<List<String>> hc = new ArrayList<List<String>>();
		hc.add(hotels);
		hc.add(hotelCost);
		return hc;
	}

	public static void printHotel(List<String> hotels, List<String> hotelCost) {
		for (int i = 0; i < hotels.size(); i++) {
			System.out.println(i + 1 + " " + hotels.get(i) + " Cost is : " + hotelCost.get(i));
		}
	}

}
