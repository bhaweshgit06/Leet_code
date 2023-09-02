class Solution {
    public int reverse(int x) {
     long ans = 0;
    
     int div = 0;
while(x!=0){
    
    div = x%10;
    ans = (ans*10) +div;
    x = x/10;
    
}

if(ans< Math.pow(-2,31) || ans> Math.pow(2,31)){
    return 0;
}
return (int)ans;
    }
}