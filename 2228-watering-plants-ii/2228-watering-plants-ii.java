class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int res=0, n=plants.length,currA=capacityA, currB= capacityB;

        for(int i=0, j=n-1;i<j;i++,j--){
            if(currA<plants[i]){
                currA=capacityA;
                res++;
            }
            currA-=plants[i];

            if(currB<plants[j]){
                currB=capacityB;
                res++;
            }
            currB-=plants[i];
        }
        if(n%2 == 1 && currA<plants[n>>1] && currB< plants[n>>1]) res++;

        return res;
    }
}