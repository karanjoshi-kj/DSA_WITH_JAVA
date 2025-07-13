package ARRAY_METHODS;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("ENTER THE ELEMENTS");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(00);
        list.add(50);
        list.add(60);
        list.add(50);
        list.add(10);
        list.add(80);
        list.add(140);
        list.add(105);
        list.add(1061);

        // TAKING INPUT:
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        //TO GET AN ITEM AT ANY INDEX:
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // PASS INDEX HERE , LIST[INDEX] SYNTAX WILL NOT WORK HERE :.......:
        }
        System.out.println(list);
        sc.close();
    }
}
