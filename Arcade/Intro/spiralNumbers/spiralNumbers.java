int[][] spiralNumbers(int n) {
    
    int mat[][]=new int[n][n];
    int directions[][]={{0,1},{1,0},{0,-1},{-1,0}};
    int currentpos[]={0,0};
    int currentdir=0;
    for(int i=1;i<(n*n+1);i++)
    {
        mat[currentpos[0]][currentpos[1]]=i;
        int nextpos[]={currentpos[0]+directions[currentdir][0], currentpos[1]+directions[currentdir][1]};
        if(nextpos[0]>=n || nextpos[0]<0 || nextpos[1]>=n || nextpos[1]<0 || mat[nextpos[0]][nextpos[1]]!=0)
        {
            currentdir=(currentdir+1)%4;
            nextpos[0]=currentpos[0]+directions[currentdir][0];
            nextpos[1]=currentpos[1]+directions[currentdir][1];
        }
        currentpos[0]=nextpos[0];
        currentpos[1]=nextpos[1];
    }
    return mat;
    

}
