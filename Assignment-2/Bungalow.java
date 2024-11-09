package propertymanagement;

class Bungalow implements Property {
    String location;
    double price;

    Bungalow(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public void buy() {
        System.out.println("\n***Bungalow is buy successfully with***\n  Price: Rs."+this.price+"\n  Location: "+this.location);
    }

    public void sell() {
        System.out.println("\n***Bungalow is sold successfully with***\n  Price: Rs."+this.price+"\n  Location: "+this.location);
    }
}