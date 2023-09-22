import java.util.Random;

/**
 * Contains the parameters and method for generating Car objects.
 * 
 * @author Ian Mays
 */
public class Factory {
	Random random = new Random();
	
	private String[] carTypes;
	private int minYear;
	private int maxYear;
	private String[] colors;
	private int minMiles;
	private int maxMiles;
	
	/**
	 * 
	 * @param types The list of car types to choose from
	 * @param minYr The minimum year for cars (inclusive)
	 * @param maxYr The maximum year for cars (inclusive)
	 * @param cols The list of colors to choose from
	 * @param minMi The minimum number of miles on each car (inclusive)
	 * @param maxMi The maximum number of miles on each car (inclusive)
	 */
	public Factory(String[] types, int minYr, int maxYr, String[] cols, int minMi, int maxMi) {
		carTypes = types;
		minYear = minYr;
		maxYear = maxYr;
		colors = cols;
		minMiles = minMi;
		maxMiles = maxMi;
	}
	
	/**
	 * Randomly generates Car objects based on the parameters given in the Factory
	 * constructor.
	 * @param n The number of cars to make
	 * @return An array of n Car objects
	 */
	public Car[] makeCars(int n) {
		Car[] cars = new Car[n];
		
		for (int i = 0; i < n; i++) {
			String carType = carTypes[random.nextInt(carTypes.length)];
			int year = minYear + random.nextInt(maxYear-minYear+1);
			String color = colors[random.nextInt(colors.length)];
			int miles = minMiles + random.nextInt(maxMiles-minMiles+1);
			
			cars[i] = new Car(carType, year, color, miles);
		}
		
		return cars;
	}
}