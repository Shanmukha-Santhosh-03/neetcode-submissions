class Solution {
    public boolean isAnagram(String s1, String s2) {
        Scanner sc=new Scanner(System.in);
        char []c1=s1.toCharArray();
        char []c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length==c2.length){
            for(int i=0;i<c1.length;i++){
                if(c1[i]!=c2[i]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
        

    }
}
