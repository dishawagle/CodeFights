int absoluteValuesSumMinimization(int[] a) {
    
    
    int x=0,diff=Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==x)
        {
            continue;
        }
        int currdiff=0;
        for(int j=0;j<a.length;j++)
        {
            currdiff+=Math.abs(a[j]-a[i]);
        }
        if(currdiff<diff)
        {
            x=a[i];
            diff=currdiff;
        }
        else if(currdiff==diff)
        {
            if(a[i]<x)
            {
                x=a[i];
            }
        }
        
    }
    
    return x;

}
