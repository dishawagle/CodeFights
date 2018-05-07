String[] allLongestStrings(String[] inputArray) {
    
    int maxlen=-1;
    List<String> output=new ArrayList<String>();
    for(int i=0;i<inputArray.length;i++)
    {
        if(inputArray[i].length()>=maxlen)
        {
            maxlen=inputArray[i].length();
            
        }
    }
    for(int i=0;i<inputArray.length;i++)
    {
        if(inputArray[i].length()==maxlen)
        {
            output.add(inputArray[i]);
        }
    }
    return output.toArray(new String[output.size()]);
    

}
