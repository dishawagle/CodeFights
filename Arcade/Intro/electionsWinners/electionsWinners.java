int electionsWinners(int[] votes, int k) {

    
    int currentmax=-1;
    int num=0;
    int nummax=0;
    for(int i=0;i<votes.length;i++)
    {
        currentmax=Math.max(currentmax,votes[i]);
    }
    
    for(int i=0;i<votes.length;i++)
    {
        if(votes[i]==currentmax)
        {
            nummax++;
            num++;
        }
        else if(votes[i]+k>currentmax)
        {
            num++;
        }
    }
    if(nummax>1 && k==0)
    {
        return 0;
    }
    return num;
}
