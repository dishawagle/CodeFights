String buildPalindrome(String st) {
    
    if(checkPalindrome(st))
    {
        return st;
    }
    
    for(int i=0;i<st.length();i++)
    {
        String temp=st+reverse(st.substring(0,i+1));
        boolean ans=checkPalindrome(temp);
        if(ans==true)
        {
            return temp;
        }
    }
    
    return st+reverse(st);

}

String reverse(String s)
{
    String ans="";
    for(int i=0;i<s.length();i++)
    {
        ans=s.charAt(i)+ans;
    }
    return ans;
}

boolean checkPalindrome(String s)
{
    for(int i=0;i<s.length()/2;i++)
    {
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            return false;
        }
    }
    return true;
}
