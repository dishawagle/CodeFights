int[] extractEachKth(int[] inputArray, int k) {
    
    int reslen=inputArray.length-inputArray.length/k;
    int result[]=new int[reslen];
    int x=0;
    for(int i=0;i<inputArray.length;i++)
    {
        if((i+1)%k!=0)
        {
            result[x++]=inputArray[i];
        }
    }
return result;
}
