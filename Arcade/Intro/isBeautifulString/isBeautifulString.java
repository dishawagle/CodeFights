boolean isBeautifulString(String inputString) {
    
    Map<Character,Integer> map=new TreeMap<>();
    for(char c='a';c<='z';c++)
    {
        map.put(c,0);
    }
    for(int i=0;i<inputString.length();i++)
    {
        int c=map.getOrDefault(inputString.charAt(i),0);
        map.put(inputString.charAt(i),c+1);
    }
    int prev=Integer.MAX_VALUE;
    for(int i:map.values())
    {
        System.out.println(i);
        if(i>prev)
        {
            return false;
        }
        prev=i;
    }
    return true;

}
