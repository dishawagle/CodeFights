int differentSquares(int[][] matrix) {
    
    Set<String> set=new HashSet<String>();
    for(int i=0;i<matrix.length-1;i++)
    {
        for(int j=0;j<matrix[0].length-1;j++)
        {
            String s=matrix[i][j]+""+matrix[i+1][j]+""+matrix[i][j+1]+""+matrix[i+1][j+1];
            set.add(s);
        }
    }
    
    return set.size();

}
