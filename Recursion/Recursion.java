class Recursion {
    int fact(int n)
    {
        if(n==1||n==0)
          return 1;

        System.out.printf("\n%d-fact(%d-1): %d",n,n,(n-fact(n-1)));
        //n=10
        //10-(10-1)
            //9-(9-1)
              //8-(8-1)
                //7-(7-1)
                    //6-(6-1)
                        //5-(5-1)
                            //4-(4-1)
                                //3-(3-1)
                                    //2-(2-1)=1
                                    //3-1=2
                                    //4-2=2
                                    //5-2=3
                                    //6-3=3
                                    //7-3=4
                                    //8-4=4
                                    //9-4=5
                                    //10-5=5
                                    //retun (n-(fact(n-1)))=5;
        return 0;

    }
    public static void main(String[] args)
    {
        Recursion R = new Recursion();
        System.out.println("\n\nMain Function: "+R.fact(10));
    }
}