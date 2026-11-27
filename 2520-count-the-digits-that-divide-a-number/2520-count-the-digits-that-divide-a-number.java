class Solution {
    public int countDigits(int num) {
        int sum = 0;
        int value = num;
        
        //121
        while(value > 0){
            if(num % (value % 10) == 0){
                sum++;
            }

            value /= 10;
        }

        return sum;
    }
}