class strHandling {
    public static void main(String[] args)
    {
        String str = "This is myString";
        System.out.println("\nstr.length(): "+str.length());

        System.out.println("\nstr.toLowerCase(): "+str.toLowerCase());

        System.out.println("\nstr.toUpperCase(): "+str.toUpperCase());

        System.out.println("\nstr.substring(5,10): "+str.substring(5,10));

        System.out.println("\nstr.indexOf(\"is m\"): "+str.indexOf("is m"));

        System.out.println("\nstr.replace(\"is m\",\"             is m\"): "+str.replace("is m","             is m"));

        System.out.println("\nstr.trim(): "+str.trim());

        String[] arr = str.split(" ");
        System.out.print("\n\nString[] arr = str.split(\" \"):\t");
        for(String e: arr)
        {
            System.out.print(e+" ,");
        }

        System.out.println("\n\nstr.startsWith(\"This\"): "+str.startsWith("This"));

        System.out.println("\nstr.endsWith(\"my\"): "+str.endsWith("my"));

        System.out.println("\nstr.compareTo(\"this is myString\"): "+str.compareTo("this is myString"));

        System.out.println("\nstr.equals(\"this is myString\"): "+str.equals("this is myString"));

        System.out.println("\nstr.contains(\"is\"): "+str.contains("is"));

    }
}