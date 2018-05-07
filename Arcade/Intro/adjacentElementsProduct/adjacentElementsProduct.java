int adjacentElementsProduct(int[] inputArray) {

    int maxprod=Integer.MIN_VALUE;
    int j=-1;
    for(int i=0;i<inputArray.length-1;i++)
    {
        j=i+1;
        if(inputArray[i]*inputArray[j]>maxprod)
        {
            maxprod=inputArray[i]*inputArray[j];
        }
    }
    
    return maxprod;
}
