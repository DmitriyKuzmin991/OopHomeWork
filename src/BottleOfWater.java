public class BottleOfWater extends Product {
    public BottleOfWater(String name, int price) {
        super.name = name;
        super.price = price;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
