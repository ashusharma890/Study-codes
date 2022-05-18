// fast approach but long

class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
        boolean flag=false;
        for( i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                flag=true;
            break;
            }
        }
        if(flag==false)
        {
            return word;
        }
        StringBuilder s= new StringBuilder();
        s.append(word.substring(0,i+1));
        s.reverse();
        for(int j=i+1;j<word.length();j++)
        {
            s.append(word.charAt(j));
        }
        return s.toString();
    }
}


//fast but short

class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1 || word.indexOf(ch)==0){
            return word;
        } 
        //Get the substring till the index of first character(ch)
        String revPrefix = word.substring(0,word.indexOf(ch)+1);
        StringBuilder sb = new StringBuilder(revPrefix);
        //Reverse and add the rest of the string to get the reverse prefix of the word
        return  sb.reverse() + word.substring(word.indexOf(ch)+1);
    }
}

