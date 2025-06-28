import java.util.Scanner;

class multipleinstance {
    String name = "";
    int rollNumber = 0;
    int noOfSubjects = 0;
    int[] marks;
    int total = 0;
    double avg = 0;

    public void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        noOfSubjects = sc.nextInt();

        marks = new int[noOfSubjects];

        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("Enter marks in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        avg = (double) total / noOfSubjects;
    }

    public void display() {
        int max = 0;
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.println("Marks in subject " + (i + 1) + ": " + marks[i]);
            if(marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
        System.out.println("max marks:" + max);
    }
}

public class Lab4b {
    public static void main(String[] args) {
        int noOfStudents;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        noOfStudents = s.nextInt();

        multipleinstance[] objs = new multipleinstance[noOfStudents];

        for (int i = 0; i < noOfStudents; i++) {
            objs[i] = new multipleinstance();
            objs[i].accept();

            System.out.println("-----Student " + (i + 1) + "-----");
            objs[i].display();
            System.out.println();
        }
        s.close();
    }
}