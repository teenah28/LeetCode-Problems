class Solution {

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        //Approach 1
        // int cnt1=0;
        // int cnt2=0;
        // int cnt0=0;
        // for(int i=0;i< nums.length;i++){
        //     if(nums[i] ==0) cnt0++;
        //     if(nums[i] == 1) cnt1++;
        //     if(nums[i] == 2) cnt2++;

        // }

        // for(int i=0;i<cnt0 ; i++){
        //     nums[i]=0;
        // }
        // for(int i=cnt0 ; i < cnt0+cnt1; i++){
        //     nums[i]=1;
        // }
        // for(int i=cnt1 + cnt0 ;i<  nums.length;i++){
        //     nums[i]=2;
        // }
        
        //dutch national flag algoritm 
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
                // Note: mid is not incremented here because after swapping, we need to recheck nums[mid]
            }
        }

    }
}