class Solution {
    Integer [][] dp;
    int[] nums;
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        this.nums=nums;
        dp=new Integer[n][n];
        return solve(0,n-1)>=0;
        
    }
    private int solve(int left,int right){
        if(left==right){
            return nums[left];

        }
        if(dp[left][right]!= null){
            return dp[left][right];
        }
        int takeleft= nums[left]-solve(left+1,right);
        int takeright= nums[right]-solve(left,right-1);
        return dp[left][right]= Math.max(takeleft,takeright);
    }
}