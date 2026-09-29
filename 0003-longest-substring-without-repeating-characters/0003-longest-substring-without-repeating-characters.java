class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
        int maxSubstring = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            counter = 0;
            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
            counter++;

            if (s.length() == 1) {
                return s.length();
            }
            for (int j = i + 1; j < s.length(); j++) {
                frequency.put(s.charAt(j), frequency.getOrDefault(s.charAt(j), 0) + 1);
                counter++;

                if (frequency.get(s.charAt(j)) == 2) {
                    frequency.clear();
                    counter--;
                    if (counter > maxSubstring) {
                        maxSubstring = counter;
                    }
                    break;
                } else if (counter > maxSubstring) {
                    maxSubstring = counter;
                }
            }
        }
        return maxSubstring;
    }
}