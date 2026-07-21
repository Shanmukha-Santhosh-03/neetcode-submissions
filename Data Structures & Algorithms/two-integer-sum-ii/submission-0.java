class Solution {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    res.add(i+1);
                    res.add(j+1);
                }
            }
        }
        int size=res.size();
        int []re=new int[size];
        for(int i=0;i<size;i++){
            re[i]=res.get(i);
        }
        return re;
    }
}
