package BASIC_ARRAY;
import java.util.Scanner;

public class TWO_D_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int rows = sc.nextInt();

        System.out.println("ENTER THE NUMBER OF COLUMNS");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("ENTER THE ROW-WISE ELEMENTS");

// LOOP FOR TAKING INPUT 
        for (int i = 0; i < rows; i++) {    //PAHELI RO SE START KARO JAB TAK KA ROWS KHATHAM NA HO JAYEE
            for (int j = 0; j < cols; j++) {    // HAR ROW KW ANDAR CO;UMN MAI JAOO LEFT TO RIGHT 
                System.out.println("a [" + i + "] [" + j + "] = ");
                arr[i][j] = sc.nextInt();   // i-th , j-th COLUMN ME VALUE RAKHO 
            }
        }

// LOOP FOR DISPLAY THE ARRAY
        System.out.println("YOUR 2D ARRAY");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
