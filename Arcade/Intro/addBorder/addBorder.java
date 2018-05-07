String[] addBorder(String[] picture) {
    
    String ans[]=new String[picture.length+2];
    int len=picture[0].length()+2;
    String edge="";
    for(int i=0;i<len;i++)
    {
        edge=edge+"*";
    }
    ans[0]=edge;
    ans[picture.length+1]=edge;
    for(int i=0;i<picture.length;i++)
    {
        ans[i+1]='*'+picture[i]+'*';
    }
return ans;
}
