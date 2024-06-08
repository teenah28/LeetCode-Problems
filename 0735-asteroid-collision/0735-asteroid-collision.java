class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            while(!s.isEmpty() && s.peek()>0 && asteroids[i]<0){
                int sum=asteroids[i]+s.peek();
                if(sum<0){
                     s.pop();
                }
                else if(sum>0){
                    asteroids[i]=0;
                    break;
                }
                else{

                
                    s.pop();
                    asteroids[i]=0;
                }
                

            }
            if(asteroids[i]!=0)
                s.push(asteroids[i]);
            

        }

        int n=s.size();
        int[] result=new int[n];
        int i=n-1;
        while(!s.isEmpty()){
            result[i]=s.peek();
            s.pop();
            i--;
        }
        return result;
    }
}