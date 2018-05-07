int sumUpNumbers(String inputString) {
    
    int sum=0;
    int i=0;
    while(i<inputString.length())
    {
        String num="";
        while(i<inputString.length() && Character.isDigit(inputString.charAt(i))==true)
        {
            num+=inputString.charAt(i);
            i++;
        }
        if(num!="")
        {
            sum+=Integer.valueOf(num);
        }
        else{
            i++;
        }
        
    }
    
    return sum;

}
