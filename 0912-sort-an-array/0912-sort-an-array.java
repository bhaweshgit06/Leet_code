class Solution {
    
    
    public static void mergeSort(int[] nums, int si, int ei){
        if(si<ei){
         int mid = (si+ei)/2;
        mergeSort(nums,si,mid);
        mergeSort(nums,mid+1, ei);
        
        merge(nums, si, ei, mid);
        }
        

        
    }
    
    public static void merge(int[] nums, int si, int ei, int mid){
        int n1 = mid-si+1;
        int n2 = ei-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        for(int i = 0; i < n1; i++){
            left[i] = nums[i+si];
        }
        for(int j = 0; j < n2; j++){
            right[j] = nums[mid+1+j];
        }
        
        int k = si;
        int l = 0;
        int r = 0;
        while(l < left.length && r< right.length){
            if(left[l]<right[r]){
                nums[k++] = left[l++];
            }else{
                nums[k++] = right[r++];
                
            }
        }
        
        while(l<left.length){
            nums[k++]= left[l++];
        }
        while(r<right.length){
            nums[k++]= right[r++];
        }
        
    }
    
    
    public int[] sortArray(int[] nums) {
         mergeSort(nums,0,nums.length-1);
        return nums;
    }
}