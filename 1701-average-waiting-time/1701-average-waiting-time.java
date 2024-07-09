class Solution {
    public double averageWaitingTime(int[][] customers) {
    double res=customers[0][0];
    double sum=0;
        for(int arr[]:customers)
        {    
            if(res>=arr[0])
            {
                res+=arr[1];
                sum+=res-arr[0];
            }
            else
            {
                res=arr[0]+arr[1];
                sum+=res-arr[0];
            }
        }
        return sum/customers.length;
    }
}