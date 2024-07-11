class Solution {
    public int numIdenticalPairs(int[] nums) {
      int ans=0;
      int cnt[]=new int[101];
      for(int a:nums){
        ans+=cnt[a]++;
      }
        return ans;
    }
}