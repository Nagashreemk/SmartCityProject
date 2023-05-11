package Classes;

import java.util.*;

public class ShoppingDetails {
	public static Map<String, List<String>> getShoppingDetails() {
		Map<String, List<String>> map = new HashMap<>();
		map.put("Men's Clothings", Arrays.asList("Jeans", "T-Shirt", "Shirt", "Formal Pants"));
		map.put("Women's Clothings", Arrays.asList("Kurtas", "Saree", "Crop Tops", "Pants"));
		map.put("Kids Clothings", Arrays.asList("Jeans", "T-Shirt", "Shirt", "Frocks", "Suits"));
		map.put("Shoes", Arrays.asList("Bata", "Paragon", "Zudio", "Khadim's"));
		return map;
	}
	
	public static void printShoppingDetails(Map<String, List<String>> map) {
		List<String> key = new ArrayList<>(map.keySet());
		List<String> shopc = Arrays.asList("2000", "5000", "2500", "3000");
		for (int i = 0; i < key.size(); i++) {
			System.out.println(i + 1 + " " + key.get(i)+ " Cost is : "+shopc.get(i));
			for (String value : map.get(key.get(i))) {
				System.out.println(" : " + value);
				
			}
		}
	}

	
}
