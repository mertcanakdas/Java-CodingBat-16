package codingbat_16;

import java.util.Arrays;
import java.util.Random;

public class CodingBat_16 {

    public static int[] nums() {
        Random rn = new Random();
        int[] nums = new int[rn.nextInt(20) + 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rn.nextInt(10) + 1;

        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static boolean canBalance(int[] nums) {
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        
            for (int j = 0; j < nums.length; j++) {

                if ((sum2 += nums[j]) == sum / 2) {
                    return true;
                }
            }
        

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canBalance(nums()));
    }

}
