class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=0,r=0;
        String s="";
        while(l<word1.length()&&r<word2.length()){
            s=s+word1.charAt(l)+word2.charAt(r);l++;r++;
        }
        if(l<word1.length()){
            s=s+word1.substring(l);
        }
        if(r<word2.length()){
            s=s+word2.substring(r);
        }
        return s;
    }
}