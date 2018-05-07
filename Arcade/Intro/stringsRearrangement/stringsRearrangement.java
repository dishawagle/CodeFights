boolean stringsRearrangement(String[] inputArray) {

    List<String> list=new ArrayList<>();
    for(String a:inputArray)
    {
        list.add(a);
    }
    
    return permute(list,0,inputArray.length);
}

boolean permute(List<String> list,int l,int r)
{
    if(l==r)
    {
        boolean ans=check(list);
        if(ans==true)
        {
            return true;
        }
    }
    else{
        for(int i=l;i<r;i++)
        {
            swap(list,l,i);
            boolean ans=permute(list,l+1,r);
            if(ans==true)
            {
                return true;
            }
            swap(list,l,i);
        }
    }
    return false;
}

void swap(List<String> list,int i,int j)
{
    String s=list.get(i);
    list.set(i,list.get(j));
    list.set(j,s);
}

boolean check(List<String> list)
{
    for(int i=0;i<list.size()-1;i++)
    {
        if(countdiff(list.get(i),list.get(i+1))==false)
        {
            return false;
        }
    }
    return true;
}

boolean countdiff(String s1,String s2)
{
    int count=0;
    for(int i=0;i<s1.length();i++)
    {
        if(s1.charAt(i)!=s2.charAt(i))
        {
            count++;
        }
    }
    
    return count==1;
}
