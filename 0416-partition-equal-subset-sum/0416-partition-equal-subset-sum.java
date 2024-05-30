class Solution {

    static boolean sol(int[] nums,int idx,int targetsum,int[][] dp){
        if(targetsum==0) return true;
        if(idx<0 || targetsum<0) return false;

        if(dp[idx][targetsum] !=-1){
            return dp[idx][targetsum]==0 ? false: true;
        }

    boolean notinclude=sol(nums,idx-1,targetsum,dp);
        boolean include=false;
        if(nums[idx]<=targetsum){
                 include=sol(nums,idx-1,targetsum-nums[idx],dp);
        }
        
        
        if(notinclude || include){
            dp[idx][targetsum]=1;
        }
        else{
            dp[idx][targetsum]=0;
        }
        return notinclude||include;
        
        
    }

    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0) return false;
        int targetsum=sum/2;

        int[][] dp=new int[nums.length][targetsum+1];
        for (int row[] : dp)
                Arrays.fill(row, -1);
        return sol(nums,nums.length-1,targetsum,dp);
    }
}