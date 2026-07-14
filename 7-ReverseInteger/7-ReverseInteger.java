// Last updated: 7/14/2026, 2:20:47 PM
class Solution {
    public int reverse(int x) {
        int n=0;
        while(x!=0){
            if((n > 214748364 || n < -214748364))
            return 0;
            n=n*10+x%10; 
            x=x/10;
        } 
return n;
    }  
    
}