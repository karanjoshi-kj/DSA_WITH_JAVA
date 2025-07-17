package LINEAR_SEARCH;

public class MaxEleIN2DArr {
    public static void main(String[] args) {
        int[][] arr = {
            {12,5,1,7},
            {10,20,30},
            {5,44,12,20,7},
        };
         int max = FindMax(arr);
         System.out.println("THE MAXIMUM ELEMENT IN THE ARRAY IS :" +max);
    }
    public static int FindMax(int[][]arr){
        int max = arr[0][0];   // START WITH THE ELEMENT
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
