class Solution {
    public int mostWordsFound(String[] sentences) {
        int words = 1;
        int max = 0;

        for(int i = 0; i < sentences.length; i++){
            char[] letters = sentences[i].toCharArray();

            for(int j = 0; j < sentences[i].length(); j++){
                if(letters[j] == ' '){
                    words++;
                }
            }

            if(words > max){
                max = words;
            }

            words = 1;
        }

        return max;
    }
}