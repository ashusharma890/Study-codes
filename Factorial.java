//recursive method

class Solution
{
    public long find_fact(int n)
    {
        // Code here
        if(n==1)
        return 1;
        
        return n* find_fact(n-1);
    }
}

//non-recursive method

 static int find_fact(int N)
    {
        // Code here
        int fact=1;
        for(int i=1;i<=N;i++)
        {
            fact*=i;
        }
        return fact;
    }





