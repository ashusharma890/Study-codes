//using hashmap

class Solution {
    public boolean isAnagram(String s1, String s2) {
      /*if(s1.length() != s2.length()){
            return false;
        }
        */
      //make a hashmap to store frequencies correctly
        HashMap<Character,Integer> hm = new  HashMap<>();
        char[] c1 =s1.toCharArray();
        for(char c : c1)
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        //frequency hm constructed
       char[] c2=s2.toCharArray();
        for(char c : c2 )
        {
            hm.put(c,hm.getOrDefault(c,0)-1);
            /*if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)-1);
            }
            else
            {
            return false;
            }
           */ 
           }
        for(char c : hm.keySet())
        {
            if(hm.get(c) != 0)
                return false;
        }
        return true;
    }
}


