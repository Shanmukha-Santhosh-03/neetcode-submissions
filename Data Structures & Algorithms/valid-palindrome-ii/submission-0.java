class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                String sl=s.substring(l+1,r+1);
                String sr=s.substring(l,r);
                return sl.equals(new StringBuilder(sl).reverse().toString()) ||
                       sr.equals(new StringBuilder(sr).reverse().toString());
            }
            l++;
            r--;
        }
        return true;
    }
}