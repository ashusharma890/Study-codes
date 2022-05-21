//using stack

class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> stack= new Stack<>();
       int i=1;
        int pos=0;
        while(pos<target.length)
        {
            stack.push("Push");
            if(i!=target[pos])
                stack.push("Pop");
            else
                pos++;
            i++;
        }
        return stack;
    }
}

//using arraylist

class Solution {
    public List<String> buildArray(int[] target, int n) {
            List<String> list=new ArrayList<>();
    int c=0;
    int r=0;
        for(int i=1;i<=n;i++){
            if(c==target.length){
                break;
            }
            else if(target[r] == i){
                list.add("Push");
               c++;
                r++;
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;

    }
}

