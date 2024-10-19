class Subsequence {
    static void subsequence(String str, int i,String newStr)
    {
        if(i==str.length())
        {
            System.out.println("newStr: "+newStr);
            return;
        }
        char curr = str.charAt(i);
            System.out.println("Add");
        subsequence(str,i+1,newStr+curr);
            System.out.println("Not Add");
        subsequence(str,i+1,newStr);
    }
    public static void main(String[] a)
    {
        subsequence("abc",0,"");
    }
}