//string method

class Solution {
    public boolean checkIfPangram(String st) {
        for(char i='a';i<='z';i++){
      if(!st.contains(String.valueOf(i))){
          return false;
      }
  }
    return true; 
    }
}

//hashset method

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set <Character> s= new HashSet<Character>();
        for(int i=0;i<sentence.length();i++){
            s.add(sentence.charAt(i));
        }
        return s.size()==26;
    }
}

