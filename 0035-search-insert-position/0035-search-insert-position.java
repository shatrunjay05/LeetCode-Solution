class Solution {
    public int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target)
                return i; 
            else if(nums[i] > target)
                return i;
            else if(nums[i] >= nums[nums.length-1])
                return i+1;
        }
            return -1;
        
    }
}