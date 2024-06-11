class Solution {
    public void moveZeroes(int[] nums) {
        //Approach 1
        // List<Integer> temp=new ArrayList<>();

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         temp.add(nums[i]);

        //     }
        // }
        // for(int i=0;i<temp.size();i++){
        //     nums[i]=temp.get(i);
        // }
        // int nonzero=temp.size();
        // for(int i=nonzero;i<nums.length;i++){
        //     nums[i]=0;
        // }

        //Approach 2
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                j++;
            }
            
        }
    }
}