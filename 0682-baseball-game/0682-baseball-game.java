class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {

            if(operations[i].equals("+") && record.size() >= 2){
                record.add((record.get(record.size() - 1)) + (record.get(record.size() - 2)));
            }else if(operations[i].equals("D") && record.size() >= 1){
                record.add(((record.get(record.size() - 1)) * 2));
            }else if(operations[i].equals("C") && record.size() >= 1){
                record.remove(record.size() - 1);
            }else if(operations.length > 0){
                record.add(Integer.parseInt(operations[i]));
            }
        }//5, 10
        
        for (int i : record) {
            sum += i;
        }

        return sum;

    }
}