// easy & understandable approach

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        
        int count =0;
        
        for(char c: s.toCharArray()) {
            
            if(')' == c) count--;
            if(count!=0) result.append(c);
            if('(' == c) count++;
        }
        
        
        return result.toString(); 
    }
}

//using stack approach

 Stack<Character> stack = new Stack<>();
        int f=0,l=0;
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
            if(stack.empty()){
                res.append(s.substring(f+1,i));
                f = i+1;
            }
        }
        return res.toString();


