int avoidObstacles(int[] inputArray) {
int minlen=1;
    boolean found=false;
    while(found==false)
    {
        for(int i=0;i<inputArray.length;i++)
        {
            if(inputArray[i]%minlen==0)
            {
                found=false;
                break;
            }
            else{
                found=true;
            }
        }
        if(found==false)
        {
            minlen++;
        }
        else{
            return minlen;
        }
    }
    return minlen;
}
