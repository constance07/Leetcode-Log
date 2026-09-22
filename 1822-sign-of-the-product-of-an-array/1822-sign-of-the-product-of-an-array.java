class Solution {
    public int arraySign(int[] nums) {
        int product = 1;

        for(int i: nums){
            product *= signFunc(i);
        }

        return product;
    }

    public int signFunc(int num){
        if(num > 0){
            return 1;
        }else if(num < 0){
            return -1;
        }
        return 0;
    }
}