class Solution {
    public int[] productExceptSelf(int[] nums) {
        int init=1,end=1;
        int []pre=new int[nums.length];
        int []post=new int[nums.length];
        pre[0]=init*nums[0];
        int op[]=new int[nums.length];
        post[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i];
            post[nums.length-i-1]=post[nums.length-i]*nums[nums.length-i-1];

        }
        op[0]=init*post[1];
        for(int i=1;i<nums.length;i++){
            if(i==0){
                 op[i]=init*post[1];
            }
            else if(i==nums.length-1){
                op[i]=end*pre[i-1];
            }
            else{op[i]=pre[i-1]*post[i+1];}
        }
        return op;
        

    }
}  
