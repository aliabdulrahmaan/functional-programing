import entity.Gender;
import entity.Student;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Student>studentSupplier=()-> new Student(1,"ali",25, Gender.MALE);
        System.out.println(studentSupplier.get());

        Supplier<Integer> randomNumbersSupp=() -> new Random().nextInt(10);
        Stream.generate(randomNumbersSupp)
                .limit(5)
                .forEach(System.out::println);


    }

}
