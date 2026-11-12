import java.util.LinkedHashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;

    public Catalog() {
        productList = new LinkedHashMap<>();
        priceList = new LinkedHashMap<>();
    }

    public Product retrieveProduct(String pName) {
        return productList.get(pName);
    }

    public int retrievePrice(String pName) {
        return priceList.getOrDefault(pName, 0);
    }

    public void add(Product item, int p) {
        if (!productList.containsKey(item.getPName())) {
            productList.put(item.getPName(), item);
            priceList.put(item.getPName(), p);
        }
    }

    public void showCatalog() {
        for (String name : productList.keySet()) {
            System.out.println(name + " @ " + priceList.get(name));
        }
    }
}
