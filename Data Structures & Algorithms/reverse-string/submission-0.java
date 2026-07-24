class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r){
            char q=s[l];
            s[l]=s[r];
            s[r]=q;
            l++;r--;
        }
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}