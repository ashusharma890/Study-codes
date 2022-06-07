// code start

class Solution {
    public void duplicateZeros(int[] a) {
         int n = a.length, i = 0, j = 0;
        for(; j < n && i < n; i++, j++)
            if(a[i] == 0)
                ++j;
        if(j == i) return;
        for(int k=i-1; k >= 0; k--){
            if(--j < n)
                a[j] = a[k];
            if(a[k] == 0 )
                if(--j < n)
                    a[j] = 0;
        }
    }
}

// code end
