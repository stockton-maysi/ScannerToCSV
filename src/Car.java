/**
 * An object with properties for type, year, color, and number of miles on it.
 * 
 * @author Ian Mays
 */
public class Car {
	private String carType;
	private int year;
	private String color;
	private int miles;
	
	/**
	 * Constructs a new Car.
	 * @param type The type of car (this is vague on purpose)
	 * @param yr The year of the car
	 * @param c The car's color
	 * @param mi The number of miles on the car
	 */
	public Car(String type, int yr, String c, int mi) {
		carType = type;
		year = yr;
		color = c;
		miles = mi;
	}
	
	/**
	 * Gets the car type.
	 * @return The car type
	 */
	public String getCarType() {
		return carType;
	}
	
	/**
	 * Gets the year.
	 * @return The year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Gets the car color.
	 * @return The car color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Gets the car's miles.
	 * @return The number of miles on the car
	 */
	public int getMiles() {
		return miles;
	}
}