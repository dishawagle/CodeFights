int deleteDigit(int n) {
    
    String num=Integer.toString(n);
    int max=-1;
    for(int i=0;i<num.length();i++)
    {
        max=Math.max(max,Integer.parseInt(num.substring(0,i)+num.substring(i+1)));
    }

    return max;
}
