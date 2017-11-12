import java.util.List;

public class Warehouse {
    private List<Location> locations;
    private List<Order> orders;

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Warehouse(List<Location> locations) {
        this.locations = locations;
    }

    public int calNumberOfSKU(SKU sku) {
        int numberOfSKU = 0;

        return numberOfSKU;
    }

    public SKU getSKU(Dimension dem) {
        return null;
    }

    public List<Product> getListOfProductWaitForShip() {
        return null;
    }

}