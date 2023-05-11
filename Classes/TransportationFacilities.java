package Classes;

import java.util.*;

public class TransportationFacilities {
	public static List<List<String>> getTransportation() {
		List<String> transportation = new ArrayList<String>();
		List<String> transportationCost = Arrays.asList("100", "75", "50", "60", "150");
		transportation.add("Train");
		transportation.add("Bus");
		transportation.add("Metro Train");
		transportation.add("Auto");
		transportation.add("Taxi Cab");
		List<List<String>> transc = new ArrayList<List<String>>();
		transc.add(transportation);
		transc.add(transportationCost);
		return transc;
	}

	public static void printTransport(List<String> transportation, List<String> transportationCost) {
		for (int i = 0; i < transportation.size(); i++) {
			System.out.println(i + 1 + " " + transportation.get(i) + " Cost is : " + transportationCost.get(i));
		}
	}
}
