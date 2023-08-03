kage CheckWeather;

import java.net.URL;
import java.util.Scanner;

public class WeatherApp {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        WeatherApp app = new WeatherApp();
	        app.run();
	    }

	    private void run() {
	        int option;
	        do {
	            printMenu();
	            option = getUserOption();
	            processOption(option);
	        } while (option != 0);
	    }

	    private void printMenu() {
	        System.out.println("1. Get weather");
	        System.out.println("2. Get Wind Speed");
	        System.out.println("3. Get Pressure");
	        System.out.println("0. Exit");
	    }

	    private int getUserOption() {
	        System.out.print("Enter your option: ");
	        return scanner.nextInt();
	    }

	    private void processOption(int option) {
	        switch (option) {
	            case 1:
	                getWeather();
	                break;
	            case 2:
	                getWindSpeed();
	                break;
	            case 3:
	                getPressure();
	                break;
	            case 0:
	                System.out.println("Exiting the program. Goodbye!");
	                break;
	            default:
	                System.out.println("Invalid option. Please try again.");
	                break;
	        }
	    }

	    private void getWeather() {
	        System.out.print("Enter the date: ");
	        String date = scanner.next();
	        System.out.println("Temperature on " + date + ": XX°C");
	    }

	    private void getWindSpeed() {
	        System.out.print("Enter the date: ");
	        String date = scanner.next();
	        System.out.println("Wind speed on " + date + ": XX km/h");
	    }

	    private void getPressure() {
	        System.out.print("Enter the date: ");
	        String date = scanner.next();
	        
	        System.out.println("Pressure on " + date + ": XX hPa");
	    }

}
