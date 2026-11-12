            import java.util.ArrayList;
import java.util.function.Consumer;

public class Basket {
    private ArrayList<LineItem> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void putInBasket(LineItem line) {
        items.add(line);
    }

    public void showItemsInBasket() {
        System.out.println("This basket contains");
        loopLineItem(line -> {
            System.out.println(line.getQuantity() + " of " +
                    line.getProduct().getPName() + " @= " + line.calculateAmount() / line.getQuantity());
        });
    }

    public void printInvoice() {
        System.out.println("invoice header");
        int[] total = {0};
        loopLineItem(line -> {
            System.out.println(line.getProduct().getPName() + " x " +
                    line.getQuantity() + " " + line.calculateAmount());
            total[0] += line.calculateAmount();
        });
        System.out.println("Total is " + total[0] + "******");
    }

    private void loopLineItem(Consumer<LineItem> action) {
        for (LineItem line : items) {
            action.accept(line);
        }
    }
}