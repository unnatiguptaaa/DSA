class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = NGL(nums2);
        int[] res = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }

        return res;
    }

    private HashMap NGL(int[] nums){
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=n-1;i>=0;i--){
            int currEle = nums[i];
            while(!stk.isEmpty() && currEle>stk.peek()){
                stk.pop();
            }
            if(stk.isEmpty()){
                map.put(currEle,-1);
            }else{
                map.put(currEle,stk.peek());
            }
            stk.push(currEle);
        }
        return map;
    }
}