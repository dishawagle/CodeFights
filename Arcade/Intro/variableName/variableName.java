boolean variableName(String name) {

    if(Character.isDigit(name.charAt(0)))
    {
        return false;
    }
    for(int i=0;i<name.length();i++)
    { 
        if(Character.isLetter(name.charAt(i))==false && Character.isDigit(name.charAt(i))==false && name.charAt(i)!='_')
                {
                    return false;
                }
    }
                
                return true;
}
