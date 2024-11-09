package Que3;

import java.util.*;

interface PizzaOrderSystem {
    Object[][] pizzas = {
            { "Margherita Pizza", 99.0000 },
            { "Cheese n Corn Pizza", 169.0000 },
            { "Cheese n Tomato Pizza", 169.0000 },
            { "Double Cheese Margherita Pizza", 189.0000 },
            { "Fresh Veggie Pizza", 189.0000 },
            { "Farmhouse Pizza", 229.0000 },
            { "Peppy Paneer Pizza", 229.0000 },
            { "Veggie Paradise Pizza", 229.0000 },
            { "Veg Extravaganza Pizza", 249.0000 }
    };

    void placeOrder(String pizzaType, int quantity);

    String checkOrderStatus(int orderId);

    boolean cancelOrder(int orderId);

    double calculateOrderCost(int orderId);

    Object[][] listAvailablePizzas();
}

class PizzaOrderProcessor implements PizzaOrderSystem {

    int orderId;

    ArrayList<ArrayList<Object>> orders = new ArrayList<ArrayList<Object>>();

    PizzaOrderProcessor() {
        // Default constructor
    }

    PizzaOrderProcessor(int orderId) {
        this.orderId = orderId;
    }

    public void placeOrder(String pizzaType, int quantity) {
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzaType == pizzas[i][0]) {
                orders.add(new ArrayList<>(Arrays.asList(this.orderId, pizzaType, pizzas[i][1], quantity)));
                return;
            }
        }
        System.out.println("This item is not available");
    }

    public String checkOrderStatus(int orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).contains(orderId)) {
                return "Your order is Activated";
            }
        }
        return "Please! Place your order first";
    }

    public boolean cancelOrder(int orderId) {
        orders.clear();
        return true;
    }

    public double calculateOrderCost(int orderId) {
        double sum = 0;
        double mulQuantity = 1;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).contains(orderId)) {
                mulQuantity = ((double) orders.get(i).get(2)) * ((int) orders.get(i).get(3));
                sum += mulQuantity;
            }
        }
        return sum;

    }

    public Object[][] listAvailablePizzas() {
        return pizzas;
    }
}

class PizzaOrderSystemExample {
    static void choices() {
        System.out.println("\nChoices...");
        System.out.println("1) Place Order");
        System.out.println("2) Check Order Status");
        System.out.println("3) Cancel the order");
        System.out.println("4) Get Total Cost: ");
    }

    static void printMenus() {
        PizzaOrderProcessor obj = new PizzaOrderProcessor();
        Object[][] pizzas = obj.listAvailablePizzas();

        System.out.println("\nMenu List....\n");
        for (int i = 0; i < pizzas.length; i++) {
            System.out.printf("%d): %s\n    Price: Rs.%f\n\n", i + 1, pizzas[i][0], pizzas[i][1]);
        }
    }

    public static void main(String args[]) {
        int choice, orderId = 1111, itemNo, quantity;

        PizzaOrderSystem P = new PizzaOrderProcessor(orderId);

        Scanner S = new Scanner(System.in);
        System.out.print("\nEnter 1 to place order: ");
        choice = S.nextInt();

        if (choice != 1) {
            return;
        }

        while (true) {
            switch (choice) {
                case 1:
                    printMenus();
                    System.out.println("\nPlace your order........");
                    System.out.print("Item Number: ");
                    itemNo = S.nextInt();
                    System.out.print("No. of Quantities: ");
                    quantity = S.nextInt();

                    for (int i = 0; i < P.pizzas.length; i++) {
                        if (i == (itemNo - 1)) {
                            P.placeOrder((String) P.pizzas[i][0], quantity);
                        }
                    }

                    choices();
                    System.out.print("\nEnter your choice: ");
                    choice = S.nextInt();

                    break;

                case 2:
                    System.out.println(P.checkOrderStatus(orderId));

                    choices();
                    System.out.print("\nEnter your choice: ");
                    choice = S.nextInt();
                    break;

                case 3:
                    if (P.cancelOrder(orderId)) {
                        System.out.println("\nYour order has been cancelled succefully");
                    }

                    choices();
                    System.out.print("\nEnter your choice: ");
                    choice = S.nextInt();
                    break;
                    
                    case 4:
                    if (P.calculateOrderCost(orderId) != 0) {
                        System.out.printf("\nYour total payable amount = Rs.%f", P.calculateOrderCost(orderId));
                        System.out.println("\nHave a nice day!");
                        return;
                    }
                    else {
                        System.out.println("\nPlease! Place the order first.");
                        choices();
                        System.out.print("\nEnter your choice: ");
                        choice = S.nextInt();
                    }
                    break;

                default:
                    return;
            }
        }

    }
}
