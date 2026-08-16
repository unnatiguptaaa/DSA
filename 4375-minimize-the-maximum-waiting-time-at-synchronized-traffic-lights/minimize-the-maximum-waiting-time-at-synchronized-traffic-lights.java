class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
       int max=0;
        for(int light:lights){
            max=Math.max(max,light);
            
        }
        int wait=0;
        for(int time:arrivalTime){
            int r=time%period;
            if(r>=max){
                wait=Math.max(wait,period-r);
            }
        }
        return wait;  
    }
}