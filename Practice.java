//create a java program that simulates a simple traffic light controller using ennumeration
//define an enum name traffic light with 3 constants(red, yellow, green)

package Tanmay;

import java.util.Scanner;

public class Practice {

    enum TrafficLight {
        RED, GREEN, YELLOW;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrafficLight currentLight = TrafficLight.RED; // Start with RED light

        while (true) {
            System.out.println("Current Traffic Light: " + currentLight);
            System.out.println("Choose an action:");
            System.out.println("1. Change to GREEN");
            System.out.println("2. Change to YELLOW");
            System.out.println("3. Change to RED");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    currentLight = TrafficLight.GREEN;
                    break;
                case 2:
                    currentLight = TrafficLight.YELLOW;
                    break;
                case 3:
                    currentLight = TrafficLight.RED; 
                    break;
                case 4:
                    System.out.println("Exiting the traffic light controller.");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }

}
