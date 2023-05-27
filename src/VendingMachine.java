import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected int id;
    protected List<Product> list;

    public VendingMachine(int id) {
        this.id = id;
        this.list = new ArrayList<>();
    }
    public void initVendingMachine(List<Product> list) {
        this.list = list;
    }
    public Product getProduct() {
        if (list.size() == 0) {
            return null;
        }
        int index = list.size() - 1;
        Product prod = list.get(index);
        list.remove(index);
        System.out.println(prod);
       return prod;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "id=" + id +
                ", list=" + list +
                '}';
    }
}
