class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
     {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String Key = new String(arr);
            map.putIfAbsent(Key, new ArrayList<>());
            map.get(Key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
