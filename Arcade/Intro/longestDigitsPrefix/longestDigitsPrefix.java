String longestDigitsPrefix(String inputString) {
    
    String longest="";
    int i=0;
    while(i<inputString.length() && Character.isDigit(inputString.charAt(i)))
    {
       longest+=inputString.charAt(i);
        i++;
        
    }
    return longest;

}
