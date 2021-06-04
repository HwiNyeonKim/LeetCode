package easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Trial #1 : O((n^2) solution
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int first = nums[i];
                int second = nums[j];
                if (first + second == target) {
                    answer1 = i;
                    answer2 = j;
                    break;
                }
            }
        }
        return new int[] {answer1, answer2};
    }
}


