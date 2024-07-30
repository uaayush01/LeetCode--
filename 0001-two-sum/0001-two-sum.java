class Solution {
    public int[] twoSum(int[] nums, int target) {
        // bruteforce
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int a[]={i,j};
                    return a;
                }
            }
        }
        return null;

        // optimal
        // for(int i=1;i<nums.length;i++)
        // {
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[j]+nums[j-i]==target)
        //         {
        //             return new int[]{j,j-i};
        //         }
        //     }
        // }
        // return null;
    }
}