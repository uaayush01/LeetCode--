class Solution {
    public boolean isHappy(int n) {
      int slow=n;
      int fast=n;
      do{
          slow=find(slow);
          fast=find(find(fast));
      }while(slow!=fast);
      if(slow==1){
          return true;
      }
      return false;
    }
    private int find(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}