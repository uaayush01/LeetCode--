class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);

            if (ci >= 'A' && ci <= 'Z') {
                ci = (char)(ci + 32);
            }
            if (cj >= 'A' && cj <= 'Z') {
                cj = (char)(cj + 32);
            }

            if(cheek(ci) && cheek(cj)){
                if(ci != cj){
                    return false;
                } else {
                    i++;
                    j--;
                }
            } else {
                if(!cheek(ci)){
                    i++;
                }
                if(!cheek(cj)){
                    j--;
                }
            } 
        }
        return true;
    }

    public boolean cheek(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return true;
        }
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
}

 // simpler but less optimized approach
//     public boolean isPalindrome(String s) {
//        if(s.equals(" ")){
//            return true;
//        }
//        s=s.replaceAll("[^a-zA-Z0-9]","");
//        s=s.toLowerCase();
//         StringBuilder rev = new StringBuilder(s);
//         rev.reverse();
//       if(s.equals(rev.toString())){
//            return true;
//        }else{
//            return false;
//        }
//     }
// }