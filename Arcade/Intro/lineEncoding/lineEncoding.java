String lineEncoding(String s) {
    
    int i=0;
    String ans="";
    while(i<s.length())
    {
        char temp=s.charAt(i);
        int len=1;
        while(i+1<s.length() && s.charAt(i+1)==s.charAt(i))
        {
            len++;
            i++;
        }
        if(len!=1)
        {
            System.out.println(temp);
            System.out.println(len);
            ans+=Integer.toString(len);
            ans+=temp;
        }
        else{
            ans+=temp;
        }
        i++;
            
    }
    return ans;

}
