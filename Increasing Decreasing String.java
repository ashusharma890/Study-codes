//slow approach 

class Solution {
    public String sortString(String s) {
        int[] arr = new int[26];

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        int temp = 0;
        int noOfTry = -1;
        while (temp < s.length()) {
             StringBuilder tempStr = new StringBuilder("");
             noOfTry++;
            for (int i = 0; i < 26; i++) {
                if (arr[i] != 0) {
                    char c = (char) ('a' + i);
                    tempStr.append(c);
                    temp++;
                    arr[i]--;
                }
            }
            result.append(noOfTry%2==0?tempStr:tempStr.reverse());
        }

        return result.toString();
    }
}


//optimized approach

class Solution {
    public String sortString(String s) {
        StringBuilder answer = new StringBuilder(s.length());
        int[] frequencyTable = new int[26];
        for(char letter: s.toCharArray()) {
            frequencyTable[letter - 'a']++;
        }
        while(answer.length() < s.length()) {
            reorder(answer, frequencyTable, true);
            reorder(answer, frequencyTable, false);
        }
        return answer.toString();
    }
    
    public void reorder(StringBuilder builder, int[] table, boolean decider) {
        for(int i=0;i<26;i++) {
            int j = decider ? i : 25 - i;
            if(table[j]-- > 0) {
                builder.append((char)(j + 'a'));
            }
        }
    }
}

