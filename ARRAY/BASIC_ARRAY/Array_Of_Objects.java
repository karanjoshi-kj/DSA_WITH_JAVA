package BASIC_ARRAY;
import java.util.Arrays;
import java.util.Scanner;
public class Array_Of_Objects {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[]str =  new String[4];
    System.out.println("ENTER FOUR STRINGS (ONE PER LINE) :");
    
    for (int i = 0; i < str.length; i++) {
        str[i] = sc.next();
    }
    System.out.println(Arrays.toString(str));

    //MODIFY
    str[1] = "KARAN";  
     System.out.println(Arrays.toString(str));
     sc.close();
}   
}
