class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
             nums[i]-=1;
        }
        return nums[n-1]*nums[n-2];
        
    }
}