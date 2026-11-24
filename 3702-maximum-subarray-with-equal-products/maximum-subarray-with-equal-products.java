class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int product = 1;
            int gcd = 0;
            int lcm = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];

                gcd = findGCD(gcd, nums[j]);
                lcm = findLCM(lcm, nums[j]);

                if (product == gcd * lcm) {
                    ans = Math.max(ans, j - i + 1);
                }

                if (product > 25200) {
                    break;
                }
            }
        }

        return ans;
    }

    private int findGCD(int a, int b) {
        if (b == 0)
            return a;

        return findGCD(b, a % b);
    }

    private int findLCM(int a, int b) {
        return (a / findGCD(a, b)) * b;
    }
}