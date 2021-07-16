package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*public class ConsImpl implements Consumer<Integer> {

    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}*/

abstract class Main{
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,5,6,7,8);

        values.forEach(i -> System.out.println(i));
    }
    public abstract void method();
}

