boolean isIPv4Address(String inputString) {

    
    String num="";
    int totaldots=0;
    for(int i=0;i<=inputString.length();i++)
    { 
        
        if(i==inputString.length() || inputString.charAt(i)=='.')
        {
                int number=-1;
                try{
                    number=Integer.parseInt(num);
                    System.out.println(number);
                    num="";
                    
                }
                catch (NumberFormatException e)
                {
                    return false;
                }
                if(number<0 || number>255)
                {
                    return false;
                }
                
            
        totaldots++;
        if(totaldots>4)
        {
            return false;
        }

        }
        
        else
        {
            num=num+inputString.charAt(i);
        }
            
        }
               
    if(totaldots<4)
    {
        return false;
    }
    return true;
}
