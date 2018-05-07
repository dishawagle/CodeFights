int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    
    int sum=0;
    for(int i=0;i<k;i++)
    {
        sum+=inputArray[i];
    }
    
    int current=sum;
    for(int i=1;i<=inputArray.length-k;i++)
    {
        current+=inputArray[i+k-1];
        current-=inputArray[i-1];
        if(current>sum)
        {
            sum=current;
        }
    }
return sum;
}
