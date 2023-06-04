import java.util.ArrayList;
import java.util.Collections;
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
                new HotDrink("HotBlackTea", 30L,80,500),
                new HotDrink("HotCoffe", 50L,60,300),
                new HotDrink("HotWater", 25L,60,300),
                new HotDrink("HotGreenTea", 35L,65,600),
                new HotDrink("Glintwein", 100L,50,1000)

        ));

        Collections.sort(list2);
        list2.forEach(System.out::println);

//        HotDrinkVendingMachine vm2 = new HotDrinkVendingMachine(2);
//        vm2.initVendingMachine(list2);
//        vm2.getProduct("hotcoffe");
//        vm2.getProduct("Hotcoffe", 300, 60);
//        vm2.getProduct("hotgreentea", 600, 65);

    }
}
