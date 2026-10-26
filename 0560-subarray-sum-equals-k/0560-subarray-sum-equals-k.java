class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int arrays = 0;

        for(int i = 0; i < nums.length; i++){
            sum = 0;
            if(nums[i] == k){arrays++;}
            sum = nums[i];
            
            for(int j = i + 1; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    arrays++;
                }
            }
        }

        return arrays;
    }
}