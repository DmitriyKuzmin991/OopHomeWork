import java.util.ArrayList;
import java.util.List;

public class BottleVendingMachine implements VendingMachine {
    private int id;
    private List<Product> list;

    public BottleVendingMachine(int id) {
        this.id = id;
        list = new ArrayList<>();
    }

    @Override
    public void initVendingMachine(List<Product> list) {
        this.list.addAll(list);

    }

    @Override
    public Product getProduct() {
        if (list.size() == 0 ) return null;
        var temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        System.out.println(temp);
        return temp;
    }

    @Override
    public Product getProduct(String name) {
        for (Product prod : list) {
            if (prod.getName().equalsIgnoreCase(name)) {
                System.out.println(prod);
                var temp = prod;
                list.remove(prod);
                return temp;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BottleVendingMachine{" +
                "id=" + id +
                ", list=" + list +
                '}';
    }
}
