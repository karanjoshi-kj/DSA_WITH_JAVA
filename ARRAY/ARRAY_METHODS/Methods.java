package ARRAY_METHODS;

import java.util.ArrayList;

public class Methods {

    public static void main(String[] args) {
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
        System.out.println(list.contains(40545)); // IT WILL SHOW FALSE
        System.out.println(list);
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);// IT WILL REMOVE 30..
    }
}

