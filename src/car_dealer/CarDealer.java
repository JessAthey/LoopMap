package car_dealer;
import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> carLot = new HashMap<String, String>();
		carLot.put("altima", "nissan");
		carLot.put("maxima", "nissan");
		carLot.put("rogue", "nissan");
		carLot.put("avalance", "chevrolet");
		carLot.put("camaro", "chevrolet");
		carLot.put("corvette", "chevrolet");
		carLot.put("civic", "honda");
		carLot.put("accord", "honda");
		
		System.out.println("Please enter the car model you are looking for: ");
		String key = input.nextLine().toLowerCase();
		if(carLot.containsKey(key)) {
			String match = carLot.get(key);
			System.out.println("You're looking for a(n): " + key + "\nThe " + match + "s are right over here");
		} else {
			System.out.println("Car not found");
		}
		

	}

}
