class Solution {
    //(even,odd): right half contains the element
    //(odd,even): left half contains the element
    public int singleNonDuplicate(int[] nums) {
        int n=  nums.length;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=1;
        int high=nums.length-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if(((mid%2==1) && nums[mid-1]==nums[mid]) || ((mid%2==0) && nums[mid] == nums[mid+1])){
                low=mid+1; //you are in the left half but ele is in right half
            }
            else{
                high=mid-1; //element on left half
            }


        }
        return -1;
    }
}