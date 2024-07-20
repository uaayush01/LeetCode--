class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int [] map = new int [26];
        for(char ch: ransomNote.toCharArray()){
            int idx = magazine.indexOf(ch,map[ch%26]);
            if(idx==-1){
                return false;
            }
            map[ch%26]= idx+1;
        }
        return true;


        // HashMap <Character,Integer> ans = new HashMap<>();
       
        // for(int i=0;i<magazine.length();i++){
        //     char c= magazine.charAt(i);

        //     if(!ans.containsKey(c)){
        //         ans.put(c,1);
        //     }else{
        //         ans.put(c,ans.get(c)+1);
        //     }
        // }

        // for(int i=0;i<ransomNote.length();i++){
        //     char c = ransomNote.charAt(i);

        //     if(ans.containsKey(c) && ans.get(c)>0){
        //         ans.put(c,ans.get(c)-1);
        //     }else{
        //         return false;
        //     }
        // }
        // return true;
    }
}