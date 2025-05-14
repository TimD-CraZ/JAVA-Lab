package Tanmay;

import java.util.Scanner;

public class Lab3 {
    public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public boolean compareStringsIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public String concatenateString(String str1, String str2) {
        return str1.concat(str2);
    }

    public String stringcpy(String str1) {
        String str = new String(str1);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String s1 = sc.nextLine();

        System.out.println("Enter string 2: ");
        String s2 = sc.nextLine();

        Lab3 obj = new Lab3();

        System.out.println("Compare strings: " + obj.compareStrings(s1, s2));
        System.out.println("Compare strings(Ignore case): " + obj.compareStringsIgnoreCase(s1, s2));
        System.out.println("Concatenate strings: " + obj.concatenateString(s1, s2));

        String cpystr = obj.stringcpy(s1);

        System.out.println("copied string is: " + cpystr);
    }
}
