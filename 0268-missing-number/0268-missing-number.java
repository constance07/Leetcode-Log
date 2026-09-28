class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // if (i + 1 < nums.length) {
            //     if (nums[i + 1] != nums[i] + 1) {
            //         return nums[i] + 1;
            //     }
            // }
            if(i != nums[i]){
                return i;
            }
        }

        return nums.length;
    }
}