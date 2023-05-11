package Classes;

import java.util.*;

public class TouristPlaces {
	public static List<List<String>> getTouristPlace() {
		List<String> touristPlace = Arrays.asList("Mysore Palace", "Zoo", "Chamundi hill",
				"Krishna Raja Sagara(KRS)", "Jaganmohan Palace", "Lalitha Mahal");
		List<String> tourc = Arrays.asList("200", "75", "100","100","150","300");
		List<List<String>> tc = new ArrayList<List<String>>();
		tc.add(touristPlace);
		tc.add(tourc);
		return tc;
	}

	public static void printTouristPlace(List<String> touristPlace, List<String> tourc) {
		for (int i = 0; i < touristPlace.size(); i++) {
			System.out.println(i + 1 + " " + touristPlace.get(i)+" Cost is : "+tourc.get(i));
		}
	}
}
