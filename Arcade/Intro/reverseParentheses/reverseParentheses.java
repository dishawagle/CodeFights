String reverseParentheses(String s) {
    
    Stack<Character> st=new Stack<Character>();
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!=')')
        {
            st.push(s.charAt(i));
        }
        else if(s.charAt(i)==')')
        {
            String temp="";
            while(!st.empty() && st.peek()!='(')
            {
                temp=temp+st.pop();
            }
            if(st.peek()=='(')
            {
                st.pop();
            }
            for(int j=0;j<temp.length();j++)
            {
                st.push(temp.charAt(j));
            }
            
        }
    }
    String revstr="";
    while(!st.empty())
    {
        revstr=st.pop()+revstr;
    }
    return revstr;

}
