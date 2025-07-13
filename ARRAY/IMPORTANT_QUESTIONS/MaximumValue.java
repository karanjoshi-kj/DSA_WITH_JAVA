package IMPORTANT_QUESTIONS;

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr ={12,24,54,98,4,5};
   

        /*
         * **********LOGIC:
         * INITIALLY WE ARE ASSUMING THAT OUR FIRST ELEMENT IS THE MAXIMUM ELEMENT .
         * THEN WE ITERATE OVER EACH ELEMENT IN THE ARRAY AND UPDATE THE MAXIMUM VALUE .
         */
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
       System.out.println("MAXIMUM VALUE" +maxVal);
    }
}
