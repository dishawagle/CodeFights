boolean isLucky(int n) {
    
    String str=String.valueOf(n);
    int rightsum=0,leftsum=0;
    for(int i=0;i<str.length()/2;i++)
    {
        leftsum+=Integer.valueOf(str.charAt(i));
        rightsum+=Integer.valueOf(str.charAt(str.length()-i-1));
    }
    
    return leftsum==rightsum;

}
