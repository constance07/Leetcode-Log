class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int middle = nums[nums.length/2];
        int moves = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == middle){
                continue;
            }else{
                moves += Math.abs((middle - nums[i]));
            }   
        }
        return moves;
    }
}