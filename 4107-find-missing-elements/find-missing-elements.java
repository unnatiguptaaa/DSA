class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0, min = 101;
        Set<Integer> s = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for(int i : nums){
            max = Math.max(max, i);
            min = Math.min(min, i);
            s.add(i);
        }
        
        for(int i = min; i <= max; i++) {
            if(!s.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}