class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
