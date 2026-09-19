class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        int[] nArr = new int[n];

        for(int i = 0; i < nArr.length; i++){
            nArr[i] = i + 1;

            if(nArr[i] % m != 0){
                num1 += nArr[i];
            }else{
                num2 += nArr[i];
            }
        }

        return num1 - num2;
    }
}