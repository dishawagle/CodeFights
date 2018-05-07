boolean checkPalindrome(String inputString) {
    int stringLength=inputString.length();
for (int i=0;i<stringLength/2;i++)
{
    if(inputString.charAt(i)!=inputString.charAt(stringLength-i-1))
    {
        return false;
    }
}
    return true;
}
