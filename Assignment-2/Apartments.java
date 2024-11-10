package propertymanagement;

class Apartments implements Property {
    String location;
    double price;

    Apartments(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public void buy() {
        System.out.println("\n***Apartment is buy successfully with***\n  Price: Rs."+this.price+"\n  Location: "+this.location);
    }

    public void sell() {
        System.out.println("\n***Apartment is sold successfully with***\n  Price: Rs."+this.price+"\n  Location: "+this.location);
    }
}