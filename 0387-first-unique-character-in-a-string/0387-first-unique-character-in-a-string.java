class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> frequency = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            frequency.put(s.charAt(i), 0);
        }

        for(int z = 0; z < s.length(); z++){
            frequency.put(s.charAt(z), frequency.getOrDefault(0, frequency.get(s.charAt(z)) + 1));
        }

        for(int j = 0; j < s.length(); j++){
            if(frequency.get(s.charAt(j)) == 1){
                System.out.println(j);
                return j;
            }
        }

        return -1;
    }
}