class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> frequency = new HashMap<>();

        for(int i = 0; i < sentence.length(); i++){
            char[] letters = sentence.toCharArray();
            frequency.put(letters[i], 0);
        }

        if(frequency.size() == 26){
            return true;
        }

        return false;

    }
}