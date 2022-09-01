import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {


    public static void main(String[] args) {
        //BiFunction accept 2 args Integer and return Long data type
        BiFunction<Integer, Integer, Long> func = (x1, x2) -> Long.valueOf(x1 + x2);
        Long result = func.apply(2, 3);
        System.out.println(result);

        // Replace BiFunction with BinaryOperator
        BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
        Integer result2 = func2.apply(2, 3);
        System.out.println(result2);

    }
}
