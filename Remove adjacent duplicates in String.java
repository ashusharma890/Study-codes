

class Solution {
    public String removeDuplicates(String s, int k) {
         int l = s.length();
        char [] ch = s.toCharArray();
        int i, j;
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        for (i = 1, j = 1; j < l; i++, j++) {
            ch[i] = ch[j];
            if (i == 0 || ch[i] != ch[i-1]) {
                st.push(i);
            }
            else if ((i-st.peek()+1) == k) 
                i = st.pop()-1;
        }
        return String.valueOf(ch, 0, i);
    }
}


// in leetcode using string builder

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder st=new StringBuilder();
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           if(!stack.isEmpty()&&stack.peek()==s.charAt(i))
               stack.pop();
            else
            {
                stack.push(s.charAt(i));
            }  
        }
       while(!stack.isEmpty())
       {
           st.append(stack.pop());
       }
        return st.reverse().toString();
    }
}

//using char array & string

class Solution {
    public String removeDuplicates(String s) {
        String st="";
        char[] arr= s.toCharArray();
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
           if(!stack.isEmpty()&&stack.peek()==arr[i])
               stack.pop();
            else
            {
                stack.push(arr[i]);
            }  
        }
        for(int i=0;i<stack.size();i++)
        {
            st+=stack.get(i);
        }
        return st;
    }
}


