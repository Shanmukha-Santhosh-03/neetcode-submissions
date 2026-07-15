class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> i=new HashMap<>();
        for(String s:strs){
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            String sorteds=new String(ch);
            i.putIfAbsent(sorteds,new ArrayList<>());
            i.get(sorteds).add(s);
        }
        return new ArrayList<>(i.values());
    }
}
