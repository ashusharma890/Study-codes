
class Solution {
    static int subClock(int num1, int num2) {
        // code here
        if(num1>=12)
       {
           num1=num1%12;
       }
       
       if(num2>=12)
       {
           num2=num2%12;
       }
       
       if((num1-num2)<0)
       {
           return 12+(num1-num2);
       }
       
       return (num1-num2);
   }
};

//for multiplication

class Solution {
    static int mulClock(int num1, int num2) {
        // code here
        
        return (num1*num2) %12;
    }
};


