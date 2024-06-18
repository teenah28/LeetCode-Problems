class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            //left part sorted
           if (nums[s] <= nums[mid]){
            if (nums[s] <= target && target <= nums[mid]){
                    // element exists
                    e = mid - 1;
                } else {
                    // element does not exist
                    s = mid + 1;
                }
           }

           //right part sorted
           else { // if right part is sorted
                if (nums[mid] <= target && target <= nums[e]) {
                    // element exists
                    s = mid + 1;
                } else {
                    // element does not exist
                    e = mid - 1;
                }
            }
      
    }
return -1;
    }
    
}