import entity.Student;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {


    public static void main(String[] args) {

        //1.stream.filter(predicate)
        List<Student> students1= StudentTest.students.stream().filter(s->s.getAge()==24).collect(Collectors.toList());
        System.out.println(students1);

        Predicate<Student> predicate =s->s.getAge()==24;
        List<Student> students2= StudentTest.students.stream().filter(s->predicate.test(s)).collect(Collectors.toList());

        System.out.println(students2);
        //2. Predicate with and // with or
        List<Student> students3= StudentTest.students.stream().filter(s->s.getAge()>=24&&s.getAge()<=26).collect(Collectors.toList());

        Predicate<Student> predicate2 =s->s.getAge()>=24;
        List<Student> students4= StudentTest.students.stream().filter(predicate.and(s->s.getAge()<=26)).collect(Collectors.toList());

        //3. Predicate with negate ==> return the opposite of the condition
        List<Student> students5= StudentTest.students.stream().filter(predicate.negate()).collect(Collectors.toList());
    }
}
