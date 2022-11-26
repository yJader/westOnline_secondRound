import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @Author yJade
 * @Date 2022-11-26 21:54
 * @Package PACKAGE_NAME
 */
public class BasicTest {
    @Test
    public void testArrayList() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1); integers.add(2); integers.add(3);

        Integer in = integers.get(2);
        in = 1;
        integers.forEach(System.out::println);
    }
}
