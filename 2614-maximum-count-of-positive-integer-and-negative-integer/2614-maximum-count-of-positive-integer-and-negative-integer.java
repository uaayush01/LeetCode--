class Solution {
    public int maximumCount(int[] nums) {
        int posiCount=0;
        int negCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
               negCount++;
            }else if(nums[i]>0){
                posiCount++;
            }
        }
        if(posiCount>negCount){
           return posiCount; 
        }else{
            return negCount;
        }
        // return posiCount;
    }
}