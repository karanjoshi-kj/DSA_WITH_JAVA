package BASIC_ARRAY;
import java.util.Scanner;

public class Array_Using_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[5];

        // Initial values (not needed if taking input)
        arr[0] = 61;
        arr[1] = 65;
        arr[2] = 64;
        arr[3] = 68;
        arr[4] = 55;

        System.out.println("Value at index 3: " + arr[3]);

        // INPUT USING FOR LOOP
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }


        // OUTPUT USING FOR LOOP
        System.out.println("Values using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // line break

        // OUTPUT USING FOR-EACH LOOP
        System.out.println("Values using for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        in.close();
    }
}
