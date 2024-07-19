class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int idx=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                idx=i;
                break;
            }
        }
        if(idx==-1) return s.length();
        String ans = s.substring(idx,s.length()-1);
        return ans.length();
    }
}