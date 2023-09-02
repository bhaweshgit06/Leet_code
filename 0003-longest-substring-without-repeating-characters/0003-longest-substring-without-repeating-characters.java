import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1)return 1;
int count = 0;
int maxCount = 0;
HashMap<Character,Integer> map = new HashMap<>();

for(int i = 0; i < s.length(); i++){
    char c = s.charAt(i);
if(map.containsKey(c)){
   if(count> maxCount){
       maxCount = count;
   }
   int x = i - map.get(c)-1 ;
   if(x< count){
        count = x ;
   }
    
 //   map.clear();
    map.put(c, i);
}else{
    map.put(c,i);
}
count++;
}
if(count> maxCount){
    maxCount = count;
}
return maxCount;

    }
}