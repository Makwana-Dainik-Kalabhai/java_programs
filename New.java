class New {
    void print(String str, String per)
    {
        if(str.length() == 0)
        {
            // System.out.println(per);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char curr = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            System.out.printf("--------------Stack %d--------------\n",i);
            System.out.println("newStr: "+newStr);
            System.out.println("per: "+(per+curr));
            print(newStr, per+curr);
        }
    }
    public static void main(String args[])
    {
        New n = new New();
        n.print("abc","");
    }
}