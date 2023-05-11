package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		boolean exit = false;
		int totalExpenditure = 0;
		String[] hotelAndCost = { "", "" }, airTicketAndCost = { "", "" }, transportAndCost = { "", "" },
				shopAndCost = { "", "" }, touristAndCost = { "", "" };
		Scanner scanner = new Scanner(System.in);
		boolean hotelVisit = false, transVisit = false, airTicketVisit = false, tourVisit = false,
				cityNewsVisit = false, shoppingVisit = false;
		System.out.println("\n \t \t \t \t  \t *** WELCOME TO SMART CITY PROJECT *** ");

		System.out.print(" Enter your name : ");
		String userName = scanner.nextLine();

		System.out.print(" Enter you Phone number : ");
		String phone = scanner.nextLine();
		System.out.println(" User successfully logged-in.. ");

		while (!exit) {
			System.out.println("\n Hello " + userName
					+ ", please select an option to get the information to book / stay in the Historical city of Palaces MYSURU \n");
			System.out.println("----------------------------------");
			System.out.print("|        1. Hotels                |");
			if (hotelVisit) {
				System.out.println("  ->(Selected)");
			} else {
				System.out.println();
			}

			System.out.print("|        2. Transportation        |");
			if (transVisit) {
				System.out.println("  ->(Selected)");
			} else {
				System.out.println();
			}

			System.out.print("|        3. AirTicket Booking     |");
			if (airTicketVisit) {
				System.out.println("  ->(Selected)");
			} else {
				System.out.println();
			}

			System.out.print("|        4. Tourist Place         |");
			if (tourVisit) {
				System.out.println("  ->(Selected)");
			} else {
				System.out.println();
			}

			System.out.print("|        5. City News             |");
			if (cityNewsVisit) {
				System.out.println("  ->(Selected)");
			} else {
				System.out.println();
			}

			System.out.print("|        6. Shopping Details      |");
			if (shoppingVisit) {
				System.out.println("  ->(Selected)");
			} else {
				System.out.println();
			}

			System.out.println("|        7. Exit                  |");
			System.out.println("----------------------------------");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				hotelVisit = true;
				hotelAndCost = Cases.Case1();
				System.out.println(
						"You have booked " + hotelAndCost[0] + " for you stay. And your cost is " + hotelAndCost[1]);
				System.out.println();
				break;

			case 2:
				transVisit = true;
				transportAndCost = Cases.Case2();
				System.out.println("You have opted " + transportAndCost[0]
						+ " for your travel inside the city. And your cost is " + transportAndCost[1]);
				System.out.println();
				break;

			case 3:
				airTicketVisit = true;
				airTicketAndCost = Cases.Case3();
				System.out.println("You have selected " + airTicketAndCost[0] + " Happy Journey. And your cost is "
						+ airTicketAndCost[1]);
				System.out.println();
				break;

			case 4:
				tourVisit = true;
				touristAndCost = Cases.Case4();
				System.out.println("You are visiting " + touristAndCost[0] + " And the cost is " + touristAndCost[1]);
				System.out.println();
				break;

			case 5:
				cityNewsVisit = true;
				Cases.Case5();
				System.out.println();
				break;

			case 6:
				shoppingVisit = true;
				shopAndCost = Cases.Case6();
				System.out.println("You have selected " + shopAndCost[0] + ". And your cost is " + shopAndCost[1]);
				System.out.println();
				break;

			case 7:
				System.out.println("See you soon " + userName + " ...");
				exit = true;
				System.out.println();
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				System.out.println();
				break;
			}
		}

		/*
		 * System.out.println("\n *** Here is the Details of Smart City Project!! ***");
		 * System.out.println();
		 * 
		 * if (hotelSelected != null) System.out.println("You have booked" +
		 * hotelSelected);
		 * 
		 * if (transportationSelected != null) System.out.println("You have opted" +
		 * transportationSelected);
		 * 
		 * if (airTicketBookingSelected != null) System.out.println("You have selected"
		 * + airTicketBookingSelected);
		 * 
		 * if (touristPlaceSelected != null) System.out.println("You are visiting" +
		 * touristPlaceSelected);
		 * 
		 * if (shoppingDetailsSelected != null) System.out.println("You are shopping " +
		 * shoppingDetailsSelected);
		 */

//		totalExpenditure = (hotelAndCost[1] == "" ? +0 : Integer.parseInt(hotelAndCost[1]))
//				+ (airTicketAndCost[1] == "" ? +0 : Integer.parseInt(airTicketAndCost[1]))
//				+  (transportAndCost[1] == "" ? +0 : Integer.parseInt(transportAndCost[1]));

		if (!hotelAndCost[1].isEmpty())
			totalExpenditure = Integer.parseInt(hotelAndCost[1]);
		if (!airTicketAndCost[1].isEmpty())
			totalExpenditure += Integer.parseInt(airTicketAndCost[1]);
		if (!transportAndCost[1].isEmpty())
			totalExpenditure += Integer.parseInt(transportAndCost[1]);
		if (!shopAndCost[1].isEmpty())
			totalExpenditure += Integer.parseInt(shopAndCost[1]);
		if (!touristAndCost[1].isEmpty())
			totalExpenditure += Integer.parseInt(touristAndCost[1]);
		System.out.println("\n \t\t\t\t      *** Here is the Details Selected on Smart City Project ***   ");
		System.out.println(
				"\n --------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Name:" + userName + "\t\t\t\t\t\t\t\t\t\t\t           Contact: " + phone);
		// format of date and time
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		// prints current date and time
		System.out.println("Date: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);

		System.out.println(
				"\n --------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%20s %20s %20s %20s %20s %20s", "HotelBooked", "Transportation", "AirTicketBooked",
				"TouristSpotVisiting", "ShoppingDetails", "TotalExpenses");
		System.out.println(
				"\n --------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%20s %20s %20s %20s %20s %20d", hotelAndCost[0] == null ? "----" : hotelAndCost[0],
				transportAndCost[0] == null ? "----" : transportAndCost[0],
				airTicketAndCost[0] == null ? "----" : airTicketAndCost[0],
				touristAndCost[0] == null ? "----" : touristAndCost[0],
				shopAndCost[0] == null ? "----" : shopAndCost[0], totalExpenditure);
		System.out.println(
				"\n --------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\t\t\t\t\t\t                TOTAL " + (totalExpenditure));
		System.out
				.println("\n \t\t\t\t----------------Thank you for visiting Historical City MYSURU!-----------------");
		System.out.println("\t\t\t\t                                Visit Again");
	}

}
