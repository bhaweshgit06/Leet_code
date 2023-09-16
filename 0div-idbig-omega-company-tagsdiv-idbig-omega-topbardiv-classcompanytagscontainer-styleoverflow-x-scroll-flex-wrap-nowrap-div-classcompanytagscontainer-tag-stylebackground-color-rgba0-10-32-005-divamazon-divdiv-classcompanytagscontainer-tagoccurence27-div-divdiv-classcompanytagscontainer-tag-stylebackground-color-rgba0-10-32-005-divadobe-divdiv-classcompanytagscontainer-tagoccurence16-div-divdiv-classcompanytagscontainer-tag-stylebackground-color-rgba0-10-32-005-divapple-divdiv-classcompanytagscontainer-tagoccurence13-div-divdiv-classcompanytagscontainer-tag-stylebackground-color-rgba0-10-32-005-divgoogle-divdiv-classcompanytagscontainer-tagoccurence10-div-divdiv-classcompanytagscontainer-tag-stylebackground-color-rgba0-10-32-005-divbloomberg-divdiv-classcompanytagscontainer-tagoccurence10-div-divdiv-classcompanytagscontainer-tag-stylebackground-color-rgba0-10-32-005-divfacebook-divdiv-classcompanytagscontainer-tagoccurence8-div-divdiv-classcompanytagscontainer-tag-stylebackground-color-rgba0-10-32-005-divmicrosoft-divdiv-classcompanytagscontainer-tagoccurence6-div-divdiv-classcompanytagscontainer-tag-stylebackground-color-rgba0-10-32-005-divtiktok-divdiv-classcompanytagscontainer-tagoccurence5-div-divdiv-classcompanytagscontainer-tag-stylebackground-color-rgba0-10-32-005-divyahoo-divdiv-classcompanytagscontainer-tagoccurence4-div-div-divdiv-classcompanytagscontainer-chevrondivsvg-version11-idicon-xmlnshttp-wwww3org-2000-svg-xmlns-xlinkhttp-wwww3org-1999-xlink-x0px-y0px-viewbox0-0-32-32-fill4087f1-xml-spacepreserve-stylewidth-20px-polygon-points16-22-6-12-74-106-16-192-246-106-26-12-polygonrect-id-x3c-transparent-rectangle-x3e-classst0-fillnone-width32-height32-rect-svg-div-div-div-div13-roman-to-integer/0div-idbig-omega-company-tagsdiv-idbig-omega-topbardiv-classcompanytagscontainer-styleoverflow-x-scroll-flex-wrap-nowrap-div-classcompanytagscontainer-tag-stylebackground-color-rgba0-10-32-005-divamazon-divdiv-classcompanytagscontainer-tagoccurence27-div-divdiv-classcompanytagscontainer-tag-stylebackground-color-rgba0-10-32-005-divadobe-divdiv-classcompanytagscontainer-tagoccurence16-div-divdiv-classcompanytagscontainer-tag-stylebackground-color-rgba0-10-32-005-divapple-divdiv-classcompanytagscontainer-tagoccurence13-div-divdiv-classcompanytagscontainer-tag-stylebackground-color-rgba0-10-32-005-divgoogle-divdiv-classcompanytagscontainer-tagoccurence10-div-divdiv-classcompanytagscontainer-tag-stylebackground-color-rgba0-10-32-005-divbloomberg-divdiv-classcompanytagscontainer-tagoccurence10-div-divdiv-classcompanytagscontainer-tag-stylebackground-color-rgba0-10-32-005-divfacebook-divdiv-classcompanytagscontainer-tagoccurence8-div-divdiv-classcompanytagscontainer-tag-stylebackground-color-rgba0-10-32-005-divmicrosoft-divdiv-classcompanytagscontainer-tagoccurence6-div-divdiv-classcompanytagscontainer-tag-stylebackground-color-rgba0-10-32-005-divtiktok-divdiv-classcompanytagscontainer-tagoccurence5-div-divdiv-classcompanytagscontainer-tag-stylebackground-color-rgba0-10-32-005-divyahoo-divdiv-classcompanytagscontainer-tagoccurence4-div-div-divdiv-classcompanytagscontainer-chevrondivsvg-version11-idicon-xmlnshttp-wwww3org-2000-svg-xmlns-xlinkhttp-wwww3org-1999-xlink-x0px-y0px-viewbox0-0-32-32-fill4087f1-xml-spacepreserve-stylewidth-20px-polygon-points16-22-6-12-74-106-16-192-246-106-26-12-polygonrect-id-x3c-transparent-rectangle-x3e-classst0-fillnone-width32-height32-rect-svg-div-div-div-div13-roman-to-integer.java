import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        int count = 0;
      HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
         map.put('V',5);
         map.put('X',10); 
         map.put('M',1000);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
        int digit = 0;
        
        for(int i = s.length()-1; i>0; i--){
            if(s.charAt(i)=='V' && s.charAt(i-1)=='I'){
            count += 4;
                i--;
                digit+=2;
            }
           else if(s.charAt(i)=='L' && s.charAt(i-1)=='X'){
            count += 40;
                i--;
                digit+=2;
            }
           else if(s.charAt(i)=='D' && s.charAt(i-1)=='C'){
            count += 400;
                i--;
                digit+=2;
            }
           else if(s.charAt(i)=='X' && s.charAt(i-1)=='I'){
            count += 9;
                 i--;
                 digit+=2;
            }
            else if(s.charAt(i)=='C' && s.charAt(i-1)=='X'){
            count += 90;
                digit+=2;
                i--;
            }
            else if(s.charAt(i)=='M' && s.charAt(i-1)=='C'){
            count += 900;
                digit+=2;
            i--;
            }
            else{
                count += map.get(s.charAt(i));
                digit+=1;
            }
            
            
        }
        if(digit != s.length()){
            return count + map.get(s.charAt(0));
        }else
        return count;
    }
}