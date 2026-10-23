class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String word: strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            List<String> anagramGroup = anagrams.getOrDefault(key, new ArrayList<>());
            anagramGroup.add(word);
            anagrams.put(key, anagramGroup);
        }

        return new ArrayList<>(anagrams.values());
    }
}