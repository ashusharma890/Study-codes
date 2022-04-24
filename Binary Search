int binarysearch(int arr[], int n, int target){
        int l = 0, r = n - 1;
        int mid;
        while(l <= r){
            mid = (l + r)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }

