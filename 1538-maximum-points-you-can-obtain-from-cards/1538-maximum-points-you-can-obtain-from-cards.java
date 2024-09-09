class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int rsum=0;
       int lsum=0;
       int n=cardPoints.length;
       int maxScore=0;
       int r=n-1;
       for(int i=0;i<k;i++){
        lsum+=cardPoints[i];
       }
       maxScore=lsum;

       for(int i=k-1;i>=0;i--){
        lsum-=cardPoints[i];
        rsum+=cardPoints[r];
        r--;
        maxScore=Math.max(maxScore,lsum+rsum);
       }
       return maxScore;
    }
}