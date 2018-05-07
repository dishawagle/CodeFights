boolean checkValid(char c1,char c2)
{
    if(c1>='a' && c1<='h' && c2>='1' && c2<='8')
    {
        return true;
    }
    
    return false;
}
int chessKnight(String cell) {

    int ans=0;
    
    char c[]={cell.charAt(0),cell.charAt(1)};
    int c1[]={1,-1};
    int c2[]={2,-2};
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            if(checkValid((char)((int)c[0]+c1[i]),(char)((int)c[1]+c2[j]))==true)
            {
                ans++;
            }
            if(checkValid((char)((int)c[0]+c2[j]),(char)((int)c[1]+c1[i]))==true)
            {
                ans++;
            }
            
        }
    }
    return ans;
    
}
