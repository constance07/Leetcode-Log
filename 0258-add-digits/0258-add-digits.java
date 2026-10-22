class Solution {
    public int addDigits(int num) {
        int sum = 0;

        while(true){
            sum = 0;
            sum += num / 10;
            sum += num % 10;
            num = sum;
            if(num < 10){
                break;
            }
        }
        return sum;
    }
}