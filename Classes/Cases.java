package Classes;

import java.util.*;

public class Cases {
	static Scanner scanner = new Scanner(System.in);

	public static String[] Case1() {
		System.out.println("You have selected 1 : ");
		List<List<String>> hc = Hotels.getHotels();
		System.out.println("\n ==== Hotels in Mysuru City are : ===");
		Hotels.printHotel(hc.get(0), hc.get(1));
		String hotelSelected = "";
		String hotelCost = "";
		System.out.println("Please select your Hotel number");
		boolean select = false;
		while (!select) {
			int input = scanner.nextInt();
			if (input <= hc.get(0).size() && input > 0) {
				select = true;
				hotelSelected = hc.get(0).get(input - 1);
				hotelCost = hc.get(1).get(input - 1);
			} else {
				System.out.println("You have entered wrong Hotel number");
				System.out.println("Please enter the correct Hotel number");
			}
		}
		return new String[] { hotelSelected, hotelCost };
	}

	public static String[] Case2() {
		System.out.println("You have selected 2 : ");
		List<List<String>> transc = TransportationFacilities.getTransportation();
		System.out.println("\n ==== Transportation Facilities in Mysuru City are : ====");
		TransportationFacilities.printTransport(transc.get(0), transc.get(1));
		String transportationSelected = "";
		String transportCost = "";
		System.out.println("Please select your Transportation number");
		boolean select = false;
		while (!select) {
			int input = scanner.nextInt();
			if (input <= transc.get(0).size() && input > 0) {
				select = true;
				transportationSelected = transc.get(0).get(input - 1);
				transportCost = transc.get(1).get(input - 1);
			} else {
				System.out.println("You have entered wrong Transportation number");
				System.out.println("Please enter the correct Transportation number");
			}
		}
		return new String[] { transportationSelected, transportCost };
	}

	public static String[] Case3() {
		System.out.println("You have selected 3 : ");
		List<List<String>> ac = AirTicketBooking.getAirTickets();
		System.out.println("\n ==== Air Ticket Booking details in Mysuru City are : ====");
		AirTicketBooking.printAirTicket(ac.get(0), ac.get(1));
		String airTicketBookingSelected = "";
		String airCost = "";
		System.out.println("Please select your Air Ticket Booking number");
		boolean select = false;
		while (!select) {
			int input = scanner.nextInt();
			if (input <= ac.get(0).size() && input > 0) {
				select = true;
				airTicketBookingSelected = ac.get(0).get(input - 1);
				airCost = ac.get(1).get(input - 1);
			} else {
				System.out.println("You have entered wrong Air Ticket Booking number");
				System.out.println("Please enter the correct Air Ticket Booking number");
			}
		}
		return new String[] { airTicketBookingSelected, airCost };
	}

	public static String[] Case4() {
		System.out.println("You have selected 4 : ");
		List<List<String>> tc = TouristPlaces.getTouristPlace();
		System.out.println("\n ==== Tourist Places in Mysuru City are : ====");
		TouristPlaces.printTouristPlace(tc.get(0), tc.get(1));
		String touristPlaceSelected = "";
		String touristCost = "";
		System.out.println("Please select your Tourist place number");
		boolean select = false;
		while (!select) {
			int input = scanner.nextInt();
			if (input <= tc.get(0).size() && input > 0) {
				select = true;
				touristPlaceSelected = tc.get(0).get(input - 1);
				touristCost = tc.get(1).get(input - 1);
			} else {
				System.out.println("You have entered wrong Tourist place number");
				System.out.println("Please enter the correct Tourist place number");
			}
		}
		return new String[] { touristPlaceSelected, touristCost };
	}

	public static String Case5() {
		System.out.println("You have selected 5 : ");
		List<String> city = CityNews.getCityNews();
		System.out.println("\n==== City News in Mysuru are : ====");
		CityNews.printCityNews(city);
		String cityNewsSelected = "";
		return cityNewsSelected;
	}

	public static String[] Case6() {
		System.out.println("You have selected 6 : ");
		Map<String, List<String>> map = ShoppingDetails.getShoppingDetails();
		System.out.println("\n ==== Shopping Details in Mysuru City are : ====");
		ShoppingDetails.printShoppingDetails(map);
		boolean select = false;
		System.out.println("Please select Shopping Details");
		String shoppingDetailsSelected = "";
		String shopCost = "";
		List<String> shopc = Arrays.asList("2000", "5000", "2500", "3000");
		while (!select) {
			List<String> key = new ArrayList<>(map.keySet());
			int input = scanner.nextInt();
			if (input <= key.size() && input > 0) {
				select = true;
				shoppingDetailsSelected = key.get(input - 1);
				shopCost = shopc.get(input - 1);
			} else {
				System.out.println("You have entered wrong Shopping number");
				System.out.println("Please enter the correct Shopping number");
			}
		}
		return new String[] { shoppingDetailsSelected, shopCost };
	}
}
