class Solution {
    public String reverseVowels(String s) {
        char [] word = s.toCharArray();

      int start=0;
      int end=s.length()-1;
      String vowels ="aeiouAEIOU";

      while(start<end){
           // move start pointer until it find vowels
           while(start<end && vowels.indexOf(word[start])== -1){
            start++;
           }
        // move end pointer till it finds vowels
        while(start<end && vowels.indexOf(word[end])==-1){
            end--;
        }
        char temp=word[start];
        word[start]=word[end];
        word[end]=temp;

        start++;
        end--;
        }
        String answer = new String(word);
        return answer;
    }
}