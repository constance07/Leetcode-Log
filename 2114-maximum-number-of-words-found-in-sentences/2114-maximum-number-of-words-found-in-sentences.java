class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int words = 1;

        for(int i = 0; i < sentences.length; i++){
            words = 1;

            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    words += 1;
                }
            }

            if(words > max){
                max = words;
            }
        }

        return max;
    }
}