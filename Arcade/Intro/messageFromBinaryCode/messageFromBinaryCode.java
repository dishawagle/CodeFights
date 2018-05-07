String messageFromBinaryCode(String code) {
    
    String res="";
    
    for(int i=0;i<=code.length()-8;i+=8)
    {
        int num=0;
        for(int j=0;j<8;j++)
        {
            num+=(Integer.parseInt(code.charAt(i+j)+"")*Math.pow(2,7-j));
        }
        System.out.println(num);
        res+=(char)num;
        
    }
    
    return res;

}
