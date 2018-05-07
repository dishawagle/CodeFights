int digitDegree(int n) {
    if(n>=0 && n<=9)
    {
        return 0;
    }
    int newn=0;
    while(n>0)
    {
        newn+=(n%10);
        n=n/10;
    }
    
    return 1+digitDegree(newn);

}
