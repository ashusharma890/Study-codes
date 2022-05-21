//brute force 

class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<=prices[i-1])
            {
                prices[i-1]-=prices[i];
            }
            else
            {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i-1])
                {
                    prices[i-1]-=prices[j];
                    break;
                }
            }
            }
        }
        return prices;
    }
}

//using array

class Solution {
    public int[] finalPrices(int[] prices) {
       int [] answer= new int[prices.length];
    for(int i=0;i<prices.length;i++){
        int val=0;
        for(int j=i+1;j<prices.length;j++){
            if(prices[j]<=prices[i]){
                answer[i]=prices[i]-prices[j];
                val=1;
                break;
            }
        }
        if(val==0){
            answer[i]=prices[i];
        }
    }
    return answer;
    }
}


//using stack

class Solution {
    public int[] finalPrices(int[] prices) {
    Stack <Integer> st= new Stack<>();
        for(int i=0;i<prices.length;i++)
        {
            while(!st.isEmpty() && prices[i] <= prices[st.peek()])
            {
                prices[st.peek()]=prices[st.peek()]-prices[i];
                st.pop();
            }
       st.push(i);
        }
        return prices;
    }
}

