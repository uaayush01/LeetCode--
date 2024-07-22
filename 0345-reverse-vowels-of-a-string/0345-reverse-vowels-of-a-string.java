class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        HashSet<Character> set = new HashSet<>();
        StringBuffer str = new StringBuffer(s);

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while(i < j){
            if(set.contains(s.charAt(i)) && set.contains(s.charAt(j))){
                str.setCharAt(i, s.charAt(j));
                str.setCharAt(j, s.charAt(i));
                i++;
                j--;
            }else if(set.contains(s.charAt(i)) && !set.contains(s.charAt(j))){
                j--;
            }else if(!set.contains(s.charAt(i)) && set.contains(s.charAt(j))){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return str.toString();
    }
}