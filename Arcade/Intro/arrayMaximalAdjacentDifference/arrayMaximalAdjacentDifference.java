int arrayMaximalAdjacentDifference(int[] inputArray) {

    int maxdiff=-1;
    for(int i=0;i<inputArray.length-1;i++)
    {
        if(Math.abs(inputArray[i]-inputArray[i+1])>maxdiff)
        {
            maxdiff=Math.abs(inputArray[i]-inputArray[i+1]);
        }
    }
    return maxdiff;
}
