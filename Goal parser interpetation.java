//slow appraoch

class Solution {
    public String interpret(String command) {
        String res="";
        command= command.replace("()","o");
        res=command.replace("(al)","al");
        return res;
    }
}

//faster approach

class Solution {
    public String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'G') {
                stringBuilder.append(command.charAt(i));
            } else if (chars[i] == '(' && chars[i + 1] == ')') {
                stringBuilder.append('o');
            } else if (chars[i] == '(' && chars[i + 1] == 'a') {
                stringBuilder.append("al");
            }
        }
        return stringBuilder.toString();
    }
}

