class Solution {
    public int reverse(int x) {
        int digit=0;
        int temp=x;
        long rev=0;
        while(x!=0){
            digit = x % 10;
            rev=rev*10+digit; 
            if(rev < (-1*Math.pow(2,31)) || rev > (Math.pow(2,31)-1)){
              return 0;
           }
            x=x/10;
        }
      
        return (int)rev;
    }
}