class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            while (true) {
                if (nums[i] < 10) {
                    digitSum += nums[i];
                    break;
                }

                digitSum += nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}