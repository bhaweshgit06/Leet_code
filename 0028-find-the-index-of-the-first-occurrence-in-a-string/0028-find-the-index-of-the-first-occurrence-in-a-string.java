class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()< needle.length())return -1;
        
        if(haystack.length()==1 && needle.length()==1 ){
            if(haystack.charAt(0)== needle.charAt(0)){
                return 0;
            }
        }
       
        for(int i = 0; i<= haystack.length()-needle.length();i++){
            if(needle.equals(haystack.substring(i, i + needle.length()))){
                return i;
            }
        }
        return -1;
    }
}