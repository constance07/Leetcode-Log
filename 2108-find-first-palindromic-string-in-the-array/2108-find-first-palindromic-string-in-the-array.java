class Solution {
    public String firstPalindrome(String[] words) {
        boolean sameLetter = false;

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == words[i].charAt(words[i].length() - 1 - j)) {
                    sameLetter = true;
                }else{
                    sameLetter = false;
                    break;
                }
            }

            if (sameLetter) {
                return words[i];
            }
        }
        return "";
    }
}