import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product prod1 = new BottleOfWater("SaintSpring",50);
        Product prod2 = new BottleOfWater("BonAqua",55);
        Product prod3 = new BottleOfWater("AquaMinerale",70);
        list.add(prod1);
        list.add(prod2);
        list.add(prod3);
        VendingMachine vm = new VendingMachine(1);
        vm.initVendingMachine(list);
        System.out.println(vm);




    }
}
//    Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
//    сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
//        ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)