class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        
        String rev="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                rev=rev+s.charAt(i);
            }
        }
        int l=0,r=rev.length()-1;
        while(l<r){
            if(rev.charAt(l)==rev.charAt(r)){
                l++;r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
