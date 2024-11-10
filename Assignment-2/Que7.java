class Flour {
    private double weight, price;

    Flour(double ...args) {
        this.weight = args[0];
        this.price = args[1];
    }

    double getWeight() {
        return this.weight;
    }

    double getPrice() {
        return this.price;
    }

    double calcPrice() {
        return weight*price;
    }
}

class FlourItem {
    Flour defaultFlour() {
        return new Flour(1, 50);
    }
}

interface FlourItemInterface {
    Flour getQuintal();
    Flour get10kg();
    Flour get1kg();
}

class FlourStore implements FlourItemInterface {
    public Flour getQuintal() {
        return new Flour(100, 45);
    }
    public Flour get10kg() {
        return new Flour(10, 48);
    }
    public Flour get1kg() {
        return new Flour(1, 50);
    }
}

class Que7 {
    public static void main(String[] args) {
        FlourItemInterface FS = new FlourStore();

        System.out.println("\n\nFlour Packet (Weight: "+FS.getQuintal().getWeight()+"KG)");
        System.out.println("----------------------------------------");
        System.out.println("Price per KG: Rs."+FS.getQuintal().getPrice());
        System.out.println("\nTotal Price: Rs."+FS.getQuintal().calcPrice());

        System.out.println("\n\nFlour Packet (Weight: "+FS.get10kg().getWeight()+"KG)");
        System.out.println("----------------------------------------");
        System.out.println("Price per KG: Rs."+FS.get10kg().getPrice());
        System.out.println("\nTotal Price: Rs."+FS.get10kg().calcPrice());

        System.out.println("\n\nFlour Packet  (Weight: "+FS.get1kg().getWeight()+"KG)");
        System.out.println("----------------------------------------");
        System.out.println("\nTotal Price: Rs."+FS.get1kg().calcPrice()+"\n\n");
    }
}