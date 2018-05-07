String longestWord(String text) {
int len=0;
    String longest="";
    int i=0;
    while(i<text.length())
    {
        String word="";
        while(i<text.length() && Character.isLetter(text.charAt(i)))
              {
                  word+=text.charAt(i);
                  i++;
              }
        if(word!="")
              {
                  if(word.length()>len)
                  {
                      len=word.length();
                      longest=word;
                  }
              }
            else{
                i++;
            }
    }
              
              return longest;
}
