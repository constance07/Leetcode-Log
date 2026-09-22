class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        ArrayList<Integer> intList = new ArrayList<Integer>();

        while(true){
            if(n == 0){
                break;
            }
            intList.add(n % 10);
            n /= 10;
        }
        
        for(int i: intList){
            sum += i;
            product *= i;
        }

        return product - sum;
    }
}