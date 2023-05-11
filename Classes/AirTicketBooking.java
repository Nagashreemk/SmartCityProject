package Classes;

import java.util.*;

public class AirTicketBooking {
	public static List<List<String>> getAirTickets() {
		List<String> airTicket = Arrays.asList("Air India", "AirBus", "Vistara", "IndiGo", "GoFirst");
		List<String> airCost =  Arrays.asList("7000","5000","2000","6000","4500");
		List<List<String>> ac = new ArrayList<List<String>>();
		ac.add(airTicket);
		ac.add(airCost);
		return ac;
	}

	public static void printAirTicket(List<String> airTicket, List<String> airCost) {
		for (int i = 0; i < airTicket.size(); i++) {
			System.out.println(i + 1 + " " + airTicket.get(i) + " Cost is : " + airCost.get(i));
		}
	}
}