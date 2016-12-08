package map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryAndCity {

	public static void main(String[] args) {
		
		 Map<Country, List<City>> countryCity = populate();
		// Country country1 = new Country("Romania", 67);
		for(Country cd: countryCity.keySet()) {
			List<City> cities1 = countryCity.get(cd);
			System.out.println(cd.getName() + ": " + cities1.size());
			System.out.println("_____________________");
			for(City d : cities1) {
				System.out.println(d.getName());
			}
			
		}
	}
	
	private static Map<Country, List<City>> populate(){
		City city1 = new City("Bucharest", 1000);
		Country country1 = new Country("Romania", 67);
		Map<City, Long> harta = new HashMap<>();
		Map<Country, List<City>> countryCity = new HashMap<>();

		harta.put(city1, 167l);
		City city2 = new City("Buc", 1000);
		City city3 = new City("Bucha", 1000);
		harta.put(city2, 167l);
		harta.put(city3, 167l);
		List<City> cities = new ArrayList<>();
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		
		countryCity.put(country1, cities);
		

//		for (City c : harta.keySet()) {
//			System.out.println(c + ": "+ harta.get(c));
//		}
		return countryCity;
	}
 
}
