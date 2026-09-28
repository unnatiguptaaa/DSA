class Solution {
    public int maxDepth(String s) {
        int curdepth=0;
        int maxdepth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                curdepth++;
                maxdepth=Math.max(maxdepth,curdepth);
            }
            else if(ch==')'){
                curdepth--;
            }
        }
        return maxdepth;
        
    }
}