class Solution
{
    static int smallestSumSubarray(int a[], int size) 
    {
        int currentAns= a[0];
        int bestAns=a[0];

        for (int i=1;i<size; i++)
        {
            int contribute= currentAns+a[i];
            int self= a[i];

             currentAns= Math.min(contribute,self);

            bestAns= Math.min(currentAns,bestAns); 
        }

        return bestAns;
        
    }
        
 }