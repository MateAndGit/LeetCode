class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            
            int[] counts = new int[26];
            for(char ch : str.toCharArray()) {
                counts[ch - 'a']++;
            }
            String key = Arrays.toString(counts);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}