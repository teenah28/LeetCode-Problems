class Solution {
    public static int finddays(int[] weights,int cap){
        int days=1;
        int load=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(load + weights[i] > cap){
                days +=1;
                load=weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE,high=0;
        for(int i=0;i<weights.length;i++){
            high += weights[i];
            low=Math.max(low,weights[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int numberofdays=finddays(weights,mid); // here mid is capacity
            if(numberofdays <= days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}