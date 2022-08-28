import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer,String> function= i-> String.valueOf(i);
        List<Integer> integers= List.of(1,2,3,4,5,6);
        List<String> strings=integers.stream().map(function).collect(Collectors.toList());
    }
}
