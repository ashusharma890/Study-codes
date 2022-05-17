
class Solution {
    public String reverseWords(String s) {
        String st[]=s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<st.length;i++)
        {
            sb.append(String.valueOf(new StringBuilder(st[i]).reverse()+" "));
        }
        return sb.toString().trim();
    }
}


