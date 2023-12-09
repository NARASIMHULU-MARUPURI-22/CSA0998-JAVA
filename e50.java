public class e50 {

    public static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];  // Initialize maxSum with the first element of the array
        int currentSum = nums[0];  // Initialize currentSum with the first element of the array

        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to include the current element or start a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 9, -4, 5, -5, 2, 1, -3, 4};

        int maxSum = maxSubArraySum(nums);

        System.out.println("The maximum sum of a subarray is: " + maxSum);
    }
}
