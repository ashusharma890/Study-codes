//hash set method

class Solution {
    public boolean halvesAreAlike(String s) {
    Set<Character> vowels = Set.of('a','e','i','o','u', 'A','E','I','O','U');
	int N = s.length();
	int i = 0;
	int j = N/2;
	int vowel = 0;

	while (i < N/2) {
		char ch1 = s.charAt(i++);
		char ch2 = s.charAt(j++);
		if (vowels.contains(ch1)) 
			vowel++;
		if (vowels.contains(ch2))
			vowel--;
	}

	return vowel == 0;
    }
}

//easy brute fore approach

class Solution {
    public boolean halvesAreAlike(String s) {
    int mid = s.length()/2;
    int ca=0,cb=0;
    
    for(int i=0;i<=mid-1;i++){
       
        char cha = s.charAt(i);
        char chb = s.charAt(i+mid);
        
        if(cha=='a' || cha=='e' || cha=='i' || cha=='o' || cha=='u') ca++;
        else if(cha=='A' || cha=='E' || cha=='I' || cha=='O' || cha=='U') ca++;
        
        if(chb=='a' || chb=='e' || chb=='i' || chb=='o' || chb=='u') cb++;
        else if(chb=='A' || chb=='E' || chb=='I' || chb=='O' || chb=='U') cb++;
        
    }
    
    if(ca==cb) return true;
        return false;
    }
}

