

class Solution {
    public String mergeAlternately(String word1, String word2) {
            int l=word1.length()+word2.length();
        StringBuilder y=new StringBuilder();
    int e=0, o=0;
        while(true){
            if(o>=word2.length()&&e>=word1.length())break;
            if(e<word1.length()){
                y.append(word1.charAt(e));
                e++;
            }
            if(o<word2.length()){
                y.append(word2.charAt(o));
                o++;
            }
        }
        return y.toString();
    }
}

