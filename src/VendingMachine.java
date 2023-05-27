
import java.util.List;

public interface VendingMachine {
    public void initVendingMachine(List<Product> list);
    public Product getProduct();
    public Product getProduct(String name);
}
