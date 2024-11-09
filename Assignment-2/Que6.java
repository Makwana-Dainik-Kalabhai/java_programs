package propertymanagement;

class Que6 {
    public static void main(String[] args) {
        Property P[] = new Property[6];
        P[0] = new Apartments("Green City, Gandhinagar",500000);
        P[1] = new Bungalow("Haven, New Ranip", 2255000);
        P[2] = new Tenaments("Mangalmurti Heights, Chandkheda", 1490000);

        for(int i=0; i<3; i++) {
            P[i].buy();
            P[i].sell();
            System.out.println("\n----------------------------------------------------");
        }
    }
}