//short but slow

class Solution {
    public boolean squareIsWhite(String str) {
         int first = str.charAt(0) - 'a' + 1;
        int second = str.charAt(1) - '0';
        int flag1 = first % 2;
        int flag2 = second % 2;
        
        return flag1 != flag2;
    }
}


//short but fast

class Solution {
    public boolean squareIsWhite(String coordinates) {
        int c= (int) coordinates.charAt(0); 
        int num = (int) coordinates.charAt(1);
        if( (c% 2 == 0 && num% 2 != 0 ) || (c% 2 != 0 && num% 2 == 0 )  )
        {
            return true;
        }
            return false;
    }
}

