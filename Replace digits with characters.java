
class Solution {
    public String replaceDigits(String s) {
     StringBuilder sb = new StringBuilder(s.length());
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            {
                if(Character.isDigit(ch))
                {
                    sb.append((char)(s.charAt(i-1)+Character.getNumericValue(ch)));
                }
                else
                {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}

