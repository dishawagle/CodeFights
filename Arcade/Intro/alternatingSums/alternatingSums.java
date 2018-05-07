int[] alternatingSums(int[] a) {
    
    int ans[]={0,0};
    for(int i=0;i<a.length;i+=2)
    {
        ans[0]+=a[i];
        if((i+1)<a.length)
        {
            ans[1]+=a[i+1];
        }
    }
    
    return ans;

}
