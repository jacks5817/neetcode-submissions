class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int x=0; x< nums.length; x++){
            for(int a=x+1; a < nums.length; a++){
                if(nums[x]+nums[a] == target){
                    return new int[]{x,a};
                }
            }
        }
        return new int[0];
    }
}
