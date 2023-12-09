public class e49 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1,4,5};
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        int sum=expectedSum - actualSum;
        System.out.println("The missing number is: " + sum);
    }
}