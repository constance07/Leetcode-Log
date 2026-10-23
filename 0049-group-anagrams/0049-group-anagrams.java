class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String> anagramGroup = anagrams.getOrDefault(key, new ArrayList<>());
            anagramGroup.add(word);
            anagrams.put(key, anagramGroup);
        }

        return new ArrayList<>(anagrams.values());
    }
}