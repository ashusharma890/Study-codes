// fast method

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray())
        {
            freq[ch-'a']++;
        }
           int count=freq[s.charAt(0)-'a'];
        for(int i : freq)
        {
            if(i!=0 && i!=count)
                return false;
        }
       return true; 
    }
}

//using hashmap

class Solution {
    public boolean areOccurrencesEqual(String s) {
     Map<Character, Integer> hmap =  new HashMap<>();
        for(int i=0;i<s.length();i++){         
            if(hmap.containsKey(s.charAt(i))){
                hmap.replace(s.charAt(i), hmap.get(s.charAt(i))+1);
            }
            else{
                hmap.put(s.charAt(i),1);
            }
        }
		//Checking all the Characters count are the same or not
        int count = hmap.get(s.charAt(0));        
        for(Integer chcount: hmap.values()){
            if(chcount!=count){
                return false;
            }
        }
        return true;

    }
}

