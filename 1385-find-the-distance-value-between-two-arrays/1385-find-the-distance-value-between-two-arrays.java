class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=0;
        for(int n:arr1)
        {
            if(binary(arr2,n,d))
                count++;
        }
        return count;
    }
    static boolean binary(int arr[],int n,int d)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int num=Math.abs(arr[mid]-n);
            if(num<=d)
            {
                return false;
            }
            else if(arr[mid]<n)
            {
                start=mid+1;
            }
            else if(arr[mid]>n)
            {
                end=mid-1;
            }
        } 
        return true;   
    }
}