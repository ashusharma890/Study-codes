//brute approach

class Solution {
    public boolean judgeCircle(String moves) {
        char[] str = moves.toCharArray();
        int l=-10,r=10,u=01,d=-01;
        int total = 0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='U'){
                total+=u;
            }
            if(str[i]=='D'){
                total+=d;
            }
            if(str[i]=='L'){
                total+=l;
            }
            if(str[i]=='R'){
                total+=r;
            }
        }
        if(total==0){
            return true;
        }
        return false;
    }
}

