import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Uses a Factory to generate 1,000 Car objects and outputs the data to out.csv. Then
 * reads from in.csv and counts the number of cars with a color value of red.
 * 
 * @author Ian Mays
 */
public class TestFactory {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(new File("out.csv"));
		Scanner in = new Scanner(new File("in.csv"));
		
		String[] carTypes = {"Sedan", "Sedan", "Hatchback", "Convertible"};
		int minYear = 1974;
		int maxYear = 2023;
		String[] colors = {"Red", "Red", "Orange", "Yellow", "Green", "Blue", "Purple", "White", "Black", "Brown", "Pink"};
		int minMiles = 0;
		int maxMiles = 250000;
		
		Factory factory = new Factory(carTypes, minYear, maxYear, colors, minMiles, maxMiles);
		Car[] cars = factory.makeCars(1000);
		
		out.println("CarType,Year,Color,Miles");
		
		for (int i = 0; i < cars.length; i++) {
			out.printf("%s,%d,%s,%d\n", cars[i].getCarType(), cars[i].getYear(), cars[i].getColor(), cars[i].getMiles());
		}
		
		in.next();
		int redCars = 0;
		
		while (in.hasNext()) {
			String carColor = in.next().split(",")[2];
			
			if (carColor.equals("Red")) {
				redCars++;
			}
		}
		
		System.out.println("Number of red cars in input: " + redCars);
		
		out.close();
		in.close();
	}
}