boolean isMAC48Address(String inputString) {
    
    if(inputString.length()!=17)
    {
        return false;
    }
    int i=0;
    while(i<inputString.length())
    {
        if(((i+1)%3==0) && (int)(inputString.charAt(i))!=45)
        {
            System.out.println(i);
            System.out.println("---");
            return false;
        }
        else if(((i+1)%3!=0) && Character.isDigit(inputString.charAt(i))==false && (inputString.charAt(i)>='A' && inputString.charAt(i)<='F')==false)
        {
            System.out.println(i);
            return false;
        }
        i++;
    }
    return true;

}
