boolean almostIncreasingSequence(int[] sequence) {
    
    int nums=0;
    int max=Integer.MIN_VALUE,secmax=Integer.MIN_VALUE;
    for(int i=0;i<sequence.length;i++)
    {
        if(sequence[i]>max)
        {
            secmax=max;
            max=sequence[i];
        }
        else if(sequence[i]>secmax)
        {
            max=sequence[i];
            nums++;
        }
        else
        {
            nums+=1;
        }
    }
    return nums<2;
}
