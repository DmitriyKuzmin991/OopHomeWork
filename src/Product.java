public abstract class Product implements Comparable<Product> {
    protected String name;
    protected Long price;

    public Product(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice() - o.getPrice());
    }
}
