class Solution {
    public int longestSubstring(String s, int k) {

        // Step 1: Agar string ki length k se chhoti hai
        if (s.length() < k) {
            return 0;
        }

        // Step 2: 26 lowercase characters ki frequency
        int[] freq = new int[26];

        // Step 3: Har character ki frequency count karo
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Step 4: Aisa character dhundo
        // jiska frequency k se kam hai
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (freq[ch - 'a'] < k) {

                // Step 5: Invalid character ke left part ko solve karo
                int left = longestSubstring(
                    s.substring(0, i), k
                );

                // Step 6: Invalid character ke right part ko solve karo
                int right = longestSubstring(
                    s.substring(i + 1), k
                );

                // Step 7: Dono mein se maximum
                return Math.max(left, right);
            }
        }

        // Step 8: Agar koi invalid character nahi mila
        // toh poori string valid hai
        return s.length();
    }
}
   