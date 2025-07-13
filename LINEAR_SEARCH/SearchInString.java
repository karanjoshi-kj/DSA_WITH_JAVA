import java.util.Scanner;

public class SearchInString {

    // Function only returns true/false
    public static boolean isCharacterPresent(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input character
        System.out.print("Enter a character to search: ");
        char targetChar = scanner.next().charAt(0);

        // Use function and print result here only
        boolean result = isCharacterPresent(inputString, targetChar);

        if (result) {
            System.out.println("Character found: " + targetChar);
        } else {
            System.out.println("Character not found.");
        }

        scanner.close();
    }
}
