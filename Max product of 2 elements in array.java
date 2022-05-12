
class Solution {
    public int maxProduct(int[] nums) {
       int n=nums.length-1;
       int prod=1;
        Arrays.sort(nums);
        prod=(nums[n]-1) * (nums[n-1]-1);
        return prod;
    }
}

