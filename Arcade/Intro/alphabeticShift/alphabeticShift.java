String alphabeticShift(String inputString) {

    String result="";
    for(int i=0;i<inputString.length();i++)
    {
        char c=(char)((inputString.charAt(i)-'a'+1)%26+'a');
        System.out.println(c);
        result+=(c);
    }
    return result;
}
