class Solution {
    public int minBitFlips(int start, int goal) {
        if(start==0 && goal==0){
            return 0;
        }
        int xorNumber = (start ^ goal);
        int counter =0;
        while(xorNumber>0){
            if((xorNumber&1)==1) counter++;
            xorNumber >>=1;
        }
        return counter;
    }
}