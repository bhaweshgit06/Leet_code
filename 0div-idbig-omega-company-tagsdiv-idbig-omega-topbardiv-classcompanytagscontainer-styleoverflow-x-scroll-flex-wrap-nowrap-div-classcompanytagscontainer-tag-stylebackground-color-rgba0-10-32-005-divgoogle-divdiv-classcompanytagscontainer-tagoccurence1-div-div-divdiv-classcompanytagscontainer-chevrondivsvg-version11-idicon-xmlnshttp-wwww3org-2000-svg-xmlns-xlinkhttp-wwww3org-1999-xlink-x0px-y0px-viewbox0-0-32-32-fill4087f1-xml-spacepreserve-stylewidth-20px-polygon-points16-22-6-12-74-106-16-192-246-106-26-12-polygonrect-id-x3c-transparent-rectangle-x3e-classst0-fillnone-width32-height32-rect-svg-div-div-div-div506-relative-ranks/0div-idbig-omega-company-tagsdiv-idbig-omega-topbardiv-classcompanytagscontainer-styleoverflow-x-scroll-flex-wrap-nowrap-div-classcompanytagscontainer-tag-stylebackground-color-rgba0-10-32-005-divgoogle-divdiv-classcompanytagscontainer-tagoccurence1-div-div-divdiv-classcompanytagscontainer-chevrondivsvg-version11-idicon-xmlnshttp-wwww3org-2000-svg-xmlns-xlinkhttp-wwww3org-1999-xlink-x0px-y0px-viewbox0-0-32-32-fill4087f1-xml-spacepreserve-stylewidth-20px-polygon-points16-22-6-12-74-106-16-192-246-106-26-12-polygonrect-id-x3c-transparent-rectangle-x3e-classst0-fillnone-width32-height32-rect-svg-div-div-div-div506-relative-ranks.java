import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : score){
              queue.add(i);                               
        } 
        String arr[] = new String[score.length];
       
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 1;
        while(! queue.isEmpty()){
            map.put(queue.poll(),k++);
            
        }
        
        for(int i = 0; i < score.length; i++){
            if(map.get(score[i])==1){
                arr[i] = "Gold Medal";
            }else  if(map.get(score[i])==2){
                arr[i] = "Silver Medal";
            }else  if(map.get(score[i])==3){
                arr[i] = "Bronze Medal";
            }else{
                String val = Integer.toString(map.get(score[i]));
                arr[i] = val;
            }
        }return arr;
        
    }
}