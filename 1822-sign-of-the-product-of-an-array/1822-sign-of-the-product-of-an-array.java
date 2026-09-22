class Solution {
    public int arraySign(int[] nums) {
        int product = 1;

        for(int i: nums){
            product *= signFunction(i);
        }

        return product;
    }

    public int signFunction(int num){
        if(num > 0){
            return 1;
        }else if(num < 0){
            return -1;
        }
        return 0;
    }
}