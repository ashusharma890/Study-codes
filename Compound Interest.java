
// formula method

class Solution {
    static int getCompundInterest(int P , int T , int N , int R) {
        // code here
       double amount =(double) P *Math.pow((1 + ((double)R / 100) / (double)N ), (double)N * (double)T);

       return (int) amount;
    }
};


