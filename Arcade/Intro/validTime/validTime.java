boolean validTime(String time) {
    
    String t[]=time.split(":");
    
    return Integer.valueOf(t[0])>=0 && Integer.valueOf(t[0])<=23 && Integer.valueOf(t[1])>=0 && Integer.valueOf(t[1])<=59;

}
