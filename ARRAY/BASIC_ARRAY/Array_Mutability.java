package BASIC_ARRAY;
import java.util.Arrays;
public class Array_Mutability {
    public static void main(String[] args) {
        int[] nums = {3 , 4 , 12 , 84 };
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
