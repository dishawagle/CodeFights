int depositProfit(int deposit, int rate, int threshold) {

    float current=deposit;
    int yrs=0;
    while(current<threshold)
    {
        current+=(current*(rate/100.0));
        yrs++;
        System.out.println((current*(rate/100.0)));
    }
    
    return yrs;
    
    
}
