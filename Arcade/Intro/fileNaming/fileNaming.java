String[] fileNaming(String[] names) {
    
    List<String> li=new ArrayList<>();
    
    for(String i:names)
    { 
        //System.out.println(i);
        if(li.contains(i)==false)
        {
            li.add(i);
        }
        else{
            int k=1;
            
            String newname=i+"("+Integer.valueOf(k)+")";
            //System.out.println(newname);
            while(li.contains(newname)==true)
            {
                k++;
                newname=i+"("+Integer.valueOf(k)+")";
            }
            
            li.add(newname);
            
        }
    }
    String res[]=new String[li.size()];
    return li.toArray(res);
}
