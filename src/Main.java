import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = scan.nextLine();
        int firstStringLength = firstString.length();
        System.out.println("String length: " + firstStringLength);
        int halfSubstring = (firstStringLength / 2);

        System.out.println("First half: " + firstString.substring(0,halfSubstring));
        System.out.println("Second half: " + firstString.substring(halfSubstring,firstStringLength));

        System.out.print("Enter second string: ");
        String secondString = scan.nextLine();
        int secondStringLength = secondString.length();
        if (firstStringLength > secondStringLength) {
            System.out.println(firstString + " is longer");
        }   else if (firstStringLength == secondStringLength) {
            System.out.println("Both strings have the same length");
        }   else if (firstStringLength < secondStringLength) {
            System.out.println(secondString + " is longer");
        }

        if (firstString.equals(secondString)) {
            System.out.println("Both strings have the exact same characters");
        }  else if (firstString.compareTo(secondString) > 0) {
            System.out.println(secondString + " is first alphabetically");
        }  else if (firstString.compareTo(secondString) < 0) {
            System.out.println(firstString + " is first alphabetically");
        }

        int isFound = firstString.indexOf(secondString);
        if (isFound == -1) {
            System.out.println(secondString + " is NOT found in " + firstString);
        }   else {
            System.out.println(secondString + " is found in " + firstString + " at index " + isFound);
        }
    }
}
