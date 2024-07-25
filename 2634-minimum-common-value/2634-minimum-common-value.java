class Solution {
    public int getCommon(int[] nums1, int[] nums2) { 
        if(nums1[nums1.length-1]<nums2[0]|| nums2[nums2.length-1]<nums1[0]){
            return -1;
        }
       int i , j=i=0;
       while(i<nums1.length && j<nums2.length){
        if(nums1[i]<nums2[j]) i++;
        else if(nums1[i]>nums2[j])j++;
        else return nums1[i];
       }
       return -1;
    }
}