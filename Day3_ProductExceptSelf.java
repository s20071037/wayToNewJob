import java.util.Arrays;

public class Day3_ProductExceptSelf {
    
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        res[0] = 1;

        //prefix
        for(int i = 1;i < nums.length;i++){
            res[i] = nums[i -1] * res[i - 1]; 
        }
        int r = 1;

        //suffix
        for(int i = nums.length -1;i >= 0;i--){
            res[i] *= r;
            r *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Day3_ProductExceptSelf solution = new Day3_ProductExceptSelf();
        
        int[][] tests = {
            {1,2,3,4},
            {2,3,4,5},
            {1,1},
            {2,3,4}
        };
        
        for (int[] test : tests) {
            System.out.println("Input: " + Arrays.toString(test));
            System.out.println("Output: " + Arrays.toString(solution.productExceptSelf(test)));
            System.out.println();
        }
    }
}
