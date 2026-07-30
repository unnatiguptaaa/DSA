class Solution {
    public int minimumPushes(String word) {
         
        int n = word.length();
        int ans = 0;
        int press = 1;

        for(int i = 0; i < n; i++) {
            if(i > 0 && i % 8 == 0) {
                press++;
            }
            ans += press;
        }

        return ans;
    }
}