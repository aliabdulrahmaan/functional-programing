import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {



    public static void main(String[] args) {

        Consumer<Integer>consumer1=integer -> System.out.println(integer);
        Consumer<Integer>consumer2=integer -> System.out.println(integer*integer);

        List<Integer> integers= List.of(1,2,3,4,5,6);

        //1.stream.forEach(consumer)
        integers.stream().forEach(i->consumer1.accept(i));
        integers.stream().forEach(i->System.out.println(i));

        //2.Consumer with andThen()
        integers.stream().forEach(consumer1.andThen(consumer2));



    }
}
