import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for temperature value and unit
        System.out.print("Enter temperature value: ");
        double tempValue = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Enter temperature unit (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = scanner.nextLine().toLowerCase();
        
        // Perform temperature conversion
        double celsius = 0, fahrenheit = 0, kelvin = 0;
        switch(originalUnit) {
            case "celsius":
                celsius = tempValue;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "fahrenheit":
                fahrenheit = tempValue;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "kelvin":
                kelvin = tempValue;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = celsiusToFahrenheit(celsius);
                break;
            default:
                System.out.println("Invalid temperature unit entered.");
                return;
        }
        
        // Display converted temperatures
        System.out.println("Converted temperatures:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
        
        scanner.close();
    }
    
    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}