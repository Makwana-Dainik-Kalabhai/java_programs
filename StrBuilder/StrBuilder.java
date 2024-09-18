package StrBuilder;

class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("myString");
        System.out.println("Original String: " + sb);

        System.out.println("\nsb.length(): " + sb.length());

        System.out.println("\nsb.charAt() method...");
        for (int i = 0; i < sb.length(); i++) {
            System.out.printf("sb.charAt(%d): %c\n", i, sb.charAt(i));
        }

        sb.setCharAt(2, 'P');
        System.out.println("\nsb.setCharAt(2,P): " + sb);

        sb.insert(2, "New");
        System.out.println("\nsb.insert(2,\"New\"): " + sb);

        sb.delete(2, 5);
        System.out.println("\nsb.delete(2,5): " + sb);

        sb.replace(2, 3, "S");
        System.out.println("\nsb.replace(2,3,\"S\"): " + sb);

        System.out.println("\nsb.reverse(): " + sb.reverse());

        sb.append("Append");
        System.out.println("\nsb.append(\"Append\"): " + sb);

        System.out.println("\nsb.toString(): " + sb.toString());

        // !compareTo() method
        String str1 = "string";
        String str2 = "string";
        System.out.println("\nUsing str1=\"string\" & str2=\"string\"");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // If str1>str2, return +1, else if str1==str2, return 0, else return -1
        // If first char of str1=a & str2=b, str2 is greater
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1==str2: " + (str1 == str2));

        str1 = new String("string");
        str2 = new String("string");
        System.out.println("\nUsing str1=new String(\"string\") & str2=new String(\"string\")");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // If str1>str2, return +1, else if str1==str2, return 0, else return -1
        // If first char of str1=a & str2=b, str2 is greater
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1==str2: " + (str1 == str2));
    }
}