public class HotDrink extends Product{
    private int temperature;
    private int volume;

    public HotDrink(String name, Long price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }

    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return volume;
    }
}
