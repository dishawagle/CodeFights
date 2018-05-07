int commonCharacterCount(String s1, String s2) {
    
    Map<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s1.length();i++)
    {
        int cnt=map.getOrDefault(s1.charAt(i),0);
        map.put(s1.charAt(i),cnt+1);
    }
    
    int commoncnt=0;
    for(int i=0;i<s2.length();i++)
    {
        int cnt=map.getOrDefault(s2.charAt(i),0);
        if(cnt>0)
        {
            commoncnt++;
            cnt-=1;
            map.put(s2.charAt(i),cnt);
        }
    }
    return commoncnt;

}
