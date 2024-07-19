class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1){
            return true;
        }
        char firstChar = word.charAt(0);
        boolean status = true;

    if(Character.isLowerCase(firstChar)){
        for(int i=1;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                status =false;
                break;
            }
        }
    }else if(Character.isUpperCase(firstChar) && Character.isLowerCase(word.charAt(1))){
        for(int i=2;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                status =false;
                break;
            }
        }
    }else{
        for(int i=2;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                status =false;
                break;
            }
        }
    }
     return status;

    }
}