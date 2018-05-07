int makeArrayConsecutive2(int[] statues) {
int max=statues[0],min=statues[0];
int len=statues.length;
for(int i=0;i<len;i++)
{
    if(statues[i]>max)
    {
        max=statues[i];
    }
    if(statues[i]<min)
    {
        min=statues[i];
    }
}
    return (max-min+1)-len;
}
