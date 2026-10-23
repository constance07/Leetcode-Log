class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] absNum = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){nums[i] *= -1;}
            absNum[i] = nums[i] * nums[i];
            System.out.println(absNum[i]);
        }
        
        Arrays.sort(absNum);
        return absNum;
    }
}