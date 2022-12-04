import com.yj.animalShop.pojo.*;
import com.yj.animalShop.service.MyAnimalShop;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @Author yJade
 * @Date 2022-11-26 22:48
 * @Package PACKAGE_NAME
 */
public class ShopTest {
    @Test
    public void myAnimalTest() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("cat", 2, "male", 50.0, true));
        animals.add(new Dog("monkey", 1, "female", 20.0, false));
        animals.add(new Cat("dog", 2, "male"));
        animals.add(new Snake("dragon", 2, "male", 100.0, 500.0, false));
        //不要乱买!
        animals.add(new Snake("loong", 2, "female", 400.0, 2000.0, true));
        MyAnimalShop shop = new MyAnimalShop(200.0, animals);

        shop.bugAnimal(new Cat("elephant", 8, "female"));
        shop.bugAnimal(new Cat("mona", 0, "???"));

        shop.entertain(new Customer("joker", 1, LocalDate.now()));
        shop.entertain(new Customer("skull", 3, LocalDate.now()));
        shop.entertain(new Customer("queen", 2, LocalDate.now()));

        shop.close();
    }
}
