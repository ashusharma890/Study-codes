//fast method

class Solution {
    public String freqAlphabets(String s) {
      StringBuilder ans = new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(i+2<s.length() && s.charAt(i+2)=='#'){
				int val = s.charAt(i)-'0';
				val*=10;
				val+=s.charAt(i+1)-'0';
				ans.append((char)(val-1+'a'));
				i+=2;
			}else{
				ans.append((char)(s.charAt(i)-'0'+'a'-1));
			}
		}
		return ans.toString();  
    }
}


//stack method

class Solution {
    public String freqAlphabets(String s) {
       Stack<Character> s1 = new Stack<>();
        StringBuilder result= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                int sum=0;
                int pow = 1;
                for(int j=0;j<2;j++){
                    sum+= (pow) * (int)(s.charAt(i-1) - '0');
                    pow = pow*10;
                    i--;
                }
                result.insert(0,(char)('a' + sum-1));
            } else {
                result.insert(0,(char)('a' + (s.charAt(i)-1 - '0')));
            }
        }
        return result.toString();
    }
}


