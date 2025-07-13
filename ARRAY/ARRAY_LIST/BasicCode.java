// SOME BASIC METHODS ARE ALSO COVERED IN IT..:...:...::.::

package ARRAY_LIST;
import java.util.ArrayList;
import java.util.Scanner;
public class BasicCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //INITIALIZATON:
        System.out.println("ENTER THE ELEMENTS");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        //DISPLAY ELEMENTS 
        System.out.println("ARRAY LIST CONTENTS");
        for( int num : list) {
            System.out.println(num +" ");
        }
        System.out.println(list);
        sc.close();

        // BASIC METHODS:

        System.out.println("ELEMENT AT INDEX 2" +list.get(2));

        list.set(0, 55);
        System.out.println("AFTER SETTING THE LIST:" +list);

        list.remove(2);
        System.out.println("ATER REMOVING THE ELEMENT AT INDEX SECOND" +list);

    }
}
