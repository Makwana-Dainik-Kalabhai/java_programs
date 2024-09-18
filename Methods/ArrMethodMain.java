package Methods;

class ArrMethod {
    String[] arMethod() {
        String[] list = {"JAVA", "PHP", "JS", "HTML", "CSS", "Python"};

        return list;
    }
}

class ArrMethodMain {
    public static void main(String args[]) {
        ArrMethod M1 = new ArrMethod();
        System.out.println("");

        String[] arMethod = M1.arMethod();
        for(String e: arMethod) {
            System.out.print(e+", ");
        }
        System.out.println("\n");
    }
}
