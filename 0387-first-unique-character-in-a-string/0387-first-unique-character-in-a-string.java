class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequency.put(c, 0);
        }
     
        for(char c : s.toCharArray()){
            frequency.replace(c, frequency.get(c) + 1);
        }

        for(char c : s.toCharArray()){
            if(frequency.get(c) == 1){
                return s.indexOf(c);
            }
        }

        return -1;

    }
}