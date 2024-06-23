class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt=1;
                ele=nums[i];
            }
            else if(nums[i] == ele){
                cnt++;
            }
            else{
                cnt--;
            }

        }
        int cnt1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == ele) cnt1++;

        }
        if(cnt1>(nums.length/2)){
            return ele;
        }
        return -1;
        
    }
}