class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxLength = 0;
        int counter = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                counter++;
            }else if(nums[i] == nums[i-1]){
                continue;
            }else{
                counter = 0;
            }
            if(counter > maxLength){
                maxLength = counter;
            }
        }

        if(nums.length == 0){
            return 0;
        }

        return maxLength + 1;
    }
}