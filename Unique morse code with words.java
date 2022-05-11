// brute force
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
     String []arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        if(words.length==1)
        {
            return 1;
        }
        else{
        int i,j;
        String finalstr="";
        int len=words.length;
         String finalStr[]=new String[len];
        for(i=0;i<len;i++)
        {
            char[]arr2=words[i].toCharArray();
            for(j=0;j<arr2.length;j++)
            {
                char ch=arr2[j];
                int k=ch-97;
                finalstr=finalstr+arr[k];
            }
            finalStr[i]=finalstr;
            finalstr="";
        }
        finalstr="";
        int count=0,result=0;
        for(i=0;i<len;i++)
        {
            finalstr=finalStr[i];
            if(!finalstr.equals("null"))
            {
         for(j=i+1;j<len;j++)
         {
             if((finalStr[j].equals(finalstr))&&count==0&&(!finalStr[j].equals("null")))
             {
                 finalStr[j]="null";
                 count++;
             }
             else if(finalStr[j].equals(finalstr)&&count!=0)
             {
                 finalStr[j]="null";
             }
         }
            if(count==0)
                result++;
            else{
            result+=count;
            count=0;}
            }
        }
        return result;
        }
        
    }
}


//arraylist method
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] mCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."} ;
        ArrayList <String> nword = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String nw ="";
            String temp=words[i];
            for(int j=0;j<temp.length();j++){
                nw+=mCode[temp.charAt(j)-97];
            }
            if(!nword.contains(nw))
                nword.add(nw);
        }
        return nword.size();
    }
}

//hash set method

class Solution {
    
        private static final String[] cocdes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            String morseCode =  toMorseCode(word);
            set.add(morseCode);
        }
        return set.size();
    }
    
    private static String toMorseCode(String word) {
        StringBuilder builder = new StringBuilder();
        for (Character character : word.toCharArray()) {
            int index = character - 'a';
            builder.append(cocdes[index]);
        }
        return builder.toString();
    }
}



