class Solution {
    public void sortColors(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int cnt0=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] ==0) cnt0++;
            if(nums[i] == 1) cnt1++;
            if(nums[i] == 2) cnt2++;

        }

        for(int i=0;i<cnt0 ; i++){
            nums[i]=0;
        }
        for(int i=cnt0 ; i < cnt0+cnt1; i++){
            nums[i]=1;
        }
        for(int i=cnt1 + cnt0 ;i<  nums.length;i++){
            nums[i]=2;
        }
        
    }
}