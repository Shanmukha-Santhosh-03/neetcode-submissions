class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hp=new HashMap<>();
        for(int i:nums){
            hp.put(i,hp.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int r:hp.keySet()){
            arr.add(r);
        }
        arr.sort((a,b)->hp.get(b)-hp.get(a));
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr.get(i);
        }
        return ans;
        
    }
}
