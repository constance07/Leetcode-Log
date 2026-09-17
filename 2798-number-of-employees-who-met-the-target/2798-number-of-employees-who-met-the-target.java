class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int metTargetCount = 0;

        for(int i = 0; i < hours.length; i++){
            if(hours[i] >= target){
                metTargetCount++;
            }
        }

        return metTargetCount++;
    }
}