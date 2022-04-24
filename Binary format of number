class Solution{
    static String getBinaryRep(int N){
        // code here
        String num="";
        while(N>0)
        {
            num=""+N%2+num;
            N=N/2;
        }
        int count=30-num.length();
        while(count>0)
        {
            num="0"+num;
            count--;
        }
        return (num);
    }
}
