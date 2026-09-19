class Solution {
    public int countKeyChanges(String s) {
        int counter = 0;
        char[] characters = s.toLowerCase().toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (i >= 1) {
                if (characters[i] != characters[i - 1]) {
                    counter++;
                }
            }
        }

        return counter;
    }
}