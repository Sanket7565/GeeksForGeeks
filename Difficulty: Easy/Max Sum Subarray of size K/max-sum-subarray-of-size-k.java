class Solution {
    public int maxSubarraySum(int[] arr, int k) 
    {
        int low=0;
        int high=k-1;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        
        maxSum=Math.max(sum,maxSum);
        
        while(high<arr.length)
        {
            
            
            low++;
            high++;
            
            if(high==arr.length)
            {
                break;
            }
            sum=sum-arr[low-1]+arr[high];
            
            maxSum=Math.max(sum,maxSum);
        
        }
        
        return maxSum;
        
    }
}