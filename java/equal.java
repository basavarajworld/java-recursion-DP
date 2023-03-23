public class equal {
    
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        return canPartitionHelper(nums, sum/2, 0);
    }
    
    private static boolean canPartitionHelper(int[] nums, int target, int index) {
        if (target == 0) {
            return true;
        }
        if (index >= nums.length || target < 0) {
            return false;
        }
        boolean included = canPartitionHelper(nums, target - nums[index], index + 1);
        boolean excluded = canPartitionHelper(nums, target, index + 1);
        return included || excluded;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 6};
        boolean canPartition = canPartition(nums);
        System.out.println(canPartition); // true
    }
}
