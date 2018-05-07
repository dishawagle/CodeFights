int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    
    if(upSpeed>desiredHeight)
    {
        return 1;
    }
    
    int currht=0;
    int days=0;
    while(true)
    {
        days++;
        currht+=upSpeed;
        if(currht>=desiredHeight)
        {
            return days;
        }
        currht-=downSpeed;
        
    }
    
    //return 0;
}
