package LINEAR_SEARCH;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {12,15,78,6},
            {20,10,5,8,46},
            {45,32},
            {78,95,15},
        };
        int target = 5;

        int[]result = searchele(arr , target);

        if (result[0] == -1) {
            System.out.println("TARGET NOT FOUND");
        }
        else{
            System.out.println("TARGET FOUND AT ROW" +result[0]+ ", column" +result[1]);
        }
    }

public static int[] searchele(int[][] arr , int target){
    for (int row = 0; row < arr.length; row++) {
        for (int cols = 0; cols < arr.length; cols++) {
            if (arr[row][cols] == target) {
                return new int[]{row, cols};
            }
        }
    }
    return new int[]{-1,-1};
}

}
