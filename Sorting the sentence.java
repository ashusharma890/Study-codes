
class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String []temp = s.split(" ");     //splitting the string with space as delimiter and storing it in temp array
        String res[] = new String[temp.length];
        for(String i: temp) {
            int num = i.charAt(i.length()-1) - '0';   //extracting digit from each word in temp array
            res[num-1] = i.substring(0, i.length()-1);   //removing digit from each word in temp array and storing at its specified position in res array
        }
        for(String i: res)
            sb.append(i+" ");
        String sss = sb.toString().trim();
        return sss;
    }
}


