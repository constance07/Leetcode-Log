class Solution {
    public int countDigits(int num) {
        int digits = 0;
        int val = num;

        while(true){
            if(val == 0){
                break;
            }

            if(num % (val % 10) == 0){
                digits++;
            }

            val = val/10; 
        }

        return digits;
    }
}