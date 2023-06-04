public class BottleOfWine extends Product {
    public BottleOfWine(String name, Long price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "BottleOfWine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
