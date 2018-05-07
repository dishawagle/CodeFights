int digitsProduct(int product) {
    
    if(product==1)
    {
        return 1;
    }
    if(product==0)
    {
        return 10;
    }
    List<Integer> li=new ArrayList<>();
    int num=0;
    for(int i=9;i>1;i--)
    {
        while(product%i==0)
        {
            li.add(i);
            product/=i;
        }
    }
    if(product>1)
    {
        return -1;
    }
for(int i=li.size()-1;i>=0;i--)
{
    num=10*num+li.get(i);
}
    
    return num;
    
}
