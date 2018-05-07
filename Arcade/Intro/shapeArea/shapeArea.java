int shapeArea(int n) {

    int area=n+(n-1);
    int prevArea=n+(n-1);
    n--;
    while(n>0)
    {
        prevArea=prevArea-2;
        area+=(prevArea*2);
        n--;
    }
    return area;
}
