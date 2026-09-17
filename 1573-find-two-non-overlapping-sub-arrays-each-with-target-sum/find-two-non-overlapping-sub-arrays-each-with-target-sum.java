class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;

        // best[i] = index 0 se i tak
        // target sum wala koi subarray mila hai to
        // uski minimum length store karega
        int[] best = new int[n];

        // Initially koi subarray nahi mila
        Arrays.fill(best, Integer.MAX_VALUE);

        int left = 0;
        int sum = 0;

        // Answer ko initially maximum rakhenge
        int answer = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            // Right pointer ka element sum me add karo
            sum += arr[right];

            // Jab sum target se bada ho,
            // left se elements remove karte jao
            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            // Agar current window ka sum target ke equal hai
            if (sum == target) {

                // Current subarray ki length
                int currentLength = right - left + 1;

                // Agar left > 0 hai,
                // iska matlab current subarray se pehle
                // koi part available hai.
                //
                // best[left - 1] = current subarray se pehle
                // mila hua smallest target-sum subarray
                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {

                    // Dono subarrays ki total length
                    answer = Math.min(
                        answer,
                        currentLength + best[left - 1]
                    );
                }

                // Current position tak ki minimum length store karo
                if (right == 0) {
                    best[right] = currentLength;
                } else {
                    best[right] = Math.min(
                        best[right - 1],
                        currentLength
                    );
                }

            } else {

                // Agar current window target nahi hai,
                // to previous best ko copy karo
                if (right > 0) {
                    best[right] = best[right - 1];
                }
            }
        }

        // Agar answer update nahi hua,
        // iska matlab 2 valid non-overlapping subarrays nahi mile
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}