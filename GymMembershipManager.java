import java.util.Scanner;

public class GymMembershipManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = 2000;

        System.out.println("---Gym Membership Menu---");
        System.out.println();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Active membership:");
        boolean isActive = sc.nextBoolean();

        System.out.print("Enter duration(in months): ");
        int duration = sc.nextInt();

        System.out.println("---Member Details--");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Duration: " + duration);
        if (isActive) {
            System.out.println("Membership status: Active");
            System.out.println("Membership fee: $" + (duration * fee));
        } else {
            System.out.println("Membership status: Inactive");
        }

        sc.close();
    }
}

