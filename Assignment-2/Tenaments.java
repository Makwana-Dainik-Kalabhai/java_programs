package propertymanagement;

class Tenaments implements Property {
    String location;
    double price;

    Tenaments(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public void buy() {
        System.out.println("\n***Tenament is buy successfully with***\n  Price: Rs."+this.price+"\n  Location: "+this.location);
    }

    public void sell() {
        System.out.println("\n***Tenament is sold successfully with***\n  Price: Rs."+this.price+"\n  Location: "+this.location);
    }
}