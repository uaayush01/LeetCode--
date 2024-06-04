class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int max=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    count++;
                }else{
                    max=Math.max(max,count);
                    count=1;
                }
            }
        }
        return Math.max(max,count);
    }
}