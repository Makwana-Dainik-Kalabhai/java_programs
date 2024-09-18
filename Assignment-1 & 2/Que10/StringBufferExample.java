package Que10;

class StringBufferExample {
    public static void main(String args[])
    {
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");
        System.out.println("\nOriginal String: "+stringBuffer);
        
        //! append Method
        System.out.println("\n1) stringBuffer.append(\" Welcome to Java!\"):  "+stringBuffer.append(" Welcome to Java!"));

        //! insert Method
        System.out.println("\n2) stringBuffer.insert(12,\"from \"):  "+stringBuffer.insert(12, "from "));
        
        //! replace Method
        System.out.println("\n3) stringBuffer.replace(7,12,\"Universe\"):  "+stringBuffer.replace(7, 12, "Universe"));

        //! setCharAt Method
        stringBuffer.setCharAt(0, 'h'); //* It not returns any value */
        System.out.println("\n4) stringBuffer.setCharAt(0, 'h'):  "+stringBuffer);

        //! delete Method
        System.out.println("\n5) stringBuffer.delete(2,5):  "+stringBuffer.delete(2, 5));

        //! deleteCharAt()
        System.out.println("\n6) stringBuffer.deleteCharAt(10):  "+stringBuffer.deleteCharAt(10));

        //! reverse Method
        System.out.println("\n7) stringBuffer.reverse():  "+stringBuffer.reverse());

        //! toString Method
        System.out.println("\n8) stringBuffer.toString():  "+stringBuffer.toString());

        //! length Method
        System.out.println("\n9) stringBuffer.length():  "+stringBuffer.length());

        //! length Method
        System.out.println("\n10) stringBuffer.capacity():  "+stringBuffer.capacity()+"\n\n");
    }
}
