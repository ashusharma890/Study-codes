class Solution
{
    public String is_AutomorphicNumber(int n)
    {
        // Code here
       String s= Integer.toString(n);
        double sq= Math.pow(n,2);
        int val=(int)sq;
        int count=s.length();
        String s1="";
        while(val!=0 && count!=0)
        {
            int rem=val%10;
            s1=rem+s1;
            count--;
            val/=10;
        }
         if(s.equals(s1))
       {
           return "Automorphic";
       }
       return "Not Automorphic";
    }
}
