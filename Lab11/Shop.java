import java.util.ArrayList;

public class Shop {
    private String name;
    private Catalog catalog;
    private ArrayList<Basket> ordersToday;

    public Shop(String n) {
        name = n;
        catalog = new Catalog();
        ordersToday = new ArrayList<>();

        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);

        System.out.println("Shop " + name + " has been created.");
        showCatalog();
    }

    public void showCatalog() {
        catalog.showCatalog();
    }

    public Product getProduct(String pName) {
        return catalog.retrieveProduct(pName);
    }

    public int getPrice(String pName) {
        return catalog.retrievePrice(pName);
    }

    public Basket newCustomerArrives() {
        System.out.println("Welcome to " + name);
        showCatalog();
        return new Basket();
    }

    public void checkOut(Basket b) {    
        b.showItemsInBasket();
        System.out.println("I am cashier");
        b.printInvoice();
        ordersToday.add(b);
    }

    public void checkOut(Basket b, String pName) {
        System.out.println("Quickly put it in his shopping bag");
        b.putInBasket(new LineItem(catalog.retrieveProduct(pName), 1, catalog.retrievePrice(pName)));
        b.printInvoice();
        System.out.println("leave the store");
        ordersToday.add(b);
    }

    public void dailySalesReport() {
        System.out.println("=== Daily Sales Report for " + name + " ===");
        int grandTotal = 0;
        for (Basket b : ordersToday) {
            b.printInvoice();
        }
        System.out.println("Total orders today: " + ordersToday.size());
    }
}
