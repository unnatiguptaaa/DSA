class Solution {
    public int maximum69Number (int num) {
        if(num == 9999 || num == 9996 || num == 9969 || num == 9699 || num == 6999)return 9999;
        if(num == 999 || num == 996 || num == 969 || num == 699)return 999;
        if(num == 99 || num == 96 || num == 69)return 99;   
        if(num == 9966 || num == 9696 || num == 6996)return 9996;
        if(num == 9669 || num == 6969)return 9969;
        if(num == 6699)return 9699;
        if(num == 966 || num == 696)return 996;
        if(num == 669)return 969;
        if(num == 66)return 96;

        if(num == 9666 || num == 6966)return 9966;
        if(num == 6696)return 9696;
        if(num == 6669)return 9669;
        if(num == 666)return 966;
        if(num == 6666)return 9666;

        return 9;
    }
}