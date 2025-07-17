//             # LEETCODE PROBLEM 1295 #

package LINEAR_SEARCH;

public class EvenDigitCount {
    public static void main(String[] args) {
        int[] nums = {12,4,5,7645};
        int result = FindNum(nums);
        System.out.println("NUMBER OF EVEN DIGITS IN THE ARRAY :" +result);
    }
    public static int FindNum(int[] nums){
        int count = 0 ;

        for(int num : nums){
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count ;
    }
    public static boolean hasEvenDigits(int num){
        int digits = 0;

        while (num > 0) {
            digits ++;
            num = num / 10;
        }
        return digits % 2 == 0;
    }
}
