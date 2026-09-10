import java.util.*;

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();

        for (String q : queries) {
            for (String d : dictionary) {

         
                if (q.length() != d.length()) continue;

                int cnt = 0;

                for (int i = 0; i < q.length(); i++) {
                    if (q.charAt(i) != d.charAt(i)) cnt++;

                   
                    if (cnt > 2) break;
                }

                if (cnt <= 2) {
                    ans.add(q);
                    break; 
                }
            }
        }

        return ans;
    }
}