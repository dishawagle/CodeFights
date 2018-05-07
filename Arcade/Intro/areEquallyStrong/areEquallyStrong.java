boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

    if(yourLeft!=friendsLeft && yourLeft!=friendsRight)
    {    return false;
    }
    
    if(yourRight!=friendsLeft && yourRight!=friendsRight)
    {    return false;
    }
    
    return true;
}
