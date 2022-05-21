//using stack

class Solution {
    public int calPoints(String[] ops) {
       int sum=0;
        Stack<String> stack= new Stack<>();
        for(String s : ops)
        {
            switch(s)
            {
                case "+" :
                long last=Long.parseLong(stack.peek());
                long secondLast=Long.parseLong(stack.get(stack.size()-2));
                sum+=last+secondLast;
                stack.push(String.valueOf(last+secondLast));
                                        break;
                case "D":
                long newScore=Long.parseLong(stack.peek())*2;
                sum+=newScore;
                stack.push(String.valueOf(newScore));
                                        break;
                case "C":
                long delete=Long.parseLong(stack.pop());
                sum-=delete;
                                        break;
                default:
                stack.push(s);
                sum+=Long.parseLong(s);
                                        break;    
        }
    }
        if(sum<=Integer.MAX_VALUE)
            return (int) sum;
        return -1;
}
}

//using linked list

class Solution {
    public int calPoints(String[] ops) {
       var st = new LinkedList<Integer>();
        int sum = 0;
        for (String op : ops) {
            if (op.equals("D")) {
                sum += st.peekLast() * 2;
                st.addLast(st.peekLast() * 2);
            } else if (op.equals("C")) {
                sum -=st.removeLast();
            } else if (op.equals("+")) {
                int n1 = st.get(st.size()-2);
                int n2 = st.get(st.size()-1);
                st.addLast(n1 + n2);
                sum += n1 + n2;
            } else {
                sum += Integer.parseInt(op);
                st.addLast(Integer.parseInt(op));
            }
        }
        
        return sum;
}
}

