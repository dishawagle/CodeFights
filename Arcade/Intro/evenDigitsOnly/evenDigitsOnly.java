boolean evenDigitsOnly(int n) {
    
    int rem=0;
    
    while(n>0)
    {
        rem=n%10;
        n=n/10;
        if(rem%2!=0)
        {
            return false;
        }
        
    }
    
    return true;

}
