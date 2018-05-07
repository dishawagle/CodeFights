int avg(int[][] sq,int x,int y)
{
    int sum=0;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            sum+=sq[x+i][y+j];
        }
    }
    return sum/9;
    
}
int[][] boxBlur(int[][] image) {
    
    int numrow=image.length;
    int numcol=image[0].length;
    int resrow=(numrow-2),rescol=(numcol-2);
    int[][] res=new int[resrow][rescol];
    
    for(int i=0;i<resrow;i++)
    {
        for(int j=0;j<rescol;j++)
        {
            res[i][j]=avg(image,i,j);
        }
    }
    return res;

}
