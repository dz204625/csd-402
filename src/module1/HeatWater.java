package module1;
import java.util.Scanner;

public class HeatWater {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt the user for the initial temperature
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = scanner.nextDouble();

        // Prompt the user for the final temperature
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy required to heat the water
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy required to heat the water is: " + energy + " Joules");

        scanner.close();
    }
}
