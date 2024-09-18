package Methods;
class StringMethod {
    public static void main(String args[]) {
        String name = "Dainik";
        System.out.println("Length: " + name.length());

        System.out.println("In Lowercase: " + name.toLowerCase());
        System.out.println("In Uppercase: " + name.toUpperCase());

        String newName = "      Dainik    ";
        System.out.println("Without trim: " + newName);
        System.out.println("With trim: " + newName.trim());

        System.out.println("Substring starts with 5 index: " + name.substring(2));
        System.out.println("Substring starts with 5 & end with 9 index: " + name.substring(1, 4));
        // 9 is not included in name.substring(5,9), if index goes to outof range return
        // error

        System.out.println("Replace i with e: " + name.replace("ainik", "enny"));

        System.out.println("Whether a name is starts with dai: " + name.startsWith("dai"));
        System.out.println("Whether a name is ends with nik: " + name.endsWith("nik"));

        System.out.println("charAt(7) in name: " + name.charAt(3));
        System.out.println("indexOf('i') in name: " + name.indexOf('i'));
        // Searchs from start, Returns first character., if char isn't available in
        // string, returns -1

        System.out.println("indexOf('i',4) in name: " + name.indexOf('i', 2));
        // Start searching from index-4

        System.out.println("lastIndexOf('i') in name: " + name.lastIndexOf('i'));
        // search from end, Returns first character., if char isn't available in string,
        // returns -1

        System.out.println("lastIndexOf('i',10) in name: " + name.lastIndexOf('i', 5));
        // Search until index-10

        System.out.println("name is equals to dainik(not ignoring case): " + name.equals("dainik"));
        // This method is case-sensitive, so you below method
        System.out.println("name is equals to dainik(ignoring case): " + name.equalsIgnoreCase("dainik"));

        System.out.println("Original name: " + name);

        System.out.println("\n\nExercise......\n");
        System.out.println("Replace spaces with _ : " + newName.replace(' ', '_'));

    }
}