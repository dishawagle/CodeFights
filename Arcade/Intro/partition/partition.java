int partition(int[] a,int low,int high)
{
    int pivot=a[high];
    int i=low-1;
    for(int j=low;j<high;j++)
    {
        if(a[j]==-1)
        {
            continue;
        }
        if(a[j]<=pivot)
        {
            i++;
            while(a[i]==-1)
            {
                i++;
            }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    while(a[i+1]==-1)
    {
        i++;  
    }
    int temp=a[i+1];
    a[i+1]=a[high];
    a[high]=temp;
    return i+1;
}

void sort(int[] a,int low,int high)
{
    
    while(low<a.length-1 && a[low]==-1)
    {
        low++;
    }
    
    while(high>0 && a[high]==-1)
    {
        high--;
    }
    if(low>=high)
    {
        return;
    }
    int piv=partition(a,low,high);
    if(low!=piv-1)
       {
           sort(a,low,piv-1);
       }
    
      if(piv+1!=high){
          sort(a,piv+1,high);
      }
      
    
}
int[] sortByHeight(int[] a) {

    sort(a,0,a.length-1);
    System.out.println(Arrays.toString(a));
    return a;
}
