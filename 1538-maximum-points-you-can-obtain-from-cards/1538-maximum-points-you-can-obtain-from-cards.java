class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k == cardPoints.length)
            return Arrays.stream(cardPoints).sum();
        int maxScore = 0;
        int l = cardPoints.length - k;
        int r = cardPoints.length;
        for(int i = l ; i < r ; i++)
        {
            maxScore = maxScore + cardPoints[i];
        }
        int score = maxScore;
        while(l < cardPoints.length)
        {
            score = score - cardPoints[l] + cardPoints[r % cardPoints.length];
            maxScore = Math.max(score , maxScore);
            l++;
            r++;
        }
        return maxScore;
    }
}