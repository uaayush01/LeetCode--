class Solution {
    public boolean isAnagram(String s, String t) {
        // if length of both string is not equal 
        if(s.length()!=t.length()){
            return false;
        }
        char[] str1=s.toCharArray();
        char [] str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        // alternate way
        // for(int i=0;i<s.length();i++){
        //     if(str1[i]!=str2[i]){
        //         return false;
        //     }
        // }
        // return true;
        return Arrays.equals(str1,str2);
    }
}