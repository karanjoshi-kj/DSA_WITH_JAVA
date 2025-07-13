package IMPORTANT_QUESTIONS;


public class ReverseArray {
    static void Reverse(int[]arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end ) {  // KEEP RUNNING THE START INDEX UNTIL IT BECOMES EQUAL TO OR GREATER THAN THE INDEX . 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

     public static void main(String[] args) {
        int[] arr = {12,24,36,48,60};

     System.out.println("ORIGINAL ARAY");
     printArray(arr);

     Reverse(arr);
     System.out.println("REVERSED ARRAY");
     printArray(arr);
    }

    static void printArray(int[]arr){
        for (int num : arr) {
            System.out.println(num +" ");
        }
        System.out.println();
    }
}