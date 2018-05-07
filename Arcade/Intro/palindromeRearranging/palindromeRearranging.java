boolean palindromeRearranging(String inputString) {

    Map<Character,Integer> map=new HashMap<>();
    for(int i=0;i<inputString.length();i++)
    {
        int cnt=map.getOrDefault(inputString.charAt(i),0);
        map.put(inputString.charAt(i),cnt+1);
    }
    int odd=0;
    for(int c:map.values())
    {
        if(c%2!=0)
        {
            odd++;
        }
    }
    if(odd>1) return false;
    return true;
}
