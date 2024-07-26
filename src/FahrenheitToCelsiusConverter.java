import java.util.Scanner;
public class FahrenheitToCelsiusConverter {
     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();

            double celsius = (fahrenheit - 32) * 5/9;

            System.out.println("Temperature in Celsius: " + celsius);

            input.close();
        }
    }