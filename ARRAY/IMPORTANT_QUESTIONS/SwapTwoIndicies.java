package IMPORTANT_QUESTIONS;

import java.util.Arrays;

public class SwapTwoIndicies {
    public static void main(String[] args) {
        int[] arr = { 12, 24, 36, 48, 60 };
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 3);
        System.out.println("AFTER SWAPPING TWO INDICES");
        System.out.println(Arrays.toString(arr)); // Arrays.toString(arr) is used to convert 1D array into a string so we can print it's content easily . 
        //NOTE: IT IS ONLY USED IN 1D ARRAY .
                                                  
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
