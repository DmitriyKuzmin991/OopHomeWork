public class BottleOfWater extends Product {
    public BottleOfWater(String name, Long price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
