int arrayChange(int[] inputArray) {
    
    int moves=0;
    
    for(int i=0;i<inputArray.length-1;i++)
    {
        if(inputArray[i]>=inputArray[i+1])
        {
            int change=inputArray[i]-inputArray[i+1]+1;
            inputArray[i+1]+=inputArray[i]-inputArray[i+1]+1;
            moves+=change;
        }
    }

    return moves;
}
