// slow & brute force approach

class Solution {
    public int maxDepth(String s) {
        int max=0,c=0;
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='(')
          {
              c++;
              max=Math.max(c,max);
          }
            else if(s.charAt(i)==')')
            {
                c--;
            }
        }
        return max;
    }
}

//using stack

class Solution {
    public int maxDepth(String s) {
int max=0;
    Stack<Character>stk=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='(')
        {
            stk.push('(');
        }
        else if(s.charAt(i)==')')
        {
            max=Math.max(max,stk.size());
            stk.pop();
        }
    }
    return max;
    }
}


