class Solution {
    public int numberOfSteps(int num) {
     return  findZeroes(num,0);
    }
     public int findZeroes(int num ,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
          return   findZeroes(num/2,count+1);
        }else{
           return findZeroes(num-1,count+1);
        }
      }
         } 
