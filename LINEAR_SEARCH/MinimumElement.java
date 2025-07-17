package LINEAR_SEARCH;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {12,5,45,78};
        int min = MinEle(arr);
        System.out.println("THE MINIMUM ELEMENT IN THE ARRAY IS :" +min);
    }
    public static int MinEle(int[]arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
