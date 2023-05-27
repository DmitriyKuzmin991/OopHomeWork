import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Product> list = new ArrayList<>(List.of(
//                new BottleOfWater("SaintSpring",50),
//                new BottleOfWater("BonAqua",55),
//                new BottleOfWater("AquaMinerale",70),
//                 new BottleOfWine("RedWine",120)
//                ));
//
//        VendingMachine vm = new BottleVendingMachine(1);
//        vm.initVendingMachine(list);

        List<Product> list2 = new ArrayList<>(List.of(
                new HotDrink("HotBlackTea", 20,80,500),
                new HotDrink("HotCoffe", 50,60,300),
                new HotDrink("HotGreenTea", 35,65,600),
                new HotDrink("Glintwein", 100,50,1000)

        ));
        HotDrinkVendingMachine vm2 = new HotDrinkVendingMachine(2);
        vm2.initVendingMachine(list2);
        vm2.getProduct("hotcoffe");
        vm2.getProduct("Hotcoffe", 300, 60);
        vm2.getProduct("hotgreentea", 600, 65);

    }
}
//    Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.
//� Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//соответствующий имени, объему и температуре
//� В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//воспроизвести логику заложенную в программе
//� Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре