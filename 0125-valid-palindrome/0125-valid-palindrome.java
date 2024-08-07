class Solution {
    public boolean isPalindrome(String s) {
       if(s.equals(" ")){
           return true;
       }
       s=s.replaceAll("[^a-zA-Z0-9]","");
       s=s.toLowerCase();
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
      if(s.equals(rev.toString())){
           return true;
       }else{
           return false;
       }
    }
}