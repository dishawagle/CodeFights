boolean sudoku(int[][] grid) {

    
    for(int i=0;i<9;i++)
    {
        int row[]=new int[9];
        int sq[]=new int[9];
        int col[]=grid[i].clone();
        
        for(int j=0;j<9;j++)
        {
            row[j]=grid[j][i];
            sq[j]=grid[(i/3)*3+j/3][i*3%9+j%3];
        }
        
        if(!(validate(row) && validate(col) && validate(sq)))
        {
            return false;
        }
    }
    return true;
}

boolean validate(int arr[])
{
    int i=0;
    Arrays.sort(arr);
    for(int num:arr)
    {
        if(num!=++i)
        {
            return false;
        }
    }
    return true;
}
