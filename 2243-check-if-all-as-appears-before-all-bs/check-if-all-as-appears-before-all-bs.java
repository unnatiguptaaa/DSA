class Solution {
    public boolean checkString(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                count++;
            }
        }
        int a=count;
        for(int i=0;i<s.length();i++){
              char ch=s.charAt(i);
            if(ch=='a'){
                a--;
            }
            else if(ch=='b'&&a>0){
                return false;
            }
        }
        return true;

        
    }
}