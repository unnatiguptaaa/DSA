class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0;
        long product=1;
        int x=n;
        while(n>0){
            int d=n%10;
            sum+=d;
            product*=d;
            n/=10;

        }
        long val=sum+product;
        return x%val==0;
        
    }
}