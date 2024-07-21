class Solution {
    public int numIdenticalPairs(int[] nums) {
      int ans=0;
      int cnt[]=new int[101];
      for(int a:nums){
        ans+=cnt[a]++;
      }
        return ans;
    //  1ms approach
    //  int ans = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] == nums[j]) {
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
}
}