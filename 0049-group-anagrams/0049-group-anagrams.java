class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String word: strs){
            char[] charWord = word.toCharArray();
            Arrays.sort(charWord);
            String key = new String(charWord);

            List<String> anagramGroup = anagrams.getOrDefault(key, new ArrayList<>());
            anagramGroup.add(word);
            anagrams.put(key, anagramGroup);
        }

        return new ArrayList<>(anagrams.values());
    }
}