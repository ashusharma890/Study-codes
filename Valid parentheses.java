// using stack

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                    if((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']') || (stack.peek() == '{' && s.charAt(i) == '}')){
                    stack.pop();
                }
                    else{
                    stack.push(s.charAt(i));
                }
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

// using stack & switch case

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for(char c: s.toCharArray()){
            switch(c){
                    case '}':
                            if(stack.isEmpty() || stack.pop() != '{')
                                return false;
                            break;
                    case ')':
                            if(stack.isEmpty() || stack.pop() != '(')
                                return false;
                            break;
                    case ']':
                            if(stack.isEmpty() || stack.pop() != '[')
                                return false;
                            break;
                default:
                    stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

//using hashmap

class Solution {
    public boolean isValid(String s) {
       Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        LinkedList<Character> stack = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('||c == '{'||c == '['){//If opening push
                stack.push(c);
            }else{
                if(map.get(c).equals(stack.peek())){ //If closing pop
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }
}

