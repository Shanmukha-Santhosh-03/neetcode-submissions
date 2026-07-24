class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0;i<n+m;i++){
            if(nums1[i]==0&&j!=nums2.length){
                nums1[i]=nums2[j];j++;
            }
        }
        Arrays.sort(nums1);
        for(int i=0;i<n+m;i++){
            System.out.print(nums1[i]+" ");
        }

    }
}